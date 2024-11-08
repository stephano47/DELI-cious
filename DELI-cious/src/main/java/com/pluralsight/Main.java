package com.pluralsight;
import java.util.*;
public class Main { //Do I use this as the UI Or make another folder? (Too lazy just going start in Main)
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//Will need to be in a do while loop.
        do {

            System.out.println("Welcome to DELI-Cious!");
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

