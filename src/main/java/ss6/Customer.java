package ss6;

public class Customer {
    int customerID;
    String customerName;
    String customerAddress;
    int customerAge;

    public static void main(String[] args) {
        Customer objCustomer1 = new Customer();

        objCustomer1.customerID = 100;
        objCustomer1.customerName = "John";
        objCustomer1.customerAddress= "123 Street";
        objCustomer1.customerAge = 30;

        System.out.println("Customer Identification number: " + objCustomer1.customerID);
        System.out.println("Customer Name: "  + objCustomer1.customerName);
        System.out.println("Customer address: " + objCustomer1.customerAddress);

    }
}



