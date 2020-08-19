package com.jalasoft.project.controller.entity;

public class Product extends Entity{

    private int price;

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Product(int price) {
        this.price = price;
    }
}
