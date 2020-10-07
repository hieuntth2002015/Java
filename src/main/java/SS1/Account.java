package SS1;

import java.util.Scanner;

public class Account {
    public static void main(String[] args) {
        int accountNumber;
        double accountBalance;

        System.out.println("ENter the details for the new Account to be create Account");
        System.out.println("Enter the Account Number: ");
        Scanner hieu = new Scanner(System.in);
        accountNumber = hieu.nextInt();
        System.out.println("Enter the Account Balance:");
        accountBalance = hieu.nextDouble();

        System.out.println("The details of the new account are:");
        System.out.printf("Account Number: %d", accountNumber);
        System.out.printf("\nAccount Balance: $%.2f", accountBalance);
    }
}
