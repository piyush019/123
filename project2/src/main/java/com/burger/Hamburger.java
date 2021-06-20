package com.burger;

public class Hamburger {
    private String name;
    private String meat;
    private double price;
    private String breadRollType;
    private String addition1Name;
    private double addition1Price;
    private String addition2Name;
    private double addition2Price;
    private String addition3Name;
    private double addition3Price;
    private String addition4Name;
    private double addition4Price;

    public Hamburger(String name, String meat, double price, String breadRollType) {
        this.name = name;
        this.meat = meat;
        this.price = price;
        this.breadRollType = breadRollType;
    }

    public void addHamburgerAddition1(String name, double price) {
        addition1Name = name;
        addition1Price = price;
    }

    public void addHamburgerAddition2(String name, double price) {
        addition2Name = name;
        addition2Price = price;
    }

    public void addHamburgerAddition3(String name, double price) {
        addition3Name = name;
        addition3Price = price;
    }

    public void addHamburgerAddition4(String name, double price) {
        addition4Name = name;
        addition4Price = price;
    }

    public double itemizeHamburger() {
        double fullPrice = price + addition1Price + addition2Price + addition3Price + addition4Price;
        if (name != null && !name.isEmpty()) {
            System.out.println(name + " Hamburger on a " + breadRollType + " roll with " + meat + " , price is " + price);
        }
        if (addition1Name != null && !addition1Name.isEmpty()) {
            System.out.println("Added " + addition1Name + " for an extra " + addition1Price);
        }
        if (addition2Name != null && !addition2Name.isEmpty()) {
            System.out.println("Added " + addition2Name + " for an extra " + addition2Price);
        }
        if (addition3Name != null && !addition3Name.isEmpty()) {
            System.out.println("Added " + addition3Name + " for an extra " + addition3Price);
        }
        if (addition4Name != null && !addition4Name.isEmpty()) {
            System.out.println("Added " + addition4Name + " for an extra " + addition4Price);
        }

        return fullPrice;
    }
}
