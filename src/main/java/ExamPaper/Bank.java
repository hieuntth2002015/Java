package ExamPaper;

import java.util.Scanner;

public class Bank {
    public static void main(String[] args ) {
        double balance;
        double rate;
        double a,b;
        double interest;
        System.out.println("Enter the amount if monney:");
        Scanner balance1 = new Scanner(System.in);
        balance = balance1.nextInt();
        System.out.println("Enter the interest rate: ");
        Scanner rate1 = new Scanner(System.in);
        rate = rate1.nextInt();
        interest = balance*(rate/1200);
        System.out.println("The interest monthly payment:" + "$"+interest);


    }
}
