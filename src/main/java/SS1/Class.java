package SS1;

import java.util.Scanner;

public class Class {
    public static void main(String[] args) {
        int a, b,c,d,e,f;
        int thidkSum, billSum;
        int thidkPercent, billPercent;
        System.out.println("ThiDK");
        System.out.println("Enter marks obtained in Maths: ");
        Scanner marths1 = new Scanner(System.in);
        a = marths1.nextInt();
        System.out.println("Enter marks obtained in Science: ");
        Scanner Science1 = new Scanner(System.in);
        b = Science1.nextInt();
        System.out.println("Enter marks obtained in English: ");
        Scanner English1 = new Scanner(System.in);
        c = English1.nextInt();
        System.out.println("Bill");
        System.out.println("Enter marks obtained in Maths: ");
        Scanner marths2 = new Scanner(System.in);
        d = marths2.nextInt();
        System.out.println("Enter marks obtained in Science: ");
        Scanner Science2 = new Scanner(System.in);
        e = Science2.nextInt();
        System.out.println("Enter marks obtained in Science: ");
        Scanner English2 = new Scanner(System.in);
        f = English2.nextInt();

        System.out.println("\nMarks of ThiDK:");
        System.out.println("Maths = " + a);
        System.out.println("Science = " + b);
        System.out.println("English = " + c);

        System.out.println("\nMarks of Bill:");
        System.out.println("Maths = " + d);
        System.out.println("Science = " + e);
        System.out.println("English = " + f);

        thidkSum = a + b + c;
        billSum = d + e + f;

        thidkPercent = thidkSum * 100/300;
        billPercent = billSum * 100/300;

        System.out.println("\nTotal Marks scored by Thidk = " + thidkSum);
        System.out.println("Percent age = "+ thidkPercent);

        System.out.println("\nTotal Marks scored by Bill = " + billSum);
        System.out.println("Percent age = " + billPercent);

        System.out.print("\nIs  ThiDk 's percent age lesser than Bill?");
        System.out.println(thidkPercent < billPercent? "Yes" : "No");

        System.out.print("\nIs ThiDK is percentage greater than Bill?");
        System.out.println( thidkPercent> billPercent? "Yes" : "No");

        System.out.print("\nThidk's and Bill's percentage are equal ? ");
        System.out.println(thidkPercent == billPercent ? "yes" : "No");

        System.out.print("\nScholarship Amount for Thidk = $");
        System.out.println(thidkPercent > 75 ? 20000 : (thidkPercent >= 60 && thidkPercent <= 75) ?10000: 0);
        System.out.print("\nScholarship Amount for Bill = %");
        System.out.println(billPercent > 75 ? 2000: (billPercent >= 60 && billPercent <=75) ? 10000: 0);


    }
}
