package ss4;

public class CheckMarks {
    public static void main(String[] args) {
        int totalMarks = 59;

        if(totalMarks >= 90) {
            System.out.println("Grade = A + ");
        }else if(totalMarks >= 60) {
            System.out.println("Grade = A");
        }else if(totalMarks >= 30) {
            System.out.println("Grade = B");
        }else {
            System.out.println("Fial");
        }
    }
}