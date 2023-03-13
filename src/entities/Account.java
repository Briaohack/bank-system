package entities;

public class Account {

    private String name;
    private int idAccount;
    private double quantity;

    public Account() {

    }

    public Account(String name, int idAccount) {
        this.name = name;
        this.idAccount = idAccount;
    }

    public Account(String name, int idAccount, double quantity) {
        this.name = name;
        this.idAccount = idAccount;
        this.quantity = quantity;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getIdAccount() {
        return this.idAccount;
    }

    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }

    public double getQuantity() {
        return this.quantity;
    }

    public double withdraw(double value) {
        return quantity = quantity - value - 5.0;
    }

    public double deposit(double value) {
        return quantity += value;
    }

    public String toString() {
        return "Account ID: "
                + idAccount
                + ", "
                + "holder: "
                + name
                + ", "
                + "balance: $"
                + quantity;
    }

}