package com.libraryManagementSystem.utility;

import com.libraryManagementSystemSevice.LibraryService;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * This class helps to maintain library.
 */

public class Library {
    private Library() {
    }

    Scanner c = new Scanner(System.in);
    LibraryService libraryService;

    // static variable library_instance of type Library
    private static Library library_instance = null;

    // static method to create instance of Library class
    public static Library getInstance() {
        if (library_instance == null)
            library_instance = new Library();
        return library_instance;
    }

    /**
     * This method helps to add Book to  library
     * - Contains libraries information in the List
     */
    public void addBook() throws Exception {
        System.out.println("Enter Book ID.");
        String bookId = c.nextLine();
        System.out.println("Enter Book title.");
        String title = c.nextLine();
        System.out.println("Enter Author Name");
        List<Author> authorlist = new ArrayList<>();
        String authorname = c.nextLine();
        Author author = new Author(authorname);
        authorlist.add(new Author(author.getAuthorName()));
        System.out.println("Enter Category");
        Category category = Category.valueOf(c.nextLine().toUpperCase());
        Book book = new Book(bookId, title, category, authorlist);
        libraryService.add(book);
    }

    /**
     * This method helps to Delete Book from  library
     */
    public void deleteBook() {
        System.out.println("Enter Book Title to search");
        String title = c.nextLine();
        libraryService.deleteBookItem(title);
    }

    /**
     * This method helps to search Book By Title in  library
     */
    public BookStore searchByTitle() {
        System.out.println("Enter Book Title to search");
        String title = c.nextLine();
        return libraryService.searchByTitle(title);
    }

    public List<BookStore> searchByAuthor() {
        System.out.println("Enter Book Title to search");
        String author = c.nextLine();
        return libraryService.searchByAuthor(author);
    }

    /**
     * This method helps to issue Book To User from  library
     */
    public void issueBookToUser() {
        System.out.println("Enter Book Name to issue");
        String bookName = c.nextLine();
        System.out.println("Enter User Name ");
        String userName = c.nextLine();
        String uniqueID = UUID.randomUUID().toString();
        DateFormat df = new SimpleDateFormat("dd/MM/yy");
        Date dateobj = new Date();
        String dateOfIssued = df.format(dateobj);
        BookIssued BookIssued = new BookIssued(uniqueID, bookName, userName, dateOfIssued);
        libraryService.bookIssued(BookIssued);
    }

    /**
     * This method helps to view BookList of a library
     */
    public void viewBookList() {
        libraryService.view();
    }


}
