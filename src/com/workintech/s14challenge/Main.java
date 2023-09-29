package com.workintech.s14challenge;

public class Main {
    public static void main(String[] args) {
        Hamburger hamburger = new Hamburger("Basic", "Normal", 3.56, BreadRollType.CLASSIC_BRIOCHE);

        hamburger.addHamburgerAddition("Tomato", 0.27);

        hamburger.addHamburgerAddition("Lettuce", 0.75);

        hamburger.addHamburgerAddition("Cheese", 1.13);

        hamburger.itemizeHamburger();

        System.out.println("**********************");

        HealthyBurger healthyBurger = new HealthyBurger("Vegan Burger", 5.67, BreadRollType.GLUTEN_FREE);

        healthyBurger.addHamburgerAddition("Egg", 5.43);

        healthyBurger.addHealthyAddition("Lentils", 3.41);

        healthyBurger.itemizeHamburger();

        System.out.println("**********************");

        DeluxeBurger db = new DeluxeBurger();

        db.addHamburgerAddition("Should not do this", 50.53);

        db.itemizeHamburger();
    }
}