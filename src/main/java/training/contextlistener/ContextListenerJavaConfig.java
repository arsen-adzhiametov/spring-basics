package training.contextlistener;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by Arsen Adzhiametov on 22-Jun-14 in IntelliJ IDEA.
 */
@Configuration
public class ContextListenerJavaConfig {

    @Bean
    public MyBean myBean(){
        return new MyBean();
    }

    @Bean
    public MyApplicationListener myApplicationListener(){
        MyApplicationListener myApplicationListener = new MyApplicationListener();
        myApplicationListener.setMyBean(myBean());
        return myApplicationListener;
    }

    public static void main(String[] args) {
        new AnnotationConfigApplicationContext(ContextListenerJavaConfig.class);
    }
}
