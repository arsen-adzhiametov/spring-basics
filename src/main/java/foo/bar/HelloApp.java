package foo.bar;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloApp {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
        ObjectFactory objectFactory = context.getBean(ObjectFactory.class);
        ObjectFactory.createObject(HelloService.class);
    }
}
