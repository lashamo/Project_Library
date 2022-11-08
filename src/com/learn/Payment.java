package com.learn;

import java.util.Scanner;

public class Payment implements IPay{
    public static final int MAX_BOOK = 100;
    private Book[] books;
    private int bookAmount;
    public Payment(){
        books = new Book[MAX_BOOK];
    }

    public Book[] getBooks() {
        return books;
    }


    @Override
    public void buy(int index) {
        Book book = books[index];
        if (book.getQuantity() == 0){
            System.out.println("you can't buy");
        }else {
            System.out.println("Congratulation");
            book.setQuantity(book.getQuantity() - 1);
        }


    }





    @Override
    public void showBook() {
        for (int i = 0; i < bookAmount; i++ ){
            books[i].printInfo();

        }

    }

    @Override
    public void addBook(Book book) {
        books[bookAmount]=book;
        bookAmount++;

    }

    public void buy(String next) {
        Book book = books[Integer.parseInt(next)];
        if (book.getQuantity() == 0){
            System.out.println("you can't buy");
        }else {
            System.out.println("Congratulation");
            book.setQuantity(book.getQuantity() - 1);
        }


    }
}
