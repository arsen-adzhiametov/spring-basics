package training.postinitialiing;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * Created by Arsen Adzhiametov on 22-Jun-14 in IntelliJ IDEA.
 */
public class PostInitializingAppListener implements ApplicationListener<ContextRefreshedEvent> {
    @Override
    public void onApplicationEvent(ContextRefreshedEvent event) {
        String[] allBeans = event.getApplicationContext().getBeanDefinitionNames();
        for(String value : allBeans){
            Object bean = event.getApplicationContext().getBean(value);
            Method[] declaredMethods = bean.getClass().getDeclaredMethods();
            for(Method method : declaredMethods) {
                if(method.isAnnotationPresent(PostInitialized.class)){
                    try {
                        method.invoke(bean);
                    } catch (IllegalAccessException e) {
                        e.printStackTrace();
                    } catch (InvocationTargetException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }
}
