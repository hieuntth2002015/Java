package ss15;

public class TestCustomer {
    public static void main(String[] args) {
        Customer thieu= new Customer(123, "trung hieu", 20);
        System.out.println(thieu);
        thieu.setDiscount(20);
        System.out.println(thieu);
        System.out.println("ID is :" , thieu.getID());
        System.out.println("Name is :" + thieu.getName());
        System.out.println("Discount is: " + thieu.getDiscount());
    }
}
