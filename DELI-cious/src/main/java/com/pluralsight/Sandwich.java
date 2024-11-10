package com.pluralsight;
import java.util.*;
public class Sandwich { //Sandwich sizes 4" (Small), 8" (Medium) , 12" (Large)

    public static void  addSandwich(){
        Scanner scanner = new Scanner(System.in);
        // Bread Selection
        String whiteBread = "White Bread Sandwich";
        String wheatBread = "Wheat Bread Sandwich";
        String ryeBread = "Rye Bread Sandwich";
        String wrapBread = "Wrap Bread Sandwich";
        System.out.println("What bread would you like?");
        System.out.println("[ White ]\n" + "[ Wheat ]\n" + "[ Rye ]\n" + "[ Wrap ]\n");
        String breadChoice = scanner.nextLine();
        if (breadChoice.equalsIgnoreCase("White") || (breadChoice.equalsIgnoreCase("W"))){
            System.out.println(whiteBread);//should make another variable to store the doubles
        } else if (breadChoice.equalsIgnoreCase("Wheat")||(breadChoice.equalsIgnoreCase("Wh"))) {
            System.out.println(wheatBread);
        }else if (breadChoice.equalsIgnoreCase("Rye")||(breadChoice.equalsIgnoreCase("R"))) {
            System.out.println(ryeBread);
        }else if (breadChoice.equalsIgnoreCase("Wrap")||(breadChoice.equalsIgnoreCase("Wr"))) {
            System.out.println(wrapBread);
        }
        // Sandwich Size Selection
        System.out.println("Please choose the size of the Sandwich");
        System.out.println("(S) Small\n" + "(M) Medium\n" +"(L) Large");//
        double sandwichSmall = 5.50; //first we ask for the size, then the bread, then toppings, add them all together and
        double sandwichMedium = 7.00;
        double sandwichLarge = 8.50;
        String sandwichSize = scanner.nextLine(); /*Will try to use switch statements
         to allow user to choose options to their preference - Toppings are not at a set price for each sandwich size*/
        if (sandwichSize.equalsIgnoreCase("Small") || (sandwichSize.equalsIgnoreCase("S"))){
            System.out.println("Current Price: "+sandwichSmall);//should make another variable to store the doubles
        } else if (sandwichSize.equalsIgnoreCase("Medium")||(sandwichSize.equalsIgnoreCase("M"))) {
            System.out.println("Current Price: "+sandwichMedium);
        }else if (sandwichSize.equalsIgnoreCase("Large")||(sandwichSize.equalsIgnoreCase("L"))) {
            System.out.println("Current Price: "+sandwichLarge);
        }
        // Topping Selection
/*Regulars are free (does not need variables) will ask user what toppings they want in a do while loop
if they choose one topping more than once the system should advise them that it was picked already*/


    }
}
