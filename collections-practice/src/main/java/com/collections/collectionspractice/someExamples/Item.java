package com.collections.collectionspractice.someExamples;

public class Item {

    private String name;
    private int qty;
    private Double price;

    public Item() {

    }

    public Item(String name, int qty, Double price) {
        this.name = name;
        this.qty = qty;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public Item setName(String name) {
        this.name = name;
        return this;
    }

    public int getQty() {
        return qty;
    }

    public Item setQty(int qty) {
        this.qty = qty;
        return this;
    }

    public Double getPrice() {
        return price;
    }

    public Item setPrice(Double price) {
        this.price = price;
        return this;
    }

    @Override
    public String toString() {
        return "Item{" +
                "name='" + name + '\'' +
                ", qty=" + qty +
                ", price=" + price +
                '}';
    }
}
