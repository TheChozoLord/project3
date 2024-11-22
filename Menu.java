package Project3;

import javax.swing.*;
import java.util.Scanner;
    Bank bank = new Bank();
    Customer custard = new Customer();
    Account acc = new Account();

public class Menu {
    static Scanner scan = new Scanner(System.in);
    public static void runMenu(){
        int menuSelect;
        System.out.println("Please make a selection");
        System.out.println("1) Open an account");
        System.out.println("2) Create new account");
        System.out.println("3) Close all accounts");
        System.out.println("4) Quit");
        menuSelect = Integer.parseInt(scan.nextLine());
        if (menuSelect == 1){
            System.out.println("Please input your PIN number");
            int pin = Integer.parseInt(scan.nextLine());
            bank.findCustomer(pin);
        }
        else if (menuSelect == 2){
            System.out.println("Are you a new customer?");
            System.out.println("1) Yes");
            System.out.println("2) No");
            menuSelect = Integer.parseInt(scan.nextLine());
            if(menuSelect == 1) {
                System.out.println("Please enter your first name");
                String firstName = scan.nextLine();
                System.out.println("Please enter your last name");
                String lastName = scan.nextLine();
                System.out.println("Please enter a PIN number");
                int pin = Integer.parseInt(scan.nextLine());
                System.out.println("Please enter your initial deposit");
                double deposit = Double.parseDouble(scan.nextLine());
                bank.addCustomer(firstName, lastName, pin, deposit);
            }
            else if (menuSelect == 2){
                System.out.println("Please input your PIN number");
                int pin = Integer.parseInt(scan.nextLine());
                bank.findCustomer(pin);
                if (return == null){
                    System.out.println("Invalid Pin");
                }
                else {
                    System.out.println("1) Deposit");
                    System.out.println("2) Withdraw");
                    menuSelect = Integer.parseInt(scan.nextLine());
                    if (menuSelect == 1){
                        System.out.println("Please input your deposit amount:");
                        double deposit = Double.parseDouble(scan.nextLine());
                        acc.deposit(deposit);
                    }
                    else if (menuSelect == 2){
                        double out = Double.parseDouble(scan.nextLine());
                        acc.withdraw(out);
                    }
                    else {
                        System.out.println("Invalid input");
                    }
                }
            }
        }
        else if (menuSelect == 3){
            System.out.println("Please input a PIN number");
            int pin = Integer.parseInt(scan.nextLine());
            bank.findCustomer(pin);
            if (return == null){
                System.out.println("Invalid Pin");
            }
            else {
                bank.removeCustomer(pin);
                System.out.println("Customer Deleted");
            }
        }

        else {
            System.out.println("Invalid Input");
        }
    }
    private static void accessAccount(){
        System.out.println("Please enter your pin");
    }
}