package Project3;

import java.util.ArrayList;

public class Bank {

    private ArrayList<Customer> customerList = new ArrayList<>();

    public void addCustomer(Customer customer){customerList.add(customer);}
    public void removeCustomer(Customer customer){ customerList.remove(customer);}
    public Customer findCustomer(int PIN) {
        Customer foundCustomer = null;
        for (Customer customer : customerList) {
            if (customer.getPin() == PIN) {
                foundCustomer = customer;
                break;
            }
        }
        return foundCustomer;
    }
    public ArrayList<Customer> getCustomerList(){return customerList;}
}
