package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static List<Book> bookList = new ArrayList<Book>();

    public static void main(String[] args) {

        menu(bookList);
    }

    public static void menu(List<Book> list){
        Scanner sc = new Scanner(System.in);
        int choice;

        do{
            System.out.println("Biblioteka");
            System.out.println("--------------------");
            System.out.println("1. Zobacz ksiązki");
            System.out.println("2. Dodaj ksiązkę");
            System.out.println("3. Usuń książkę");
            System.out.println("4. Zakończ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice){
                case 1:
                    System.out.println("Tytuł:");
                    String title = sc.nextLine();
                    
                    list.add(new Book(title, ));
                    break;
            }

        }while(choice!=4);
    }

}
