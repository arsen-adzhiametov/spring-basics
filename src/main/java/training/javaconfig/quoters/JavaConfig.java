package training.javaconfig.quoters;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

/**
 * Created by Arsen Adzhiametov on 10-Jun-14 in IntelliJ IDEA.
 */
@Configuration
@ComponentScan(basePackages = {"training.javaconfig.quoters"})
@PropertySource("classpath:quotes.properties")
public class JavaConfig {

    @Bean
    public PropertySourcesPlaceholderConfigurer configurer(){
        return new PropertySourcesPlaceholderConfigurer();
    }
}
