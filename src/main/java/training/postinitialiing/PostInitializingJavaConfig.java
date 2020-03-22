package training.postinitialiing;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Created by Arsen Adzhiametov on 22-Jun-14 in IntelliJ IDEA.
 */
@Configuration
@ComponentScan("training.postinitialiing")
public class PostInitializingJavaConfig {

    @Bean
    public MyBean myBean(){
        return new MyBean();
    }

    @Bean
    public PostInitializingAppListener postInitializingAppListener(){
        return new PostInitializingAppListener();
    }

    public static void main(String[] args) {
        new AnnotationConfigApplicationContext(PostInitializingJavaConfig.class);
    }

}
