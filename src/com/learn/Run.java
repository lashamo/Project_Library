package com.learn;

import java.util.Arrays;
import java.util.Scanner;

public class Run {
    public static void main(String[] args) {
        System.out.println("-----Hello-----");
        Scanner scanner =new Scanner(System.in);
        Payment payment = new Payment();

        while (true){
            System.out.println("1. Manager");
            System.out.println("2. klients");
            System.out.println("0. Exit");

            int mode = scanner.nextInt();

            if (mode == 0){
                break;
            } else if (mode == 1) {
                payment = new Payment();
                while (true){
                    System.out.println("1. addBook");
                    System.out.println("0. Exit");

                    int type = scanner.nextInt();

                    if (type == 0){
                        break;
                    } else if (type == 1) {
                        System.out.println("Books name");
                        String name = scanner.next();
                        System.out.println("possible values:" + Arrays.toString(BookType.values()));
                        String bookType1 = scanner.next();
                        System.out.println("Please enter quantity");
                        int quantity = scanner.nextInt();
                        System.out.println("Price sold");
                        int price = scanner.nextInt();
                        System.out.println("Price rent");
                        int priceRent = scanner.nextInt();
                        Book book1 = new Book( name, bookType1, quantity, price, priceRent);
                        payment.addBook(book1);

                    }

                }



            }if (mode == 2){
                Payment payment1 = new Payment();
                System.out.println("You need buy or rent");
                System.out.println("please press 1 if you want to pay operation for buy ");
                System.out.println("please press if you want to pay operation for rent ");
                int press = scanner.nextInt();

                if (press == 1){

                }


            }

        }


    }
}
