/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author DELL
 */
public class TestClass {


    public static void displayFruits(Fruit[] fruits) {

        for (Fruit fruit : fruits) {
            System.out.println(fruit);
        }
    }

    public static void main(String[] args) {

        // Create 8 Fruit objects
        Fruit[] fruits = {
            new Fruit("F001", "Apple", 85.50),
            new Fruit("F002", "Banana", 45.00),
            new Fruit("F003", "Mango", 120.75),
            new Fruit("F004", "Orange", 65.25),
            new Fruit("F005", "Grapes", 150.00),
            new Fruit("F006", "Watermelon", 95.50),
            new Fruit("F007", "Papaya", 55.75),
            new Fruit("F008", "Pineapple", 110.00)
        };

        
        System.out.println("==============================================");
        System.out.println("          FRUITS BEFORE SORTING");
        System.out.println("==============================================");

        displayFruits(fruits);

       
        SortingAlgorithm.quickSort(
            fruits,
            0,
            fruits.length - 1
        );

        
        System.out.println("\n==============================================");
        System.out.println("           FRUITS AFTER SORTING");
        System.out.println("==============================================");

        displayFruits(fruits);

        
        System.out.println("\n==============================================");
        System.out.println("           TOP 3 CHEAPEST FRUITS");
        System.out.println("==============================================");

        for (int i = 0; i < 3; i++) {
            System.out.println(
                (i + 1) + ". " + fruits[i]
            );
        }
    }
}



