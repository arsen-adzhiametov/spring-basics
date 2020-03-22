package training.annotationbased.quoters.beanpostprocessor;

import training.annotationbased.quoters.annotations.RunThisMethod;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * Created by Arsen Adzhiametov on 30-May-14 in IntelliJ IDEA.
 */
public class RunThisMethodAnnotationBeanPostProcessor implements BeanPostProcessor {

    @Override
    public Object postProcessBeforeInitialization(Object o, String s) throws BeansException {
        Class clazz = o.getClass();
        for(Method method : clazz.getDeclaredMethods()){
            RunThisMethod annotation = method.getAnnotation(RunThisMethod.class);
            if (annotation!=null){
                int count = annotation.repeat();
                for(int i = 0; i < count; i++){
                    try {
                        method.invoke(o, null);
                    } catch (IllegalAccessException e) {
                        e.printStackTrace();
                    } catch (InvocationTargetException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
        return o;
    }

    @Override
    public Object postProcessAfterInitialization(Object o, String s) throws BeansException {
        return o;
    }
}
