package ss7;

public class Circle2 {
    float area;
    public float getPI() {
        return (float) 3.14;
    }
    public void calcArea(int rad) {
        this.area = this.getPI() * rad * rad;
    }
}
