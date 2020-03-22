package training.validation;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.validation.beanvalidation.LocalValidatorFactoryBean;

@Configuration
@ComponentScan("training.validation")
public class JavaConfig {

    @Bean
    public LocalValidatorFactoryBean validatorFactoryBean() {
        return new LocalValidatorFactoryBean();
    }

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);
        DriverValidator driverValidator = context.getBean(DriverValidator.class);
        CarDriver driver = new CarDriver(null, 1, false);
        DriverService driverService = new DriverService(driver);
        driverValidator.printErrorMessages(driverService);
    }
}
