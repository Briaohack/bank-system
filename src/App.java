import java.util.Scanner;
import java.util.Locale;

import entities.Account;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.println("WELCOM TO THE BANK OF MINHA ROLA");
        System.out.println("");
        System.out.print("Enter a ID for account: ");
        int id = sc.nextInt();
        System.out.print("Enter a name of the account: ");
        sc.nextLine();
        String name = sc.nextLine();

        Account account = new Account(name, id);

        double quantity;
        char option;

        do {
            System.out.print("YOU HAVE A MONEY TO DEPOSIT? (Y/N):");
            option = sc.next().charAt(0);

            if (option != 'Y' && option == 'y') {
                System.out.print("Enter the amount of money in account: ");
                quantity = sc.nextDouble();
                account.setQuantity(quantity);
            } else if (option != 'y' && option != 'Y' && option != 'n' && option != 'N') {
                System.out.println("INVALID INPUT!");
            }
        } while (option != 'y' && option != 'Y' && option != 'n' && option != 'N');

        System.out.println("Updated account data:");
        System.out.println(account);
        System.out.println("");

        System.out.print("Enter a quantity to deposity in you account: ");
        double value = sc.nextDouble();
        account.deposit(value);
        System.out.println("");

        System.out.println("Updated account data:");
        System.out.println(account);
        System.out.println("");

        System.out.println("Enter a quantity to withdraw: ");
        value = sc.nextDouble();
        account.withdraw(value);
        System.out.println();

        System.out.println("Updated account data:");
        System.out.println(account);

        sc.close();
    } // Method
} // Class
