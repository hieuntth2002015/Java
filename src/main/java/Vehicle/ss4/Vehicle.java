package Vehicle.ss4;

public class Vehicle {
    protected String vehicleNo;
    protected String vehicleName;
    protected int wheels;

    public Vehicle(String vId, String vName, int numWheels) {
        vehicleNo = vId;
        vehicleName = vName;
        wheels = numWheels;
    }
    public void accelerate(int speed) {
        System.out.println("Acclerating at: " + speed + "kmph");
    }
}
