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
                    System.out.println("Drink");
                    break;
                case 3:
                    System.out.println("Chips"); // Chips are $1.50
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
        sizeMenu();
    }

    public static void sizeMenu() {
        //-------- Sandwich Size Selection
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please choose the size of the Sandwich");
        System.out.println("(S) Small\n" + "(M) Medium\n" + "(L) Large");//
        double sandwichSmall = 5.50; //first we ask for the size, then the bread, then toppings, add them all together and
        double sandwichMedium = 7.00;
        double sandwichLarge = 8.50;
        String sandwichSize = scanner.nextLine(); /*Will try to use switch statements to allow user to choose options to their preference - Toppings are not at a set price for each sandwich size*/
        if (sandwichSize.equalsIgnoreCase("Small") || (sandwichSize.equalsIgnoreCase("S"))) {
            System.out.println("Current Price: " + sandwichSmall);//should make another variable to store the doubles
        } else if (sandwichSize.equalsIgnoreCase("Medium") || (sandwichSize.equalsIgnoreCase("M"))) {
            System.out.println("Current Price: " + sandwichMedium);
        } else if (sandwichSize.equalsIgnoreCase("Large") || (sandwichSize.equalsIgnoreCase("L"))) {
            System.out.println("Current Price: " + sandwichLarge);

        }

        try {

            LocalDateTime now = LocalDateTime.now();
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd-[HHmmss]");
            String formattedDateTime = now.format(formatter);
            String fileName = formattedDateTime + ".txt";
            FileWriter writer = new FileWriter(fileName);
            writer.write(sandwichSize);
            writer.close();

            System.out.println("Receipt Made!: " + fileName);

        } catch (IOException e) {
            e.printStackTrace();
        }
        Topping.regular();//calls the regular topping method

        //ReceiptHandler.receiptWriter();




    }
}


























