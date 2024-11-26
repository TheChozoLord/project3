package Project3;
import PokemonShowing.Move;
import PokemonShowing.Pokemon;

import java.util.ArrayList;
import java.util.Scanner;


public class Menu {
    private Bank bank = new Bank();
    private Scanner scan = new Scanner(System.in);


    public void runMenu() {
        while (true) {
            int menuSelect;
            System.out.println("Please make a selection");
            System.out.println("1) Access an account");
            System.out.println("2) Create new account");
            System.out.println("3) Close all accounts");
            System.out.println("4) Quit");
            menuSelect = Integer.parseInt(scan.nextLine());
            if (menuSelect == 1) {
                accessAccount();
            }
            else if (menuSelect == 2) {
                System.out.println("Are you a new customer?\n1) Yes\n2) No");
                menuSelect = Integer.parseInt(scan.nextLine());
                if (menuSelect == 1){
                    createCustomer();
                }
                else if (menuSelect == 2){
                    System.out.println("Please enter your PIN");
                    int PIN = Integer.parseInt(scan.nextLine());
                    Customer customer = bank.findCustomer(PIN);
                    if (customer == null) {
                        System.out.println("Customer not found.");
                    } else {
                        while (true) {
                            double initialDeposit;
                            Account account;
                            System.out.print("1) Create a new account.\n2)exit");
                            menuSelect = Integer.parseInt(scan.nextLine());
                            if (menuSelect == 2) {
                                break;
                            }
                            System.out.print("Input the initial Deposit: ");
                            initialDeposit = Double.parseDouble(scan.nextLine());
                            account = new Account(initialDeposit);
                            customer.openAccount(account);
                        }
                    }
                }
                else {
                    System.out.println("Invalid Input");
                }
            }
            else if (menuSelect == 3) {
                deleteCustomer();
            }
            else if (menuSelect == 4){
                break;
            }
            else{
                System.out.println("Invalid Input");
            }
        }
    }

    private void accessAccount(){
        System.out.println("Please enter your pin");
        int PIN = Integer.parseInt(scan.nextLine());
        Customer customer = bank.findCustomer(PIN);
        if (customer == null) {
            System.out.println("Customer not found.");
            return;
        } else {
            ArrayList<Account> accounts = customer.getAllAccounts();
            for (int i = 0; i < accounts.size(); i++) {
                System.out.printf("%d. %s\n\n", i + 1, accounts.get(i));
            }
            System.out.println("Please input the account number of the account you want to open:");
        }
    }

    private void createCustomer() {
        String firstName;
        String secondName;
        int PIN;

        Customer customer;
        Account account;

        double initialDeposit;

        System.out.println("Enter your first name: ");
        firstName = scan.nextLine();
        System.out.println("Enter the last name: ");
        secondName = scan.nextLine();
        System.out.println("Please input a four digit PIN number:");
        PIN = Integer.parseInt(scan.nextLine());
        customer = new Customer(firstName, secondName, PIN);
        System.out.println("Please create at least one new account: ");
        while (true) {
            int menuSelect;
            System.out.print("1) Create a new account.\n2) exit\n");
            menuSelect = Integer.parseInt(scan.nextLine());
            if (menuSelect == 2) {
                break;
            }
            System.out.print("Input the initial Deposit: ");
            initialDeposit = Double.parseDouble(scan.nextLine());
            account = new Account(initialDeposit);
            customer.openAccount(account);
        }
        bank.addCustomer(customer);
        System.out.println();
    }

    private void deleteCustomer() {
        int PIN;
        Customer customer;
        System.out.print("Enter the PIN of the customer you want to delete: ");
        PIN = Integer.parseInt(scan.nextLine());
        customer = bank.findCustomer(PIN);
        if (customer == null) {
            System.out.println("Customer not found.");
        } else {
            bank.removeCustomer(customer);
            System.out.println("Customer removed.");
        }
    }
}