package ua.edu.ucu.apps.flowerstore.payment;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/payment")
public class PaymentController {
    private static final int CHECKPRICE = 1000;
    @GetMapping("/")
    String whatNext() {
        return "If you want to pay by credit card"
        + " add card/ to your URL if by paypal paypal/";
    }
    @GetMapping("/paypal/")
    public String paymentPayPal() {
        PayPalPaymentStrategy method = new PayPalPaymentStrategy();
        return method.pay(CHECKPRICE);
    }

    @GetMapping("/card/")
    public String paymentCard() {
        CreditCardPaymentStrategy method = new CreditCardPaymentStrategy();
        return method.pay(CHECKPRICE);
    }
}
