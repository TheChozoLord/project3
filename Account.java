package Project3;

import java.util.Scanner;

public class Account {

    private double balance = 0;
    private int accountNumber;
    private static int numberOfAccounts = 1000;
    private Scanner scan = new Scanner(System.in);

    public Account(Double initialDeposit){
        this.balance = initialDeposit;
        this.accountNumber = numberOfAccounts + 1;
        accountNumber = numberOfAccounts++;
    }

    public double getBalance(){return balance;}
    public int getAccountNumber(){return accountNumber;}
    public int getNumberOfAccounts(){return numberOfAccounts - 1000;}
    public void deposit(double deposit){
        balance = balance + deposit;
    }
    public void withdrawl(double deposit){
        if (deposit <= balance) {
            balance = balance - deposit;
        }
        else {
            System.out.println("You have insufficient funds.");
        }
    }

    @Override
    public String toString() {
        return String.format("Account number: %d\n" + "Balance: %.2f\n",
                accountNumber, balance);
    }
}
