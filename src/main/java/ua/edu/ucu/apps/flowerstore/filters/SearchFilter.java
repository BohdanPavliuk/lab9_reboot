package ua.edu.ucu.apps.flowerstore.filters;

import ua.edu.ucu.apps.flowerstore.flowers.Item;

public interface SearchFilter {
    boolean match(Item item);
}
