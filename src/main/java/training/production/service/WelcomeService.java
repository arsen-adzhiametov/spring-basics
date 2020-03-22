package training.production.service;

import org.springframework.stereotype.Service;

/**
 * Created by Arsen Adzhiametov on 09-Jun-14 in IntelliJ IDEA.
 */
@Service("1")
public class WelcomeService implements DeliveryService {
    @Override
    public void deliverDocument() {
        System.out.println("Welcome, client!");
    }
}
