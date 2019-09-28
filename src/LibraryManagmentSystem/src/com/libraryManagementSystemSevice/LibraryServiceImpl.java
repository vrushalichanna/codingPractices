package com.libraryManagementSystemSevice;

import com.libraryManagementSystem.utility.*;

import java.util.ArrayList;
import java.util.List;

public class LibraryServiceImpl implements LibraryService {

    static List<BookStore> bookList = new ArrayList<>();
    static List<BookIssued> issuedBooksList = new ArrayList<>();
    static List<BookIssued> returnBooksList = new ArrayList<>();

    static LibraryServiceImpl library = null;

    private LibraryServiceImpl() {
    }

    public static LibraryServiceImpl getInstance() {
        if (library == null)
            return new LibraryServiceImpl();
        return library;
    }


    @Override
    public Boolean add(Book newBook) {
        BookStore book = isExist(newBook);
        if (book == null) {
            bookList.add(new BookStore(1, newBook));
            return true;
        }
        book.setQuntity(book.getQuntity() + 1);
        return true;
    }

    private BookStore isExist(Book newItem) {
        for (BookStore item : bookList) {
            if (item.getBook().getTitle().equals(newItem.getTitle())) {
                return item;
            }
        }
        return null;
    }

    @Override
    public void view() {
        for (BookStore book : bookList)
            System.out.println(book.toString());
    }

    @Override
    public Boolean deleteBookItem(String title) {
        BookStore book = searchByTitle(title);
        if (book != null) {
            bookList.remove(book);
            return true;
        }
        return false;
    }

    @Override
    public BookStore searchByTitle(String title) {
        List<BookStore> store = new ArrayList<>();
        for (int i = 0; i < bookList.size(); i++) {
            BookStore book = bookList.get(i);
            if (book.getBook().getTitle().equals(title)) {
                return book;
            }
        }
        return null;
    }


    @Override
    public List<BookStore> searchByAuthor(String author) {
        List<BookStore> searchByAuthor = new ArrayList<>();
        for (BookStore book : bookList) {
            List<Author> authorList = book.getBook().getAuthors();
            for (Author author1 : authorList) {
                if (author1.getAuthorName().equals(author)) {
                    searchByAuthor.add(book);
                }
            }

        }
        return searchByAuthor;
    }

    @Override
    public void bookIssued(BookIssued bookIssued) {
        List<BookStore> searchByTitle = new ArrayList<>();
        for (BookStore book : bookList) {
            if (book.getBook().getTitle().equals(bookIssued.getBookName())) {
                issuedBooksList.add(bookIssued);
                System.out.println(book.toString());
            } else {
                System.out.println("Sorry...! Book requied book is not available...");
            }
        }
    }

}