package com.libraryManagementSystem.utility;

public class BookStore {
    /**
     * This class helps to store book along with quntity in Library Information as a Object.
     */

    private Integer quntity;
    private Book book;

    public BookStore(Integer quntity, Book book) {
        this.quntity = quntity;
        this.book = book;
    }

    public Integer getQuntity() {
        return quntity;
    }

    public Book getBook() {
        return book;
    }

    public void setQuntity(Integer quntity) {
        this.quntity = quntity;
    }

    public void setBook(Book book) {
        this.book = book;
    }
}
