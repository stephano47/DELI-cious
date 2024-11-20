package com.pluralsight;

import java.util.Scanner;

public class OrderChips {
    public static void chipMenu(){
        Scanner scanner = new Scanner(System.in);//basically a copy of the main class
        Chips chips = new Chips();
        do {
            System.out.println("Please choose the Chip you would like to add");
            System.out.println("---------------------------");
            System.out.println("(1)" + chips.chipChoices[0]);
            System.out.println("(2)"+ chips.chipChoices[1]);
            System.out.println("(3)"+chips.chipChoices[2]);
            int chipChoice = scanner.nextInt();
            chips.setChips(String.valueOf(chipChoice));
            System.out.println(chips.getChips());
            switch (chipChoice) {
                case 1:
                    System.out.println(chips.chipChoices[0]+" Added to cart");
                    Order.OrderMenu();
                    break;
                case 2:
                    System.out.println(chips.chipChoices[1]+" Added to cart");
                    Order.OrderMenu();
                    break;
                case 3:
                    System.out.println(chips.chipChoices[2]+" Added to cart");
                    Order.OrderMenu(); // Chips are $1.50
                    break;
                default:
                    System.out.println("Please type one of the numbers in the parentheses! ()");
            }
        } while (true);
    }

}
