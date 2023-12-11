package ua.edu.ucu.apps.flowerstore.flowers;

import java.util.ArrayList;
import java.util.List;

public class FlowerBucket extends Item {
    private List<FlowerPack> flowerPacks = new ArrayList<>();
    
    public double getPrice() {
        double price = 0;
        for (FlowerPack flowerpack: flowerPacks) {
            price += flowerpack.getPrice();
        }
        return price;
    }

    public void addPack(FlowerPack flowerPack) {
        this.flowerPacks.add(flowerPack);
    }

}
