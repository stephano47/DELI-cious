package com.pluralsight;

import java.util.Scanner;

public class Order {
    public static void OrderMenu() {
        Scanner scanner = new Scanner(System.in); //basically a copy of the main class
        do {
            System.out.println("MENU");
            System.out.println("---------------------------");
            System.out.println("(1) Add Sandwich");
            System.out.println("(2) Add Drink");
            System.out.println("(3) Add Chips");
            System.out.println("(4) Checkout");
            System.out.println("(0) Cancel Order");
            int userChoice = scanner.nextInt();
            switch (userChoice) {
                case 1:
                    System.out.println("Sandwich");
                    break;
                case 2:
                    System.out.println("Drink");
                    break;
                case 3:
                    System.out.println("Chips");
                case 4:
                    System.out.println("Checkout");
                    break;
                case 0:
                    return;
                default:
                    System.out.println("Please type one of the numbers in the parentheses! ()");
            }
        }while(true);

    }
}
