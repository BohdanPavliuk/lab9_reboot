package ua.edu.ucu.apps.flowerstore.delivery;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ua.edu.ucu.apps.flowerstore.order.Order;

@RestController
@RequestMapping("/delivery")
public class DeliveryController {
    
    @GetMapping("/")
    public String whatNext() {
        return "If you are using DHL delivery"
        + " add /dhl to your URL if Post method add /navaposhta";
    }

    @GetMapping("/dhl")
    public String dHLDelivery() {
        Order order = new Order();
        List<Order> orders = List.of(order);
        DHLDeliveryStrategy deliveryStrategy = new DHLDeliveryStrategy();
        return deliveryStrategy.orderDelivery(orders);
    }

    @GetMapping("/novaposhta")
    public String postDelivery() {
        Order order = new Order();
        List<Order> orders = List.of(order);
        PostDeliveryStrategy deliveryStrategy = new PostDeliveryStrategy();
        return deliveryStrategy.orderDelivery(orders);
    }
}
