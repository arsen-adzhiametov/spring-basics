package training.dependingbeans;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.DependsOn;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

/**
 * Created by Arsen Adzhiametov on 15-Jun-14 in IntelliJ IDEA.
 */
@Configuration
@PropertySource("classpath:files.properties")
public class DependingJavaConfig {

    @Bean
    @DependsOn("fileCreator")
    public FileReader fileReader(){
        return new FileReader();
    }

    @Bean
    public FileCreator fileCreator(){
        return new FileCreator();
    }

    @Bean
    public PropertySourcesPlaceholderConfigurer configurer(){
        return new PropertySourcesPlaceholderConfigurer();
    }

}
