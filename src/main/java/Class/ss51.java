package Class;

import java.util.Scanner;

import static java.lang.System.out;

public class ss51 {
    public static void main(String[] args) {
        int i , j,a ;
        System.out.println("Enter the number of i:");
        Scanner giatrii = new Scanner(System.in);
        a = giatrii.nextInt();

        for(i= 1; i<=a; i++){
            for(j=1; j<=i; j++){
                System.out.printf("%d", j);
            }
            System.out.println();
        }

    }
}
