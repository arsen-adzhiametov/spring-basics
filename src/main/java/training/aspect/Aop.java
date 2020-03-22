package training.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

/**
 * Created by Arsen Adzhiametov on 15-Jun-14 in IntelliJ IDEA.
 */
@Aspect
public class Aop {

    @Pointcut("execution(* training..*.foo(..))")
    public void pointcut(){}

    @Before("pointcut()")
    public void beforeInit(){
        System.err.println("Print method will be called now");
    }

}
