package Vehicle.Animals;

public class AnimalTest {
    public static void main(String[] args) {
        Cat cat = new Cat(false, "milk", 4, "Crazy Cat");

        System.out.println("cat is vegetarian?" +  cat.isVegetarian());
        System.out.println("Cat eats " + cat.getEats());
        System.out.println("Cat has" + cat.getSound());
        System.out.println("Cat name is " + cat.getName());
    }
}
