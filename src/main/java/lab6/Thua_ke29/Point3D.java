package lab6.Thua_ke29;

public class Point3D {
    private int z;

    public Point3D() {
        super();
        this.z =0;
    }

    public Point3D(int x, int y, int z) {
        super(x,y);
        this.z = z;
    }

    public void setz(int z) {
        this.z = z;
    }

    @Override
    public String toString() {
        return "(" + super.getX() + "," + super.getY() + "," + this.z + ")";
    }

}


