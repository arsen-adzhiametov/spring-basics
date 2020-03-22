package training.aspectexception;

import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.beans.factory.annotation.Value;

/**
 * Created by Arsen Adzhiametov on 22-Jun-14 in IntelliJ IDEA.
 */
@Aspect
public class ExceptionHandlingAspect {

    @Value("${dbaMails}")
    private String[] mails;

    @Pointcut("execution(void training.aspectexception.*.*(..))")
    public void exceptionHandling(){}

    @AfterThrowing(pointcut = "exceptionHandling()", throwing = "ex")
    public void afterThrowingInSaveData(DatabaseRuntimeException ex){
        System.out.println("I'm exception handler. We get " + ex.getMessage());
        for(String mail : mails){
            System.out.println("Sending mail to " + mail);
        }
    }
}
