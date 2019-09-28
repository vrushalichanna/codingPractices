package com.libraryManagmentSystem;

import com.libraryManagementSystem.utility.Library;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {
        /**
         * This method helps to invoke action based on selected options from the menu.
         * @param selectedOption
         * 		- Contains options value from 1 to 7
         * @throws Exception
         */
        Library library = Library.getInstance();
        boolean flag = true;
        Scanner c = new Scanner(System.in);
        //Call scanner to get value as input
        while (flag) {
            System.out.println("********************************************");
            System.out.println("  Welcome to Library Management System ");
            System.out.println("********************************************");
            System.out.println("--- Please select you option to take action --- ");
            System.out.println("Press 1 to Add Book");
            System.out.println("Press 2 to Delete a book");
            System.out.println("Press 3 to Search book by title");
            System.out.println("Press 4 to Search book by author");
            System.out.println("Press 5 to Issue books to user");
            System.out.println("Press 6 to View book list");
            System.out.println("Press 7 to exit");
            int choice = c.nextInt();

            switch (choice) {
                case 1:
                    library.addBook();
                    //Call method to Add Books to library
                    break;
                case 2:
                    library.deleteBook();
                    //Call method to delete Book from library
                    break;
                case 3:
                    library.searchByTitle();
                    //Call method to search Book By Title in library
                    break;
                case 4:
                    library.searchByAuthor();
                    //Call method to search Book By Author in library
                    break;
                case 5:
                    library.issueBookToUser();
                    //Call method to issue Book To User from library
                    break;
                case 6:
                    library.viewBookList();
                    //Call method to display library information
                    break;
                case 7:
                    System.exit(0);
                    //Call method to exit from library Management system
                default:
                    System.out.println("Invalid input");
                    //To display invalid input
                    break;
            }
        }
    }


}
