package foo.bar;

import training.spring.annotations.RunThisMethod;
import org.springframework.stereotype.Component;

@Component
public class HelloService {

    @RunThisMethod(repeat = 5)
    public String sayHello() {
        System.out.println("Hello!");
        return "Hello world!";
    }
}
