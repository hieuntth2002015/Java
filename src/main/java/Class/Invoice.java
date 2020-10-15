package Class;
import java.util.Scanner;

class Invoice {
    public static void main(String[] args) {
    double Shirts =300, Trousers =700;
    int Quantity;
    double Total;
    int Amounta, Amountb;
    double Totala, Totalb;
    double Discount=90,s, amount, point,net;
    System.out.println("Enter the number of Shirst to order:");
    Scanner Shirst1 = new Scanner(System.in);
    Amounta = Shirst1.nextInt();
    System.out.println("Enter the number of Trousers to order: ");
    Scanner Trousers1 = new Scanner(System.in);
    Amountb = Trousers1.nextInt();

    Totala = Shirts*Amounta;
    Totalb = Trousers*Amountb;
    Total = Totala + Totalb;
    s =100-Discount;

    if (Total >3000)
        amount = (s*Total)/100;
    else
        amount = 0*Total;
    System.out.println("Item \t\t Quantity \tPrice \tTotal");
    System.out.println("----------------------------------------------------");
    System.out.println("Shirts \t\t" + Amounta +"\t\t" + Shirts +"\t\t" + Totala);
    System.out.println("Trousers \t" + Amountb +"\t\t" + Trousers +"\t\t" + Totalb);
    System.out.println("Discount \t\t\t\t\t\t" + amount);
    net = Total -amount;
    System.out.println("----------------------------------------------------");
    System.out.println("Net Total\t\t\t\t\t\t"+ net);
    System.out.println("----------------------------------------------------");
    point=Total/100;
    System.out.println("Point Earned \t\t" + point);
    System.out.println("Thank you!");

    }
}
