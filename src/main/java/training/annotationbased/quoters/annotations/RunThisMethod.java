package training.annotationbased.quoters.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Created by Arsen Adzhiametov on 18-May-14 in IntelliJ IDEA.
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface RunThisMethod {

    public int repeat();
}
