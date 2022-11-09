package com.learn;

public class Book {

    private BookType type;
    private String name;
    private int quantity;

    public Book(BookType type, String name, int quantity){
        this.type=type;
        this.name=name;
        this.quantity=quantity;
    }

    public BookType getType() {
        return type;
    }

    public void setType(BookType type) {
        this.type = type;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public double sellBook(double price){
        return price;
    }

    public double rentBook(double price){
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void printInfo(){
        System.out.println("About Book :"+ type + " " + name + " " + quantity);
    }
}
