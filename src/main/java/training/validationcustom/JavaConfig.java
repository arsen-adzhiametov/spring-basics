package training.validationcustom;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.validation.beanvalidation.LocalValidatorFactoryBean;

import javax.validation.ConstraintViolation;
import javax.validation.Validator;
import java.util.Set;

@Configuration
@ComponentScan("training.validationcustom")
public class JavaConfig {

    @Bean
    public LocalValidatorFactoryBean validatorFactoryBean() {
        return new LocalValidatorFactoryBean();
    }

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);
        Validator validator = context.getBean(Validator.class);
        Set<ConstraintViolation<Person>> constraintViolations = validator.validate(new Person("vasy"));
        for (ConstraintViolation<Person> violation : constraintViolations){
            System.err.println(violation.getMessage());
        }
    }
}
