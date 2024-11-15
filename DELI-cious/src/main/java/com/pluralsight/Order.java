package com.pluralsight;

import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
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
                    breadAdd();
                    break;
                case 2:
                    OrderDrink.drinkMenu();
                    break;
                case 3:
                    OrderChips.chipMenu(); // Chips are $1.50
                case 4:
                    System.out.println("Checkout"); /* will need a file writer and time utility somewhere get
                    the time of the receipt and whatever else is needed*/
                    break;
                case 0:
                    UserInterface.userMenu(); /* just return to the main class
                    (will also need to delete entire order if one was made)*/
                default:
                    System.out.println("Please type one of the numbers in the parentheses! ()");
            }
        } while (true);

    }

    public static void breadAdd() {
        Sandwich sandwich = new Sandwich();
        Scanner scanner = new Scanner(System.in);
        //--------- Bread Selection
        String whiteBread = "White Bread Sandwich";
        String wheatBread = "Wheat Bread Sandwich";
        String ryeBread = "Rye Bread Sandwich";
        String wrapBread = "Wrap Bread Sandwich";
        System.out.println("What bread would you like?");
        System.out.println("[ White ]\n" + "[ Wheat ]\n" + "[ Rye ]\n" + "[ Wrap ]\n");
        String breadChoice = scanner.nextLine();


        if (breadChoice.equalsIgnoreCase("White") || (breadChoice.equalsIgnoreCase("W"))) {
            System.out.println(whiteBread);//should make another variable to store the doubles
        } else if (breadChoice.equalsIgnoreCase("Wheat") || (breadChoice.equalsIgnoreCase("Wh"))) {
            System.out.println(wheatBread);
        } else if (breadChoice.equalsIgnoreCase("Rye") || (breadChoice.equalsIgnoreCase("R"))) {
            System.out.println(ryeBread);
        } else if (breadChoice.equalsIgnoreCase("Wrap") || (breadChoice.equalsIgnoreCase("Wr"))) {
            System.out.println(wrapBread);

        }
        sandwich.setBread(breadChoice);
        sizeMenu();
    }

    public static void sizeMenu() {
        //-------- Sandwich Size Selection
        Sandwich sandwich = new Sandwich();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please choose the size of the Sandwich ");
        System.out.println("(4) Small\n" + "(8) Medium\n" + "(12) Large");//
        double sandwichSmall = 5.50; //first we ask for the size, then the bread, then toppings, add them all together and
        double sandwichMedium = 7.00;
        double sandwichLarge = 8.50;
        int sandwichSize = scanner.nextInt(); /*Will try to use switch statements to allow user to choose options to their preference - Toppings are not at a set price for each sandwich size*/
        switch (sandwichSize){
            case 4:
                System.out.println("Current Price: " + sandwichSmall);
                break;
            case 8:
                System.out.println("Current Price: " + sandwichMedium);
                break;
            case 12:
                System.out.println("Current Price: " + sandwichLarge);
                break;

        }sandwich.setSize(sandwichSize);
        Topping.regular();//calls the regular topping method
    }

    public static void toastedOption() {
        Sandwich sandwich = new Sandwich();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Would you like your Sandwich Toasted?");
        System.out.println("Yes\n"+"No");
        String isToasted = scanner.nextLine();
        sandwich.setToasted(isToasted);
        if (isToasted.equalsIgnoreCase("Yes") || (isToasted.equalsIgnoreCase("Y"))) {
            System.out.println("Your Sandwich Will be toasted\n " + "Your Sandwich was added to cart!");//should make another variable to store the doubles
            ReceiptHandler.receiptWriter();
            OrderMenu();
        } else if (isToasted.equalsIgnoreCase("No") || (isToasted.equalsIgnoreCase("N"))) {
            System.out.println("Your Sandwich was added to cart!");
            ReceiptHandler.receiptWriter();
            OrderMenu();

        }
    }
}

























