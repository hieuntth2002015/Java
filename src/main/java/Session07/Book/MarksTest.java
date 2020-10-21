package Session07.Book;

import java.util.Scanner;

public class MarksTest {
    public static void main(String[] args) {
        int choice;
        Scanner input = new Scanner(System.in);

        Book objBook = new Book();
        do {
            System.out.println("\nWelcome to E-repository: \n" +
                    "Selecet the operation you want to perform: ");
            System.out.println("********************************************");
            System.out.println("1. Add Marks to the repository.");
            System.out.println("2. Display Marks details.");
            System.out.println("3. Search Marks by Code Mark");
            System.out.println("4. Exit");
            System.out.println("*********************************************");
            choice = input.nextInt();

            switch (choice) {
                case 1:
                    objBook.addBook();
                    break;
                case 2:
                    objBook.displayBooks();
                    break;
                case 3:
                    objBook.searchMarks();
                    break;
                case 4:
                    break;
                default:
                    System.out.println("invalid choice");
                    break;
            }
        }while (choice != 4);
    }
}
