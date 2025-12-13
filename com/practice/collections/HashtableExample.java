package com.practice.collections;

import java.util.Hashtable;
import java.util.Map;
import java.util.Scanner;

class Book{
    String bookname;
    String authorname;
    float price;
    Book(String bookname, String authorname, float price){
        this.bookname = bookname;
        this.authorname = authorname;
        this.price = price;
    }
}

public class HashtableExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int bookid;
        String bookname, authorname;
        float price;
        char choice;
        Map<Integer, Book> map = new Hashtable<>();
        do {
            System.out.println("Enter Book ID:");
            bookid = sc.nextInt();
            sc.nextLine(); // Consume newline
            System.out.println("Enter Book Name:");
            bookname = sc.nextLine();
            System.out.println("Enter Author Name:");
            authorname = sc.nextLine();
            System.out.println("Enter Book Price:");
            price = sc.nextFloat();
            Book book = new Book(bookname, authorname, price);
            map.put(bookid, book);
            System.out.println("Do you want to add more books? (y/n):");
            choice = sc.next().charAt(0);
        } while (choice == 'y' || choice == 'Y');
        sc.close();
        System.out.println("\n**********************************");
        System.out.println("The following books are in database");
        for(Map.Entry<Integer, Book> entry : map.entrySet()) {
            Book b = entry.getValue();
            System.out.println("Book ID: " + entry.getKey() + ", Book Name: " + b.bookname + ", Author Name: " + b.authorname + ", Price: " + b.price);
        }
    }
}
