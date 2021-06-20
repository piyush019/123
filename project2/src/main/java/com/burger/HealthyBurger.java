package com.burger;

public class HealthyBurger extends Hamburger {
    private String healthyExtra1Name;
    private double healthyExtra1Price;
    private String healthyExtra2Name;
    private double healthyExtra2Price;

    public HealthyBurger(String meat, double price) {
        super("Healthy", meat, price, "Brown rye");    //could have added constructor with only two params
    }

    public void addHealthyAddition1(String name, double price) {
        healthyExtra1Name = name;
        healthyExtra1Price = price;
    }

    public void addHealthyAddition2(String name, double price) {
        healthyExtra2Name = name;
        healthyExtra2Price = price;
    }

    @Override
    public double itemizeHamburger() {
        double finalPrice = super.itemizeHamburger() + healthyExtra1Price + healthyExtra2Price;
        if (healthyExtra1Name != null && !healthyExtra1Name.isEmpty()) {
            System.out.println("Added " + healthyExtra1Name + " for an extra " + healthyExtra1Price);
        }
        if (healthyExtra2Name != null && !healthyExtra2Name.isEmpty()) {
            System.out.println("Added " + healthyExtra1Name + " for an extra " + healthyExtra2Price);
        }
        return finalPrice;
    }
}
