package ss6;

public class TestObjectRefernces {
    public static void main(String[] args) {
        Rectangle objRec1 = new Rectangle(10,20);
        Rectangle objRec2;
        objRec2 =objRec1;

        System.out.println("\nRectangle1 Details");
        System.out.println("=====================");

        objRec1.displayDimension();

        System.out.println("\nRectangle2 Detials");
        System.out.println("=====================");
        objRec2.displayDimension();
    }
}
