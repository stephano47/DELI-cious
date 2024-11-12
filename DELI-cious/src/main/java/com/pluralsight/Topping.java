package com.pluralsight;

import java.util.Scanner;

public class Topping {

    public static void regular(){
        Scanner scanner = new Scanner(System.in);
        do {
            String[] regularToppings = {"Lettuce", "Peppers", "Onions", "Tomatoes", "Jalepenos", "Cucumbers", "Pickles", "Guacamole", "Mushrooms"};
            System.out.println("Please choose the number dedicated to the regular toppings you would like.\n" + "Note: The Regular Toppings are Free!");
            System.out.println("1- " + regularToppings[0]);
            System.out.println("2- " + regularToppings[1]);
            System.out.println("3- " + regularToppings[2]);
            System.out.println("4- " + regularToppings[3]);
            System.out.println("5- " + regularToppings[4]);
            System.out.println("6- " + regularToppings[5]);
            System.out.println("7- " + regularToppings[6]);
            System.out.println("8- " + regularToppings[7]);
            System.out.println("9- " + regularToppings[8]);
            System.out.println("10- Next");
            int regTopping = scanner.nextInt();

            switch (regTopping) {
                case 1:
                    System.out.println("1");
                    break;
                case 2:
                    System.out.println("2");
                    break;
                case 3:
                    System.out.println("3");
                    break;
                case 4:
                    System.out.println("4");
                    break;
                case 5:
                    System.out.println("5");
                    break;
                case 6:
                    System.out.println("6");
                    break;
                case 7:
                    System.out.println("7");
                    break;
                case 8:
                    System.out.println("8");
                    break;
                case 9:
                    System.out.println("9");
                    break;
                case 10:
                    return;
                default:
                    System.out.println("Sorry That is not an option please enter one of the numbers according to your desired topping.");
            }
        }while (true);
}
}
