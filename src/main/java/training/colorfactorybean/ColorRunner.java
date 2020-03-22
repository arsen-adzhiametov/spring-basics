package training.colorfactorybean;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Arsen Adzhiametov on 01-Jun-14 in IntelliJ IDEA.
 */
public class ColorRunner {
    public static void main(String[] args) {
        new ClassPathXmlApplicationContext("color-spring-config.xml");
    }
}
