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
        numberOfAccounts = numberOfAccounts++;
    }

    public double getBalance(){return balance;}
    public int getAccountNumber(){return accountNumber;}
    public int getNumberOfAccounts(){return numberOfAccounts - 1000;}
    private void deposit(){
        System.out.println("Input deposit amount: ");
        int deposit = Integer.parseInt(scan.nextLine());
        balance = balance + deposit;
    }
    private void withdrawl(){
        System.out.println("Input deposit amount: ");
        int deposit = Integer.parseInt(scan.nextLine());
        balance = balance - deposit;
    }

    @Override
    public String toString() {
        return String.format("Account number: %d\n" + "Balance: %d\n",
                accountNumber, balance);
    }
}
