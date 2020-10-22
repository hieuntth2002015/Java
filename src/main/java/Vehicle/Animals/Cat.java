package Vehicle.Animals;

public class Cat extends Animals {
    private String Name;
    public Cat(boolean veg, String food, int legs) {
        super(veg,food,legs);
        this.Name = "Lady Cat";
    }
    public Cat(boolean veg, String food, int legs, String Name) {
        super(veg, food, legs);
        this.Name = Name;
    }
    public String getName() {
        return Name;
    }
    public void setName(String Name) {
        this.Name = Name;
    }
}
