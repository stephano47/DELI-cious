package com.pluralsight;

public class Sandwich { //Sandwich sizes 4" (Small), 8" (Medium) , 12" (Large)
    private int size;
    private String bread;
    private String topping;
    private String sauces;
    private boolean toasted;
    private String prmTopping;


    Sandwich(){
        this.prmTopping = prmTopping;
        this.size = size;
        this.bread = bread;
        this.topping = topping;
        this.sauces = sauces;
        this.toasted = toasted;
    }

    public int getSize() {
        return size;
    }

    public boolean getToasted() {
        return toasted;
    }

    public String getSauces() {
        return sauces;
    }

    public String getTopping() {
        return topping;
    }

    public String getBread() {
        return bread;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public void setBread(String bread) {
        this.bread = bread;
    }

    public void setTopping(String topping) {
        this.topping = topping;
    }

    public void setSauces(String sauces) {
        this.sauces = sauces;
    }

    public void setToasted(boolean toasted) {
        this.toasted = toasted;
    }

    public String getPrmTopping() {
        return prmTopping;
    }

    public void setPrmTopping(String prmTopping) {
        this.prmTopping = prmTopping;
    }


/*Regulars are free (does not need variables) will ask user what toppings they want in a do while loop
if they choose one topping more than once the system should advise them that it was picked already*/


    }

