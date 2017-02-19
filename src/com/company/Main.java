package com.company;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static List<Book> bookList = new ArrayList<>();

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
                    if(list.size()>0){
                        for(int i=0; i<list.size();i++){
                            System.out.println("Pozycja "+ (i+1) + " " + list.get(i).toString());
                        }
                        System.out.println();
                    }else{
                        System.out.println("Brak książek w bazie");
                    }

                    break;
                case 2:


                    //String title, String author, String isbn, String publicationDate, int issueNumber
                    System.out.println("Tytuł:");
                    String title = sc.nextLine();
                    System.out.println("Autor:");
                    String author = sc.nextLine();
                    System.out.println("ISBN:");
                    String isbn = sc.nextLine();
                    System.out.println("Data publikacji:");
                    String publicationDate = sc.nextLine();
                    System.out.println("Wydanie:");
                    int issueNumber = sc.nextInt();
                    list.add(new Book(title, author, isbn, publicationDate, issueNumber));
                    System.out.println();
                    break;
                case 3:

                    System.out.println("Podaj nr książki którą chcesz usunąć: ");
                    int nDelete = sc.nextInt();
                    list.remove((nDelete-1));
                    break;
            }

        }while(choice!=4);
    }


}
