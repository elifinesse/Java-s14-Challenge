package com.workintech.s14challenge;

public class HealthyBurger extends Hamburger{
    private String healthyExtra1Name;
    private double healthyExtra1Price;
    private String healthyExtra2Name;
    private double healthyExtra2Price;

    public HealthyBurger(String name, String meat, double price, BreadRollType breadRollType) {
        super(name, meat, price, breadRollType);
    }

    public void addHealthyAddition1(String healthyExtra1Name, double healthyExtra1Price){
        this.healthyExtra1Name = healthyExtra1Name;
        this.healthyExtra1Price = healthyExtra1Price;

    }

    public void addHealthyAddition2(String healthyExtra2Name, double healthyExtra2Price){
        this.healthyExtra2Name = healthyExtra2Name;
        this.healthyExtra2Price = healthyExtra2Price;
    }

    @Override
    public double itemizeHamburger() {
        System.out.println(this);
        return super.itemizeHamburger() + healthyExtra1Price + healthyExtra2Price;
    }

    @Override
    public String toString() {
        return super.toString() + " HealthyBurger{" +
                "healthyExtra1Name='" + healthyExtra1Name + '\'' +
                ", HealthyExtra1Price=" + healthyExtra1Price +
                ", healthyExtra2Name='" + healthyExtra2Name + '\'' +
                ", HealthyExtra2Price=" + healthyExtra2Price +
                '}';
    }
}
