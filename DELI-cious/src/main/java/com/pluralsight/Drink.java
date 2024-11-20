package com.pluralsight;

public class Drink {
    String[] drinkChoices = {"Sprite", "Pepsi", "Sunkist", "Brisk", "Water"};
    private String size;
    private String drink;
    Drink(){
        this.size = size;
        this.drink = drink;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getDrink() {
        return drink;
    }

    public void setDrink(String drink) {
        this.drink = drink;
    }
}
