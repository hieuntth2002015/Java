package Vehicle.ss4;

public class Testvehicle {
    public static void main(String[] args) {
        FourWheeler objFour = new FourWheeler("LA-09 CS-1406", "Volkswagen", 4, true);
        objFour.showDetails();
        objFour.accelerate(200);
    }
}
