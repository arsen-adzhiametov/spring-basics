package training.validationcustom;

import javax.validation.Constraint;
import javax.validation.Payload;
import javax.validation.constraints.Size;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@CheckCase(value = CaseType.UPPER_CASE, message = "Should be UPPERCASE")
@Size(min = 5, max = 15, message = "Should be in range 5...15")
@Constraint(validatedBy = {})
@Retention(RetentionPolicy.RUNTIME)
public @interface ManagerName {

    String message() default "not manager name";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}
