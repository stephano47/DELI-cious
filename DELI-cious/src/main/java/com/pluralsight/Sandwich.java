package com.pluralsight;
import java.util.*;
public class Sandwich { //Sandwich sizes 4" (Small), 8" (Medium) , 12" (Large)



    private int size;
    private String bread;
    private String topping;
    private String sauces;
    private boolean toasted;

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public boolean isToasted() {
        return toasted;
    }

    public void setToasted(boolean toasted) {
        this.toasted = toasted;
    }

    public String getSauces() {
        return sauces;
    }

    public void setSauces(String sauces) {
        this.sauces = sauces;
    }

    public String getTopping() {
        return topping;
    }

    public void setTopping(String topping) {
        this.topping = topping;
    }

    public String getBread() {
        return bread;
    }

    public void setBread(String bread) {
        this.bread = bread;
    }

    // Decided to only have the call method in the sandwich class.
    Sandwich(int Size, String Bread, String Topping, String Sauces, boolean Toasted){

    }


/*Regulars are free (does not need variables) will ask user what toppings they want in a do while loop
if they choose one topping more than once the system should advise them that it was picked already*/


    }

