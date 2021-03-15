package com.company;

import java.util.ArrayList;

public class control {
    public control(){
        System.out.println("Order Builder");
        ArrayList<pizza> orders = new ArrayList<pizza>();

        orders.add(new pizza("Stuffed",8.75,"Large","Deep","Hawaiian"));
        orders.add(new pizza("Normal",6,"Small","Thin","Texas BBQ"));
        orders.add(new pizza("Italian",7.50,"Medium","Crispy","Pepperoni Passion"));
        for(int x = 0;x<orders.size();x++){
            System.out.println(orders.get(x).crust + " - " + orders.get(x).size + " - " + orders.get(x).base + " - " + orders.get(x).toppings);
        }
    }
}
