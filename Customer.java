package Project3;

import java.util.ArrayList;

public class Customer {
    private String firstName;
    private String lastName;
    private int PIN;
    private ArrayList<Account> accounts = new ArrayList<>();

    public Customer(String firstName, String lastName, int PIN){
        this.firstName = firstName;
        this.lastName = lastName;
        this.PIN = PIN;
    }

    public String getFirstName(){return firstName;}

    public String getLastName(){return lastName;}

    public int getPin(){return PIN;}

    public void openAccount(Account account){accounts.add(account);}

    public void closeAccount(Account account) {
        accounts.remove(account);
    }

    public ArrayList<Account> getAllAccounts(){return accounts;}

    public Account getAccount(int accountNumber) {
        Account foundAccount = null;
        for (Account account : accounts) {
            if (account.getAccountNumber() == accountNumber) {
                foundAccount = account;
                break;
            }
        }
        return foundAccount;
    }

}