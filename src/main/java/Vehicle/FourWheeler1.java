package Vehicle;

public class FourWheeler1 extends Vehicle{
    private boolean powerSteer;

    public FourWheeler1(String vId, String vName, int numWheels, boolean pSteer) {
        vehicleNo = vId;
        vehicleName = vName;
        wheels= numWheels;

        powerSteer = pSteer;
    }
    public void showDetails() {
        System.out.println("Vehicle no: " + vehicleNo);
        System.out.println("Vehicle Name: " + vehicleName);
        System.out.println("Number of Wheels: " + wheels);

        if(powerSteer ==true) {
            System.out.println("Power Steering : Yes");
        }
            else
            System.out.println("Powwe Steering: ");

        }
        @Override
                public void accelerate(int speed) {
            System.out.println("Maximum acceleration: " + speed+ "kmph");
        }
    }

