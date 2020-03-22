package training.aspect;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by Arsen Adzhiametov on 15-Jun-14 in IntelliJ IDEA.
 */
public class AopRunner {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AopAppConfig.class);
        SomeSpringBean someSpringBean = context.getBean(SomeSpringBean.class);
        someSpringBean.foo();
    }
}
