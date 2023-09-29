package com.workintech.s14challenge;

import java.util.Arrays;

public class HealthyBurger extends Hamburger implements HealthyAddable{

    private Addition[] healthyExtras;

    public HealthyBurger(String name, double price, BreadRollType breadRollType) {
        super(name, "Tofu", price, breadRollType);
        this.healthyExtras = new Addition[2];
    }

    @Override
    public void addHealthyAddition(String name, double price) {
        for(int i = 0; i < healthyExtras.length; i++){
            if(healthyExtras[i] == null){
                healthyExtras[i] = new Addition(name, price);
                break;
            }
        }
    }

    @Override
    public double itemizeHamburger() {
        StringBuilder builder = new StringBuilder();
        for(int i = 0; i < healthyExtras.length; i++){
            if(healthyExtras[i] != null){
                builder.append("HealthyAddition" + (i + 1) + ": " + healthyExtras[i].getName() + "\n");
                setPrice(getPrice() + healthyExtras[i].getPrice());
            }
        }
        System.out.print(builder);
        super.itemizeHamburger();
        return getPrice();
    }

    @Override
    public String toString() {
        return "HealthyBurger{" +
                "healthyExtras=" + Arrays.toString(healthyExtras) +
                '}';
    }
}
