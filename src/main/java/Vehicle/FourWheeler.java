package Vehicle;

public class FourWheeler extends Vehicle{
    private boolean powerSteer;
    public FourWheeler(String vId, String vName, int numbWheels, boolean pSteer) {
        vehicleNo = vId;
        vehicleName = vName;
        wheels = numbWheels;
        powerSteer = pSteer;
    }
    public void showDetails() {
        System.out.println("Vehicle no: " + vehicleNo);
        System.out.println("Vehicle Name: " + vehicleName);
        System.out.println("Number of Wheels: " + wheels);

        if(powerSteer == true)
            System.out.println("Power Steering: Yes");
        else
            System.out.println("Power Streering: NO");
    }
}

