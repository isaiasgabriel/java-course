import java.util.Locale;
import java.util.Scanner;

import entities.Account;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new java.util.Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.print("Enter account number:");
        int number = scanner.nextInt();

        System.out.print("Enter account holder:");
        String name = scanner.next();

        System.out.print("Is there an initial deposit (y/n)? ");
        char response = scanner.next().charAt(0);

        Account userAccount;

        if (response == 'y' || response == 'Y') {
            System.out.print("Enter initial deposit value:");
            double initialDeposit = scanner.nextDouble();
            userAccount = new Account(number, name, initialDeposit);
        } else {
            userAccount = new Account(number, name);
        }

        System.out.println("Account data:");
        System.out.println(userAccount);

        System.out.println();

        System.out.print("Enter a deposit value:");
        double depositValue = scanner.nextDouble();
        userAccount.deposit(depositValue);
        System.out.println("Updated account data:");
        System.out.println(userAccount);

        System.out.println();

        System.out.print("Enter a withdraw value:");
        double withdrawValue = scanner.nextDouble();
        userAccount.withdraw(withdrawValue);
        System.out.println("Updated account data:");
        System.out.println(userAccount);

        scanner.close();
    }
}
