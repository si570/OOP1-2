package org.example;

import java.util.ArrayList;
import java.util.Arrays;

public class JustApp {
    public static void main(String[] args) {
        ArrayList<Food> items = new ArrayList<>();
        System.out.println("Welcome to Just App");
        System.out.println("You Order....");
        //Add some items burgers, pizza, fries and salad...
        Burger cheeseBurger = new Burger(name: "CheeseBurger",price 1.99,description "tasty");
        Pizza Chicken = new Pizza(name:"Chicken", price 10.00, description "A bit strong");
        Fries curry = new Fries(name"curry", price 1.99, description "not healthy");

        items.add(cheeseBurger);
        items.add(Chicken);


        for(Food item : items){

            System.out.println(item.getName());
            System.out.println(item.getPrice());
            System.out.println(item.getDescription());
            System.out.println(item,);
        }
    }
}
