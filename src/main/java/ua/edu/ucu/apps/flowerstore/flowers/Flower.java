package ua.edu.ucu.apps.flowerstore.flowers;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;



@Setter @NoArgsConstructor @AllArgsConstructor @Entity @Getter
public class Flower extends Item {
    @Id
    private int id;
    private double sepalLength;
    private FlowerColor color;
    private double price;
    private FlowerType flowerType;


    public Flower(Flower flower) {
        this.color = flower.color;
        this.price = flower.price;
        this.sepalLength = flower.sepalLength;
        this.flowerType = flower.flowerType;
    }
    public String getColor() {
        return color.toString();
    }
}
