package training.annotationbased.quoters.beanpostprocessor;

import training.annotationbased.quoters.annotations.Transaction;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.cglib.proxy.InvocationHandler;
import org.springframework.cglib.proxy.Proxy;
import org.springframework.stereotype.Component;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Arsen Adzhiametov on 31-May-14 in IntelliJ IDEA.
 */
@Component
public class TransactionalBeanPostProcessor implements BeanPostProcessor {

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
                            if (originalMethod.isAnnotationPresent(Transaction.class)) {
                                System.out.println("***TRANSACTION OPENED***");
                                Object retVal = method.invoke(object, objects);
                                System.out.println("***TRANSACTION CLOSED***");
                                return retVal;
                            } else return method.invoke(object, objects);
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
