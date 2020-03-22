package training.validationcustomother;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Constraint(validatedBy = CheckLoginCredentials.class)
@Retention(RetentionPolicy.RUNTIME)
public @interface ValidLoginCredentials {

    String message() default "password should be shorter then id";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}
