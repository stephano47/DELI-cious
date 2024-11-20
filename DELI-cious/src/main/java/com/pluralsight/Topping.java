package com.pluralsight;

import java.util.Scanner;

public class Topping {

    public static void regular(){
        Sandwich sandwich = new Sandwich();
        Scanner scanner = new Scanner(System.in);

            String[] regularToppings = {"Lettuce", "Peppers", "Onions", "Tomatoes", "Jalapenos", "Cucumbers", "Pickles", "Guacamole", "Mushrooms"};
            System.out.println("Please choose the number dedicated to the regular topping you would like.\n" + "Note: The Regular Toppings are Free!");
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
            sandwich.setTopping(String.valueOf(regTopping));//to.String;
            switch (regTopping) {
                case 1:
                    System.out.println("1");
                    premium();
                    break;
                case 2:
                    System.out.println("2");
                    premium();
                    break;
                case 3:
                    System.out.println("3");
                    premium();
                    break;
                case 4:
                    System.out.println("4");
                    premium();
                    break;
                case 5:
                    System.out.println("5");
                    premium();
                    break;
                case 6:
                    System.out.println("6");
                    premium();
                    break;
                case 7:
                    System.out.println("7");
                    premium();
                    break;
                case 8:
                    System.out.println("8");
                    premium();
                    break;
                case 9:
                    System.out.println("9");
                    premium();
                    break;
                case 10:
                    premium();
                    break;
                default:
                    System.out.println("Sorry That is not an option please enter one of the numbers according to your desired topping.");
            }
}
public static void premium(){
        Scanner scanner = new Scanner(System.in);
        Sandwich sandwich = new Sandwich();
        System.out.println("Would you like Cheese or Meat on your Sandwich? \n" +"Note: Meat and Cheese Toppings are additional fees");
        System.out.println("Yes/No");
        String premiumOption = scanner.nextLine();
    if (premiumOption.equalsIgnoreCase("Yes") || (premiumOption.equalsIgnoreCase("Y"))){
        do {
            System.out.println("Cheese and Meat Option");//should make another variable to store the doubles
            String[] premiumToppings = {"Steak", "Ham", "Salami", "Roast Beef", "Chicken", "Bacon", "American", "Provolone", "Cheddar", "Swiss"};
            System.out.println("Please choose the number dedicated to the Premium toppings you would like.\n" + "Note: The Premium Toppings have additional costs depending on size of Sandwich.");
            System.out.println("Meats\n"+"Small - $1.00   Medium - $2.00     Large - $3.00" );
            System.out.println("1- " + premiumToppings[0]);
            System.out.println("2- " + premiumToppings[1]);
            System.out.println("3- " + premiumToppings[2]);
            System.out.println("4- " + premiumToppings[3]);
            System.out.println("5- " + premiumToppings[4]);
            System.out.println("6- " + premiumToppings[5]);// should be bacon aka last meat topping
            System.out.println("Cheese\n"+"Small -  $0.75  Medium - $1.50     Large $2.25");
            System.out.println("7- " + premiumToppings[6]);
            System.out.println("8- " + premiumToppings[7]);
            System.out.println("9- " + premiumToppings[8]);
            System.out.println("10- "+ premiumToppings[9]);
            System.out.println("11- Next");
            int prmTopping = scanner.nextInt();
            sandwich.setPrmTopping(String.valueOf(prmTopping));
            switch (prmTopping) {
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
                    System.out.println("10");
                    break;
                case 11:
                    Order.toastedOption();
                    break;
                default:
                    System.out.println("Sorry That is not an option please enter one of the numbers according to your desired topping.");
            }

        }while (true);
    } else if (premiumOption.equalsIgnoreCase("No")||(premiumOption.equalsIgnoreCase("N"))) {
     Order.toastedOption();
    }

}
}
