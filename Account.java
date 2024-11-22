package Project3;

import java.util.Scanner;

public class Account {
    private double balance = 0;
    private int accountNumber;
    private static int numberOfAccounts = 1000;

    static Scanner scan = new Scanner(System.in);

    private static void createAccount(int initialDeposit){
        balance = initialDeposit;
        accountNumber = numberOfAccounts + 1;
        numberOfAccounts = numberOfAccounts++;
    }

    private static void deposit(double moneyValue){
        System.out.println("Please input the amount you wish to deposit");
        balance = balance + moneyValue;
        System.out.println("Your current balance is $" + balance);
    }

    private static void withdraw(double moneyValue){
        System.out.println("Please input the amount you wish to withdraw");
        balance = balance - moneyValue;
        System.out.println("Your current balance is $" + balance);
    }

}
