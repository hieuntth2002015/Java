package Lab8.javaCore.Circle;

public class Cylinder {
    private double height;

    public Cylinder(){
        super();
        height = 1.0;
    }
    public Cylinder(double height) {
        super();
        this.height= height;
    }
    public double getHeight() {
        return height;
    }
    public double getVolume() {
        return getArea()*height;
    }
    @Override
    public double getArea() {
        return "Cylinder: subclass of " + super.toString()+
    "height=" + height;
    }
}
