import model.entities.Account;
import model.exception.AccountException;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            Locale.setDefault(Locale.US);

        try {

            System.out.println("Enter account data: ");
            System.out.print("Number: ");
            int number = sc.nextInt();

            System.out.print("Holder: ");
            String holder = sc.next();

            System.out.print("Initial balance: ");
            double balance = sc.nextDouble();

            System.out.print("Withdraw limit: ");
            double limit = sc.nextDouble();

            System.out.print("Enter amount for withdraw: ");
            double with = sc.nextDouble();

            Account account = new Account(number, holder, balance, limit);

            account.withdraw(with);
            System.out.println(account.getBalance());
        }

        catch (IllegalArgumentException e){
            System.out.println("Insufficient funds error: " + e.getMessage());
        }
        catch (AccountException e){
            System.out.println("Withdrawal error: " + e.getMessage());

        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        }

    }
}