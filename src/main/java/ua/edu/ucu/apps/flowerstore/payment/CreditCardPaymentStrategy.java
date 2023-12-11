package ua.edu.ucu.apps.flowerstore.payment;

import lombok.AllArgsConstructor;


@AllArgsConstructor
public class CreditCardPaymentStrategy implements Payment {
    public String pay(double price) {
        return "Paying " + price + " tugrykiv by credit card";
    }
}
