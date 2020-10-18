package ss15;

public class Invoice {
    private int ID;
    private Customer customer;
    private double amount;

    public Invoice(int ID, Customer customer, double amount) {
        this.ID = ID;
        this.customer = Customer;
        this.amount = amount;
    }
    public int getID(){return ID;}
    public Customer customer() {return customer;}

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
    public String getAmount(){return amount;}

    public void setAmount(double amount) {
        this.amount = amount;
    }
    public String getCustomerName(){
        this.customer = customer;
    }
    public double getAmountAfterDiscount() {}
}
