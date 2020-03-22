package training.production;

import training.production.service.DeliveryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * Created by Arsen Adzhiametov on 09-Jun-14 in IntelliJ IDEA.
 */
@Service
public class MainDeliveryServiceImpl implements MainDeliveryService {

    @Autowired
    private Map<String, DeliveryService> map;

    @Override
    public void deliver(int deliveryType) {
         map.get(Integer.toString(deliveryType)).deliverDocument();
    }
}
