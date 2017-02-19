package com.company;

/**
 * Created by Marek on 2017-02-18.
 */
public class Book {
    private String title;
    private String author;
    private String isbn;
    private String publicationDate;
    private int issueNumber;

    public Book() {
        this.title = "";
        this.author = "";
        this.isbn = "";
        this.publicationDate = "";
        this.issueNumber = 0;
    }

    public Book(String title, String author, String isbn, String publicationDate, int issueNumber) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.publicationDate = publicationDate;
        this.issueNumber = issueNumber;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", isbn='" + isbn + '\'' +
                ", publicationDate='" + publicationDate + '\'' +
                ", issueNumber=" + issueNumber +
                '}';
    }
}
