package ua.edu.ucu.apps.flowerstore.delivery;

import java.util.List;

import ua.edu.ucu.apps.flowerstore.order.Order;

public interface Delivery {
    String orderDelivery(List<Order> orders);
}
