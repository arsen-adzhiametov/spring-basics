package training.annotationbased.db;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by Arsen Adzhiametov on 09-Jun-14 in IntelliJ IDEA.
 */
public class Runner {
    public static void main(String[] args) {
        new AnnotationConfigApplicationContext("training.annotationbased");
    }
}
