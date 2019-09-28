package com.libraryManagementSystemSevice;

import com.libraryManagementSystem.utility.Book;
import com.libraryManagementSystem.utility.BookIssued;
import com.libraryManagementSystem.utility.BookStore;

import java.util.List;

public interface LibraryService {

    //This method helps to add library
    public Boolean add(Book book);

    //This method helps to display library details
    public void view();

    //This method helps to delete a book from a library
    public Boolean deleteBookItem(String name);

    //This method helps to search By book Title in a  library
    public BookStore searchByTitle(String title);

    //This method helps to book search By Author in a library
    public List<BookStore> searchByAuthor(String author);

    //This method helps to display book Issued  by user from library
    void bookIssued(BookIssued bookIssued);
}
