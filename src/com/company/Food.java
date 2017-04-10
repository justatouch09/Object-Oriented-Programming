package com.company;


public class Food extends InventoryItem {

    public Food(String name, int quantity) {
        this.name = name;
        this.quantity = quantity;
        this.category = "food";
    }
}