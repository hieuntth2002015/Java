package ss15;

public class TestMyCircle {
    public static void main(String[] args) {
        MyCircle c1 = new MyCircle();
        System.out.println(c1);

        MyCircle c2= new MyCircle(1,2,3.3);
        System.out.println(c2);

        MyCircle c3 = new MyCircle(new MyPoint(4,5), 6.6);
        System.out.println(c3);

        c1.setCenter(new MyPoint(11,12));
        c1.setRadius(13.3);
        System.out.println(c1);
        System.out.println("center is : " + c1.getCenter());
        System.out.println("radius is : " + c1.setRadius());

        c1.set
    }
}
