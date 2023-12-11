package ua.edu.ucu.apps.flowerstore.order;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import ua.edu.ucu.apps.flowerstore.flowers.Item;

@Getter @Setter @NoArgsConstructor @AllArgsConstructor
public class Order {
    private List<Item> content;

    public double getPrice() {
        double price = 0;
        for (Item item: content) {
            price += item.getPrice();
        }
        return price;
    }


}
