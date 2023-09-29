package com.workintech.s14challenge;

public class DeluxeBurger extends Hamburger{
    private boolean hasChips;
    private boolean hasDrink;
    private double price;

    public DeluxeBurger(String name, String meat, BreadRollType breadRollType) {
        super(name, meat, breadRollType);
        this.hasChips = true;
        this.hasDrink = true;
        this.price = 19.10;
    }

    @Override
    public void addHamburgerAddition1(String addition1Name, double addition1Price) {
        System.out.println("Extra toppings can't be added to this burger");
    }

    @Override
    public void addHamburgerAddition2(String addition2Name, double addition2Price) {
        System.out.println("Extra toppings can't be added to this burger");
    }

    @Override
    public void addHamburgerAddition3(String addition3Name, double addition3Price) {
        System.out.println("Extra toppings can't be added to this burger");
    }

    @Override
    public void addHamburgerAddition4(String addition4Name, double addition4Price) {
        System.out.println("Extra toppings can't be added to this burger");
    }

    @Override
    public double itemizeHamburger() {
        System.out.println(this);
        return this.price;
    }

    @Override
    public String toString() {
        return super.toString() + "DeluxeBurger{" +
                "chips='" + hasChips + '\'' +
                ", drink='" + hasDrink + '\'' +
                ", price=" + price +
                '}';
    }
}
