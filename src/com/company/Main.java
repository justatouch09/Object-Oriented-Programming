package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<InventoryItem> inventory = new ArrayList<>();

        Ammo arrow = new Ammo("arrow", 30);
        Armor dragon = new Armor("dragon", 3);
        Weapon bow = new Weapon("bow", 4);
        Gold coin = new Gold("coin", 100);
        Food bread = new Food("bread", 25);

        inventory.add(arrow);
        inventory.add(dragon);
        inventory.add(bow);
        inventory.add(coin);
        inventory.add(bread);

        for (InventoryItem item : inventory) {

            System.out.println(item);
        }

    }

}
