package Lab8.Java17;

import java.util.Scanner;

public class MethodCallStackDemo {
    public static void main(String[] args) {
        System.out.println("Enter main()");
        methodA();
        System.out.println("Exit main()");
    }

    private static void methodA() {
        System.out.println("Enter methodA()");
        methodB();
        System.out.println("Exit methodA()");
    }

    public static void methodB() {
        System.out.println("Enter methodB()");
        methodC();
        System.out.println("Exit methodb()");
    }
    public static void methodC(){
        System.out.println("Enter methodC() ");
        System.out.println("Exit methodC() ");
    }
}
