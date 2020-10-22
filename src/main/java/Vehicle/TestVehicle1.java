package Vehicle;

public class TestVehicle1 {
    public static void main(String[] args) {
        FourWheeler1 objFour = new FourWheeler1("La-09 CS-1406", "Volkswagen", 4, true);
        objFour.showDetails();
        objFour.accelerate(200);
    }
}
