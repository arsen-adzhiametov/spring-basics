package training.validationcustomother;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.validation.ConstraintViolation;
import javax.validation.Validator;
import java.util.Set;

@Component
public class UserValidator {

    @Autowired
    Validator validator;

    public void printErrors(User user){
        Set<ConstraintViolation<User>> constraintViolations = validator.validate(user);

        for(ConstraintViolation<User> violation : constraintViolations){
            System.err.println(violation.getMessage());
        }
    }
}
