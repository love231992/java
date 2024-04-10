import java.util.Objects;
import java.util.Scanner;

public class BankAccount {
    int accountNum;
    String accountHolderName;
    double balance;
    String accountType;
    Scanner scanner = new Scanner(System.in);

    public BankAccount(int accountNum, String accountHolderName, double balance, String accountType) {
        this.accountNum = accountNum;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
        this.accountType = accountType;
    }
    public void deposit (){
        System.out.print("How much $ you want to deposit : ");
        double depAmount = scanner.nextInt();
        if (depAmount > 0) {
            balance = balance + depAmount;
            System.out.println("Money has been deposited. New balance: $ " + balance);
        } else System.out.println("Invalid amount");

    }

    public void withdraw () {
        System.out.println("How much $ you want to withdraw");
        double amount = scanner.nextInt();
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn $" + amount + ". New balance: $" + balance);
        } else System.out.println("Insufficient fund or invalid amount");
    }

    public void display() {
        System.out.println("Account Holder Name : " + accountHolderName );
        System.out.println("Account Number : " + accountNum);
        System.out.println("Account Type : " + accountType);
        System.out.println("Balance : " + balance);
        System.out.print("Select 1 to deposit and 2 to withdraw or any other key to exit : ");
        String choice = scanner.nextLine();
        if (Objects.equals(choice, "1")) deposit();
        else if (Objects.equals(choice, "2")) withdraw();
        else {
            System.out.println("Exiting ...");
        }scanner.close();
    }


    public static void main(String[] args) {
        BankAccount ba = new BankAccount(123456,"Ajay",100,"Savings");
        ba.display();
    }
}
