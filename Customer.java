package Project3;

import java.util.ArrayList;

public class Customer {
    private String firstName;
    private String lastName;
    private int PIN;
    private list<Integer> accounts = new ArrayList<>();

    private static void constructor(String firstName, String lastName, int PIN){

    }
    private static void addAccount(){

    }
    private static void closeAccount(){

    }
    private static void findAccount(int accountNumber, int[] array){
        int low = 0;
        int high = array.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            int result = accountNumber.compareTo(array[mid]);
            if (result == 0) {
                return mid;
            } else if (result > 0) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }

        }
        return -1;
    }
    private static void viewAllAccounts(){
        for (int i =0; i<= accounts.length; i++){
            System.out.println(accounts[i]);
        }
    }
}
