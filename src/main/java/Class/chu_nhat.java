package Class;

import java.util.Scanner;

public class chu_nhat {
    public static void main (String[] args) {
        int i , j, a, b;
        System.out.println("Enter the number of i:");
        Scanner giatrii = new Scanner(System.in);
        a = giatrii.nextInt();
        System.out.println("Enter the number of j:");
        Scanner gaitrij = new Scanner(System.in);
        b = gaitrij.nextInt();
        for(i= 1; i<=a; i++){
            for(j=1; j<=b; j++){
                System.out.printf("*");
            }
            System.out.println();
        }

    }
}
