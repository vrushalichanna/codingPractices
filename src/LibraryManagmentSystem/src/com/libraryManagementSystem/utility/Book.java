package com.libraryManagementSystem.utility;

import java.util.List;
/**
 * This class helps to store Book Information as a Object.
 */
public class Book {

    private String bookId;
    private String title;
    private Category category;
    private List<Author> authors;


    public String getBookId() {
        return bookId;
    }

    public String getTitle() {
        return title;
    }

    public Category getCategory() {
        return category;
    }

    public List<Author> getAuthors() {
        return authors;
    }

    public Book(String bookId, String title, Category category, List<Author> authors) {
        this.bookId = bookId;
        this.title = title;
        this.category = category;
        this.authors = authors;
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookId='" + bookId + '\'' +
                ", title='" + title + '\'' +
                ", category=" + category +
                ", authors=" + authors +
                '}';
    }
}
