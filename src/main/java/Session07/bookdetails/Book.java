package Session07.bookdetails;

import java.util.Scanner;

public class Book {
    int books[][];
    byte BookCount;

    public Book() {
        books= new int[3][3];
        BookCount = 0;
    }

    void addBook() {
        Scanner input = new Scanner(System.in);

        if(BookCount < books.length) {
            System.out.println("Enter the ISBN number of the book: ");
            books[BookCount][0] = input.nextInt();

            System.out.println("Enter the number of pages in the book:");
            books[BookCount][1] = input.nextInt();

            System.out.println("Enter the year of publication");
            books[BookCount][2] = input.nextInt();

            BookCount++;
        }else
            System.out.println("Sorry Unable to add more books.\n");
    }

    void displayBooks() {
        if(BookCount > 0) {
            System.out.println("\n ISBN \t\t Pages \t Publication Year");
            System.out.println("--------------------------------------");

            for(int rowIndex = 0; rowIndex < BookCount; rowIndex++) {
                System.out.printf("%d\t\t", books[rowIndex][0]);
                System.out.printf("%d\t\t", books[rowIndex][1]);
                System.out.printf("%d\t\t", books[rowIndex][2]);
            }
        }else
            System.out.println("No Books to display");
     }
     void searchByIsbn() {
        boolean bookFound = false;
        if(BookCount > 0) {
            Scanner input = new Scanner(System.in);
            System.out.println("\nEnter the ISBN number of the book you" +
                    "want to search for: ");
            int searchIsbn = input.nextInt();
            System.out.println(" ISBN \t\t Pages \t Publication year");
            System.out.println("------------------------------------");

            for(int rowIndex = 0; rowIndex < BookCount; rowIndex++) {
                if(books[rowIndex][0] == searchIsbn) {
                    System.out.printf("%d\t\t", books[rowIndex][0]);
                    System.out.printf("%d\t\t", books[rowIndex][1]);
                    System.out.printf("%d\n", books[rowIndex][2]);
                    bookFound = true;
                    break;
                }
            }
            if(!bookFound)
                System.out.println("Book not found");
        }else
            System.out.println("No books to search");
     }
     void searchYear() {
        boolean bookFound = false;
        if(BookCount > 0) {
            Scanner input = new Scanner(System.in);
            int publicationYear = input.nextInt();
            System.out.println(" ISBN \t\tPages \t Publication Year");
            System.out.println("------------------------------------");

            for(int rowIndex = 0; rowIndex < BookCount; rowIndex++) {
                if(books[rowIndex][2] == publicationYear) {
                    System.out.printf("%d\t\t", books[rowIndex][0]);
                    System.out.printf("%d\t\t", books[rowIndex][1]);
                    System.out.printf("%d\t\t", books[rowIndex][2]);

                    bookFound = true;
                }
            }
            if(!bookFound)
                System.out.println("Book not found .");
        } else
            System.out.println("No Books to search");
     }
}
