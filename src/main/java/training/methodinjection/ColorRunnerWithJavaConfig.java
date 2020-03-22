package training.methodinjection;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.concurrent.TimeUnit;

/**
 * Created by Arsen Adzhiametov on 01-Jun-14 in IntelliJ IDEA.
 */
public class ColorRunnerWithJavaConfig {

    public static void main(String[] args) throws InterruptedException {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
        for (int i = 0; i < 100; i++) {
            ColoredFrame coloredFrame = context.getBean(ColoredFrame.class);
            coloredFrame.showOnRandomPlace();
            TimeUnit.MILLISECONDS.sleep(50);
        }
    }
}
