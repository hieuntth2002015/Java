package vd5;

public class TestTime {
    public static void main(String[] args) {
        int hour = 24, minute = 58, second  = 58;
        Time t12;

        try {
            t12 = new Time(second, minute, hour ) ;
            System.out.println("valid input ");
        } catch(IllegalArgumentException ex) {
            ex.printStackTrace();
            System.out.println("Error is intput. Set to default value ");
            t12 = new Time();
        }

        System.out.println("Time is : " + t12);
        System.out.println("Life goes on...");
    }
}
