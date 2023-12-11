package ua.edu.ucu.apps.flowerstoretest.deliverytest;

import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ua.edu.ucu.apps.flowerstore.delivery.DHLDeliveryStrategy;
import ua.edu.ucu.apps.flowerstore.delivery.PostDeliveryStrategy;
import ua.edu.ucu.apps.flowerstore.order.Order;

public class DeliveryTest {
    private DHLDeliveryStrategy dhlDelivery;
    private PostDeliveryStrategy postDelivery;

    @BeforeEach
    public void init() {
        dhlDelivery = new DHLDeliveryStrategy();
        postDelivery = new PostDeliveryStrategy();
    }

    @Test
    public void testDelivery() {
        Order orderFirst = new Order();
        Order orderSecond = new Order();
        Order orderThird = new Order();
        List<Order> ordersPost = List.of(orderFirst, orderSecond);
        List<Order> ordersDHL = List.of(orderFirst, orderSecond, orderThird);
        String testEqualsFirst = "We are delivery your 2 items by Nova Poshta";
        String realFirst = postDelivery.orderDelivery(ordersPost);
        String testEqualsSecond  = "We are delivery your 3 items by DHL";
        String realSecond = dhlDelivery.orderDelivery(ordersDHL);
        Assertions.assertEquals(testEqualsFirst, realFirst); 
        Assertions.assertEquals(testEqualsSecond, realSecond); 
    }
}
