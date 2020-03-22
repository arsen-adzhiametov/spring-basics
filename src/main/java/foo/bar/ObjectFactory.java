package foo.bar;

import training.spring.annotations.RunThisMethod;
import org.springframework.stereotype.Component;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * Created by Arsen Adzhiametov on 18-May-14 in IntelliJ IDEA.
 */
@Component
public class ObjectFactory {

    public static <T> T createObject(Class<T> classs){
        T object = null;
        try {
            object = classs.newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        for (Method method : classs.getDeclaredMethods()) {
            if(method.isAnnotationPresent(RunThisMethod.class)){
                RunThisMethod annotation = method.getAnnotation(RunThisMethod.class);
                int repeat = annotation.repeat();
                for (int i = 0; i < repeat; i++) {
                    try {
                        method.invoke(object);
                    } catch (IllegalAccessException e) {
                        e.printStackTrace();
                    } catch (InvocationTargetException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
       return object;
    }
}
