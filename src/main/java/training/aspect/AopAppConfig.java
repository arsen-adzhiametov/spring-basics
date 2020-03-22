package training.aspect;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * Created by Arsen Adzhiametov on 15-Jun-14 in IntelliJ IDEA.
 */
@Configuration
@EnableAspectJAutoProxy
public class AopAppConfig {

    @Bean
    public Aop aop(){
        return new Aop();
    }

    @Bean
    public SomeSpringBean someSpringBean(){
        return new SomeSpringBean();
    }
}
