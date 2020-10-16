package ss15;

public class book {
    private String name;
    private author author;
    private double price;
    private int qty;

    public book (String name, author author, double price) {
        this.name = name;
        this.author = author;
        this.price = price;
    }
    public book (String name, author author, double price, int qty) {
        this.name = name;
        this.author = author;
        this.price = price;
        this.qty = 0;
    }

    public String getName() {return name; }
    public author getauthor() {return author;}
    public double getprice() {return price;}

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public String toString() {
        return "'" + name + "'  by " + author;
    }
}
