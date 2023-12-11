package ua.edu.ucu.apps.flowerstore.flowers;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor @NoArgsConstructor @Setter
public class FlowerPack extends Item {
    private Flower flower;
    private int quantity;


    public double getPrice() {
        return flower.getPrice() * quantity;
    }
}
