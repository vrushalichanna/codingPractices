package com.libraryManagementSystemSevice;

import com.libraryManagementSystem.utility.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LibraryServiceImpl implements LibraryService {

    List<BookStore> bookList = new ArrayList<>();
    List<BookIssued> issuedBooksList = new ArrayList<>();


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
        for (BookStore book : bookList) {
            System.out.println(book.getBook().getTitle());
            System.out.println(book.getBook().getAuthors());
            System.out.println(book.getBook().getBookId());
            System.out.println(book.getBook().getCategory());
            System.out.println(book.getQuntity());
        }
//        System.out.println(bookList);
    }


    @Override
    public Boolean deleteBookItem(String title) {
        BookStore book = searchByTitle(title);
        if (book != null) {
            bookList.remove(book);
            System.out.println("Book Deleted =:" + book.getBook().getTitle());
            return true;
        }
        return false;
    }

    @Override
    public BookStore searchByTitle(String title) {
        List<BookStore> store = new ArrayList<>();
        if (bookList.size() > 0) {
            for (int i = 0; i < bookList.size(); i++) {
                BookStore book = bookList.get(i);
                if (book.getBook().getTitle().equals(title)) {
                    System.out.println("Book Found In library =:" + book.getBook().getTitle());
                    return book;
                }
            }
        } else {
            System.out.println("No books found in the library");
        }
        return null;
    }


    @Override
    public List<BookStore> searchByAuthor(String author) {
        List<BookStore> searchByAuthor = new ArrayList<>();
        if (searchByAuthor.size() > 0) {
            for (BookStore book : bookList) {
                List<Author> authorList = book.getBook().getAuthors();
                for (Author author1 : authorList) {
                    if (author1.getAuthorName().equals(author)) {
                        System.out.println("Author Book Found In library =:" + book.getBook().getAuthors());
                        searchByAuthor.add(book);
                    }
                }

            }
        } else {
            System.out.println("No books found in the library");
        }
        return null;
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