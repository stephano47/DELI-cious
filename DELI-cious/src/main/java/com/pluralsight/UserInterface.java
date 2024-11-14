package com.pluralsight;

import java.util.Scanner;

public class UserInterface {
    public static void userMenu(){
        //Will need to be in a do while loop.
    Scanner scanner = new Scanner(System.in);
    do {System.out.println("Welcome to DELI-Cious!");
        System.out.println("___________________________");

        System.out.println("(1) New Order");
        System.out.println("(0) Exit");
        int userMenuChoice = scanner.nextInt();
        switch (userMenuChoice){
            case 1:
                Order.OrderMenu();
                break;
            case 0:
                System.exit(0);
                      break;
            default:
                System.out.println("Please type one of the numbers in the parentheses! ()");
        }
    }while (true);
}
}
