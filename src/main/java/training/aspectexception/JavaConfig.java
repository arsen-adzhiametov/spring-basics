package training.aspectexception;

import org.springframework.context.annotation.*;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

/**
 * Created by Arsen Adzhiametov on 22-Jun-14 in IntelliJ IDEA.
 */
@Configuration
@EnableAspectJAutoProxy
@PropertySource("classpath:mails.properties")
public class JavaConfig {

    @Bean
    public DatabaseService databaseService(){
        return new DatabaseServiceImpl();
    }

    @Bean HighLevelService highLevelService(){
        HighLevelServiceImpl highLevelService = new HighLevelServiceImpl();
        highLevelService.setDatabaseService(databaseService());
        return highLevelService;
    }

    @Bean
    public ExceptionHandlingAspect exceptionAspect(){
        return new ExceptionHandlingAspect();
    }

    @Bean
    public PropertySourcesPlaceholderConfigurer configurer(){
        return new PropertySourcesPlaceholderConfigurer();
    }

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);
        HighLevelService service = context.getBean(HighLevelService.class);
        service.doWork();
    }
}
