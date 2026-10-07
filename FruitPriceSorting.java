/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author 
 */
public class FruitPriceSorting {
    public class Fruit {
    private String fruitId;
    private String name;
    private double price;

    
    public Fruit(String fruitId, String name, double price) {
        this.fruitId = fruitId;
        this.name = name;
        this.price = price;
    }

    
    public String getFruitId() {
        return fruitId;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    // Setters
    public void setFruitId(String fruitId) {
        this.fruitId = fruitId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    
    @Override
    public String toString() {
        return String.format(
            "ID: %-5s | Name: %-12s | Price: PHP %.2f",
            fruitId, name, price
        );
    }
}

}
