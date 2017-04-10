package com.company;


public class InventoryItem {
    String name;
    int quantity;
    String category;

    @Override
    public String toString() {
        return String.format("%s %s %s", name, quantity, category);
    }
}

