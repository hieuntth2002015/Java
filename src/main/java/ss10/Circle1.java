package ss10;

public class Circle1 {
    private double radius;
    private String color;

    public Circle1() {
        radius = 1.0;
        color = "red";
    }

    public Circle1(double r) {
        radius = r;
        color = "red";
    }

    public Circle1(double r, String c) {
        radius = r;
        color = c;
    }

    public double getRadius() {
        return radius;
    }
    public String getColor() {
        return color;
    }
}
