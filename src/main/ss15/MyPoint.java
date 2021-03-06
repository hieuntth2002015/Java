package ss15;

public class MyPoint {
    private int x,y;

    public MyPoint() {
        x = 0;
        y = 0;
    }
    public MyPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public int getX() {return this.x;}
    public int getY() {return this.y;}
    public void setX(int i) {
        this.x = x;
    };
    public void setY() {
        this.y = y;
    };

    public int[] getXY() {
        int[] results = new int[2];
        results[0] = this.x;
        results[0] = this.y;
        return results;
    }
    public void setXY(int x, int y) {
        this.x=x;
        this.y=y;
    }
    public String toString(){
        return "(" + this.x + "," + this.y+ ")";
    }

    public double distance(int x, int y) {
        int  xDiff = this.x -x;
        int yDiff= this.y-y;
        return Math.sqrt(xDiff*xDiff + yDiff*yDiff);
    }

    public double distance(MyPoint another) {
        int xDiff = this.x - another.x;
        int yDiff = this.y - another.y;
        return Math.sqrt(xDiff*xDiff + yDiff*yDiff);
    }
    public double distance() {return Math.sqrt(this.x*this.x + this.y*this.y);}

}
