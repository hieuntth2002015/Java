package ss6;

public class Account {
    private int accountID;
    private String holderName;
    private String accountType;

    {
        accountID = 100;
        holderName = "John Anderson";
        accountType = "Savings";
    }

    public void displayAcountDetails() {
        System.out.println("Acoount Details");
        System.out.println("=================");
        System.out.println("Account ID: " + accountID + "\nAccount Type:" + accountType);
    }
}
