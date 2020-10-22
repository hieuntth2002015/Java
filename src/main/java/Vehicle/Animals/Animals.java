package Vehicle.Animals;

public class Animals {
    private boolean vegetarian;
    private String Sound;
    private String Eats;
    private int AnimalLegs;

    public Animals(boolean veg, String food, int legs) {}
    public Animals(boolean veg, String Sound, int Legs, String food) {
        this.vegetarian = veg;
        this.Sound = Sound;
        this.AnimalLegs = Legs;
        this.Eats = food;
    }

    public boolean isVegetarian(){
        return vegetarian;
    }

    public void setVegetarian(boolean vegetarian) {
        this.vegetarian= vegetarian;
        }
    public String getEats() {
        return Eats;
    }
    public String getSound() {
        return Sound;
    }

}
