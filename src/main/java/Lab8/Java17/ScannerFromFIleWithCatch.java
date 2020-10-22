package Lab8.Java17;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ScannerFromFIleWithCatch {
    public static void main(String[] args) {
        try{
            Scanner in = new Scanner(new File("test.in"));
        } catch (FileNotFoundException ex){
            ex.printStackTrace();
        }
    }
}
