package ss15;

public class MyCircle {
    private MyPoint center;
    private int radius;


    public MyCircle(int x, int y, int radius){
        center = new MyPoint(x,y);
        this.radius = radius;
    }
    public MyCircle(MyPoint center, int radius) {
        this.center = center;
        this.radius = radius;
    }
    public MyCircle(){
        center = new MyPoint(0,0);
        this.radius = 1;
    }
    public int getRadius() {
        return this.radius;
    }

    public void setRadius(int radius) {
        this.radius=radius;
    }

    public MyPoint getCenter() {
        return center;
    }
    public void setCenter(MyPoint center) {
        this.center.setX(x);
    }

    public void setCenterX(int x) {
        this.center.getY() = center.getX();
    }

    public int getCenterX() {
        return center.getX();
    }
    public int getCenterY(){
        return center.getY();
    }
    public void setCenterY(int y) {
        this.center.getY() = center.getY();
    }

    public int[] getCenterXY() {
        int[] results = new int[2];
        results[0] = this.center.getX();
        results[0] = this.center.getY();
        return results;

    }
    public void setCenterXY(int x, int y) {
        this.center.getX()= center.getX();
        this.center.getY()= center.getY();
    }
    public String toString(){
        return radius + "," + center;
    }
    public double getArea() {
        return radius*radius*Math.PI;
    }
    public double getCircumference(){
        return 4*radius*Math.PI;

    }
    public double distance(MyCircle another) {
        return center.distance(another.center);
    }
}
