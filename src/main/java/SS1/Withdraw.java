package SS1;

import java.util.Scanner;

class Withdraw {
    public static void main(String[] args ) {
        double accountBalance = 100000.00;
        double withdraw = 0.00;
        boolean possible = false;
        System.out.println("Enter the Amount to withdraw: %");
        Scanner scan = new Scanner(System.in);
        withdraw = scan.nextDouble();

        possible = (accountBalance > withdraw);
        accountBalance = possible ? accountBalance - withdraw : accountBalance;
        System.out.printf("\nCurrent account balnce: $%.2f", accountBalance);
        System.out.println("\nTranscation Successful: " + possible);

    }
}
