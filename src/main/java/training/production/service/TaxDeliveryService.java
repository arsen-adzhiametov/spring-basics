package training.production.service;

import org.springframework.stereotype.Service;

/**
 * Created by Arsen Adzhiametov on 09-Jun-14 in IntelliJ IDEA.
 */
@Service("3")
public class TaxDeliveryService implements DeliveryService {
    @Override
    public void deliverDocument() {
        System.out.println("Заплати налоги и живи спокойно");
    }
}
