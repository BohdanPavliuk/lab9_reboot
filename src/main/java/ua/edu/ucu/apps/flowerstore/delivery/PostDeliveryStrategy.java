package ua.edu.ucu.apps.flowerstore.delivery;

import java.util.List;

import ua.edu.ucu.apps.flowerstore.order.Order;

public class PostDeliveryStrategy implements Delivery {
    public String orderDelivery(List<Order> orders) {
        return "We are delivery your "
        + orders.size() + " items by Nova Poshta"; 
    }

}
