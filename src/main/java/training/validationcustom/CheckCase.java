package training.validationcustom;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Constraint(validatedBy = CheckCaseValidation.class)
@Retention(RetentionPolicy.RUNTIME)
public @interface CheckCase {

    CaseType value();

    String message();

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}
