package ua.edu.ucu.apps.flowerstore.filters;

import ua.edu.ucu.apps.flowerstore.flowers.Item;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter @NoArgsConstructor
public class PriceFilter implements SearchFilter {
    private double minPrice = 0;
    private double maxPrice = 0;

    public PriceFilter(double minPrice, double maxPrice) {
        if (minPrice > maxPrice) {
            this.maxPrice = minPrice;
            this.minPrice = maxPrice;
        } else {
            this.maxPrice = maxPrice;
            this.minPrice = minPrice;
        }
        if (this.minPrice < 0) {
            this.minPrice = 0;
        }
        if (this.maxPrice < 0) {
            this.maxPrice = 0;
        }
    }

    public boolean match(Item item) {
        double price = item.getPrice();
        if (maxPrice >= price && price >= minPrice) {
            return true;
        }
        return false;
    }
}
