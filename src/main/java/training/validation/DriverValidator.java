package training.validation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.validation.ConstraintViolation;
import javax.validation.Validator;
import java.util.Set;

@Component
public class DriverValidator {

    @Autowired
    private Validator validator;

    public void printAllErrorMessages(CarDriver driver){
        Set<ConstraintViolation<CarDriver>> results = validator.validate(driver);
        for (ConstraintViolation<CarDriver> violation : results) {
            System.err.println(violation.getMessage());
        }
    }

    public void printErrorMessages(DriverService driverService){
        Set<ConstraintViolation<DriverService>> results = validator.validate(driverService);
        for (ConstraintViolation<DriverService> violation : results) {
            System.err.println(violation.getMessage());
        }
    }
}
