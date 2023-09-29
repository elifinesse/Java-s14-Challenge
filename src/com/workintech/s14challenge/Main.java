package com.workintech.s14challenge;

public class Main {
    public static void main(String[] args) {
        Hamburger hamburger = new Hamburger("Basic", "Normal", 3.56, BreadRollType.CLASSIC_BRIOCHE);

        hamburger.addHamburgerAddition1("Tomato", 0.27);

        hamburger.addHamburgerAddition2("Lettuce", 0.75);

        hamburger.addHamburgerAddition3("Cheese", 1.13);

        System.out.println(hamburger.itemizeHamburger());

        System.out.println("**********************");

        HealthyBurger healthyBurger = new HealthyBurger("Vegan Burger", "Tofu", 5.67, BreadRollType.GLUTEN_FREE);

        healthyBurger.addHamburgerAddition1("Egg", 5.43);

        healthyBurger.addHealthyAddition1("Lentils", 3.41);

        System.out.println(healthyBurger.itemizeHamburger());

        System.out.println("**********************");

        DeluxeBurger db = new DeluxeBurger("Deluxe Burger", "Double", BreadRollType.SESAME_BUN);

        db.addHamburgerAddition3("Should not do this", 50.53);

        System.out.println(db.itemizeHamburger());
    }
}