package ss6;

public class Rectangle10 {
    int width;
    int height;

    Rectangle() {
        System.out.println("Constructor Invoked...");
        width = 10;
        height = 10;
    }
    Rectangle (int wid, int heig) {
        System.out.println("Parameterized Constructor");
        width = wid;
        height = heig;
    }
    void displayDimension() {
        System.out.println("Width: " + width);
        System.out.println("Width: " + height);
    }
}
