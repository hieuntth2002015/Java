package Session07.Book;

import java.util.Scanner;

public class Book {
    int books[][];
    byte BookCount;
    String name;

    public Book() {
        books = new int[5][51];
        BookCount = 0;
    }

    void addBook() {
        Scanner input = new Scanner(System.in);

        if(BookCount < books.length) {
            System.out.printf("Enter the Name of The Student:");
            name = input.nextLine();

            System.out.println("Enter the Math of the Student: ");
            books[BookCount][0] = input.nextInt();

            System.out.println("Enter the Literature of the Student");
            books[BookCount][1] = input.nextInt();

            System.out.println("Enter the Physical of the Student: ");
            books[BookCount][2] = input.nextInt();

            System.out.println("Enter the chemical of the Student: ");
            books[BookCount][3] = input.nextInt();

            BookCount++;
        }else
            System.out.println("Sorry Unable to add more Marks: ");
    }
    void displayBooks() {
        if(BookCount > 0) {
            System.out.println("\n Name \t\t Math \t Literarure \t Physical \t Chemical");
            System.out.println("--------------------------------------------------------");

            for(int rowIndex = 0; rowIndex < BookCount; rowIndex++) {
                System.out.println("" + name);
                System.out.printf("%d\t\t", books[rowIndex][0]);
                System.out.printf("%d\t\t", books[rowIndex][1]);
                System.out.printf("%d\t\t", books[rowIndex][2]);
                System.out.printf("%d\t\t", books[rowIndex][3]);

            }
        }else
            System.out.printf("No Marks to display");
    }
    void searchMarks() {
        boolean bookFound = false;
        if(BookCount > 0) {
            Scanner input = new Scanner(System.in);
            System.out.println("\nEnter the Marks number of the book you" +
                    "want to search for: ");
            int searchMarks = input.nextInt();
            System.out.println(" Name \t\t Math \t Literarure \t Physical \t Chemical");
            System.out.println("-----------------------------------------------------");

            for(int rowIndex = 0; rowIndex < BookCount; rowIndex++) {
                if(books[rowIndex][0] == searchMarks ) {
                    System.out.printf("%d\t\t", books[rowIndex][0]);
                    System.out.printf("%d\t\t", books[rowIndex][1]);
                    System.out.printf("%d\t\t", books[rowIndex][2]);
                    System.out.printf("%d\t\t", books[rowIndex][3]);

                    bookFound = true;
                    break;
                }
            }
            if(!bookFound)
                System.out.printf("Marks not found ");
        }else
            System.out.println("No Marks to search");
    }
}
