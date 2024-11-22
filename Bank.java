package Project3;

public class Bank {
    customers = new ;

    private static void addCustomer(String first, String last, int pin, int deposit){

    }
    private static void removeCustomer(int PIN){

    }
    private static void findCustomer(int PIN){
        int low = 0;
        int high = array.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            int result = PIN.compareTo(array[mid]);
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
    private static void getAllCustomerInfo(){
        for (int i =0; i<= customers.length; i++){
            System.out.println(customers[i]);
        }
    }
}
