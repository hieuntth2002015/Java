package Class;

import ss11.Time;

public class TestTime {
    public static void main(String[] args) {
        ss11.Time t1 = new ss11.Time(1,2,3);
        System.out.println(t1);
        ss11.Time t2 = new Time();
        System.out.println(t2);

        t1.setHour(4);
        t1.setMinute(5);
        t1.setSecond(6);
        System.out.println(t1);
        System.out.println("Hour is : " + t1.getHour());
        System.out.println("Minnute is " + t1.getMinute());
        System.out.println("Second is " + t1.getSecond());

        t1.setTime(58,59,23);
        System.out.println(t1);

        System.out.println(t1.nextSecond());
        System.out.println(t1.nextSecond().nextSecond().nextSecond());
    }
}
