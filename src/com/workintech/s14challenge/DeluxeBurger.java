package com.workintech.s14challenge;

public class DeluxeBurger extends Hamburger{
    private boolean hasChips;
    private boolean hasDrink;
    private double price;

    public DeluxeBurger() {
        super("Deluxe Burger", "Deluxe Meat", 19.10, BreadRollType.SESAME_BUN);
        this.hasChips = true;
        this.hasDrink = true;
    }

    @Override
    public void addHamburgerAddition(String name, double price) {
        System.out.println("You can't add extras to Deluxe Burger.");
    }

    @Override
    public double itemizeHamburger() {
        String extras = "Chips: " + hasChips + "\n"
                        + "Drink: " + hasDrink + "\n";
        System.out.print(extras);
        super.itemizeHamburger();
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
