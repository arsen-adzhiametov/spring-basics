package training.spring.beanpostprocessor;

import training.spring.annotations.Benchmark;
import training.spring.annotations.Transaction;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.cglib.proxy.InvocationHandler;
import org.springframework.cglib.proxy.Proxy;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Arsen Adzhiametov on 30-May-14 in IntelliJ IDEA.
 */
public class BenchmarkBeanPostProcessor implements BeanPostProcessor {

    private Map<String, Class> annotated = new HashMap<String, Class>();

    @Override
    public Object postProcessBeforeInitialization(Object o, String s) throws BeansException {
        Class<?> aClass = o.getClass();
        if(isAnnotationPresentOnMethod(aClass)) {
            annotated.put(s, aClass);
        }
        return o;
    }

    @Override
    public Object postProcessAfterInitialization(final Object object, String s) throws BeansException {
        final Class clazz = annotated.get(s);
        if (clazz!=null) {
            return Proxy.newProxyInstance(
                    clazz.getClassLoader(),
                    clazz.getInterfaces(),
                    new InvocationHandler() {
                @Override
                public Object invoke(Object proxy, Method method, Object[] objects) throws InvocationTargetException,
                        IllegalAccessException, NoSuchMethodException {
                    Method originalMethod = clazz.getMethod(method.getName(), method.getParameterTypes());
                    if(originalMethod.isAnnotationPresent(Benchmark.class)) {
                        long startTime = System.nanoTime();
                        Object retVal = method.invoke(object, objects);
                        long finishTime = System.nanoTime();
                        System.out.println("*** " + method.getName() + " take " + (finishTime - startTime) + " ns ***");
                        return retVal;
                    }else return method.invoke(object, objects);
                }
            });
        }
        return object;
    }

    private boolean isAnnotationPresentOnMethod(Class clazz){
        Method[] methods = clazz.getDeclaredMethods();
        for(Method method : methods){
            if(method.isAnnotationPresent(Transaction.class)){
                return true;
            }
        }
        return false;
    }
}
