package training.validationcustomother;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class CheckLoginCredentials implements ConstraintValidator<ValidLoginCredentials, Login>{
    @Override
    public void initialize(ValidLoginCredentials validLoginCredentials) {}

    @Override
    public boolean isValid(Login login, ConstraintValidatorContext constraintValidatorContext) {
        return login.getId().length() > login.getPassword().length();
    }
}
