package training.dependingbeans;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by Arsen Adzhiametov on 15-Jun-14 in IntelliJ IDEA.
 */
public class DependingRunner {

    public static void main(String[] args) {
        new AnnotationConfigApplicationContext(DependingJavaConfig.class);
    }
}
