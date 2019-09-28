package com.libraryManagementSystem.utility;

public class Author {
    /**
     * This class helps to store author Information as a Object.
     */
    private String authorName;

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public Author(String authorName) {
        this.authorName = authorName;
    }
}
