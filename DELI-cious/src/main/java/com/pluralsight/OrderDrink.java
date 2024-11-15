package com.pluralsight;

import java.util.Scanner;

public class OrderDrink {
    public static void drinkMenu(){
        Drink drink = new Drink();
        Scanner scanner = new Scanner(System.in);
            System.out.println("Please choose the of the Drink you would like to add");
            System.out.println("---------------------------");
            System.out.println("(1) Sprite");
            System.out.println("(2) Pepsi");
            System.out.println("(3) Sunkist");
            System.out.println("(4) Brisk");
            System.out.println("(5) Water");
            int drinkChoice = scanner.nextInt();
            switch (drinkChoice) {
                case 1:
                    System.out.println(drink.drinkChoices[0]+" Added to cart");
                    break;
                case 2:
                    System.out.println(drink.drinkChoices[1]+" Added to cart");
                    break;
                case 3:
                    System.out.println(drink.drinkChoices[2]+" Added to cart");
                    break;
                case 4:
                    System.out.println(drink.drinkChoices[3]+"Added to cart");
                case 5:
                    System.out.println(drink.drinkChoices[4]+"Added to cart");
                default:
                    System.out.println("Please type one of the numbers in the parentheses! ()");

        }
        System.out.println("What size would you like your drink to be?");
        System.out.println("---------------------------");
        System.out.println("(1) Small");
        System.out.println("(2) Medium");
        System.out.println("(3) Large");
        int drinkSize = scanner.nextInt();
        switch (drinkSize){
            case 1:
                System.out.println("Small");
                break;
            case 2:
                System.out.println("Medium");
                break;
            case 3:
                System.out.println("Large");


        }

    }
}
