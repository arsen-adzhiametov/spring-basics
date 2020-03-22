package training.production;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by Arsen Adzhiametov on 09-Jun-14 in IntelliJ IDEA.
 */
public class Runner {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext("training.production");
        MainDeliveryService deliveryService = context.getBean(MainDeliveryService.class);
        deliveryService.deliver(3);
    }
}
