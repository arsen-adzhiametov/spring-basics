package training.validationcustom;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class CheckCaseValidation implements ConstraintValidator<CheckCase, String> {

    private CaseType caseType;

    @Override
    public void initialize(CheckCase checkCase) {
        caseType = checkCase.value();
    }

    @Override
    public boolean isValid(String s, ConstraintValidatorContext constraintValidatorContext) {
        if (CaseType.UPPER_CASE == caseType) {
            return s.equals(s.toUpperCase());
        } else if (CaseType.LOWER_CASE == caseType) {
            return s.equals(s.toLowerCase());
        }
        return false;
    }
}
