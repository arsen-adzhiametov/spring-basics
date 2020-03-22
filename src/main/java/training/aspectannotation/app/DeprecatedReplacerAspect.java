package training.aspectannotation.app;

import training.annotationbased.quoters.annotations.MyDeprecated;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;

/**
 * Created by Arsen Adzhiametov on 22-Jun-14 in IntelliJ IDEA.
 */
@Aspect
public class DeprecatedReplacerAspect {

    @Around("execution((@training.annotationbased.quoters.annotations.MyDeprecated *) training.aspectannotation.app.*.*(..))")
    public Object handleDeprecatedClass(ProceedingJoinPoint joinPoint) throws Throwable{
        String methodName = joinPoint.getSignature().getName();
        System.out.println("Entering in method  = " + methodName);
        try {
            Object retVal = joinPoint.proceed();
            MyDeprecated ann = retVal.getClass().getAnnotation(MyDeprecated.class);
            if (ann !=null){
                Object newRetVal = ann.newClass().newInstance();
                return newRetVal;
            } else return retVal;

        } finally {
            System.out.println("Exiting method");
        }
    }

}
