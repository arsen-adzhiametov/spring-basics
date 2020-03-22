package training.javaconfig.colors;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by Arsen Adzhiametov on 01-Jun-14 in IntelliJ IDEA.
 */
public class ColorRunnerWithJavaConfig {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
        for (int i = 0; i < 100; i++) {
            context.getBean(ColoredFrame.class);
        }
    }
}
