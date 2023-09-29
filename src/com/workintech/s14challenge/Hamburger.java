package com.workintech.s14challenge;

import java.util.Arrays;

public class Hamburger implements Addable{
    private String name;
    private String meat;
    private double price;
    private BreadRollType breadRollType;
    private Addition[] additions;

    public Hamburger(String name, String meat, BreadRollType breadRollType) {
        this.name = name;
        this.meat = meat;
        this.breadRollType = breadRollType;
        this.additions = new Addition[4];
    }
    public Hamburger(String name, String meat, double price, BreadRollType breadRollType) {
        this.name = name;
        this.meat = meat;
        this.price = price;
        this.breadRollType = breadRollType;
        this.additions = new Addition[4];
    }

    public String getName() {
        return name;
    }

    public String getMeat() {
        return meat;
    }

    public double getPrice() {
        return price;
    }

    public BreadRollType getBreadRollType() {
        return breadRollType;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMeat(String meat) {
        this.meat = meat;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setBreadRollType(BreadRollType breadRollType) {
        this.breadRollType = breadRollType;
    }

    public void setAdditions(Addition[] additions) {
        this.additions = additions;
    }

    public void addHamburgerAddition(String name, double price){
        for(int i = 0; i < additions.length; i++){
            if(additions[i] == null){
                additions[i] = new Addition(name, price);
                break;
            }
        }
    }
    public double itemizeHamburger(){
        StringBuilder builder = new StringBuilder();
        builder.append("Name: " + name + "\n");
        builder.append("Meat: " + meat + "\n");
        builder.append("BreadRollType: " + breadRollType.name() + "\n");

        for(int i = 0; i < additions.length; i++){
            if(additions[i] != null){
                builder.append("Addition" + (i+1) + ": "+ additions[i].getName() + "\n");
                setPrice(price + additions[i].getPrice());
            }
        }
        builder.append("Total price: " + price);
        System.out.println(builder);

        return price;
    }

    @Override
    public String toString() {
        return "Hamburger{" +
                "name='" + name + '\'' +
                ", meat='" + meat + '\'' +
                ", price=" + price +
                ", breadRollType=" + breadRollType +
                ", additions=" + Arrays.toString(additions) +
                '}';
    }
}
