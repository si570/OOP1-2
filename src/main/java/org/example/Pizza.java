package org.example;

public class Pizza implements Food {
    String name;
    double price;
    String desciption;

    public Pizza(String name, double price, String desciption) {
        this.name = name;
        this.price = price;
        this.desciption = desciption;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDesciption() {
        return desciption;
    }

    public void setDesciption(String desciption) {
        this.desciption = desciption;
    }
}
