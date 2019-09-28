package com.libraryManagementSystem.utility;

/**
 * This class helps to store Book Issued Information as a Object.
 */
public class BookIssued {

    private String uniqueID, bookName, userName, dateOfIssued;

    public BookIssued(String uniqueID, String bookName, String custName, String dateOfIssued) {
        this.uniqueID = uniqueID;
        this.bookName = bookName;
        this.userName = custName;
        this.dateOfIssued = dateOfIssued;
    }

    @Override
    public String toString() {
        return "IssuedBooks{" +
                "uniqueID='" + uniqueID + '\'' +
                ", bookName='" + bookName + '\'' +
                ", userName='" + userName + '\'' +
                ", dateOfIssued='" + dateOfIssued + '\'' +
                '}';
    }

    public String getBookName() {
        return bookName;
    }

    public String getUserName() {
        return userName;
    }
}
