package examples2.banking;

import java.util.ArrayList;

public class Branch {
    private String name;
    private ArrayList<Customer> customers;

    public Branch(String name) {
        this.name = name;
        customers = new ArrayList<Customer>();
    }

    public String getName() {
        return name;
    }

    public ArrayList<Customer> getCustomers(){
        return customers;
    }

    public boolean newCustomer(String customerName, double amount){
        if(findCustomer(customerName) == null){
            customers.add(new Customer(customerName, amount));
            return true;
        }
        return false;
    }
    public boolean addCustomerTransaction(String nameOfCustomer, double transaction){
        Customer customer = findCustomer(nameOfCustomer);
        if(customer != null){
            customer.addTransaction(transaction);
            return true;
        }
        return false;
    }
    private Customer findCustomer(String nameOfCustomer){
       for(int i = 0; i < customers.size(); i++){
           Customer checkedCustomer = customers.get(i);
           if(checkedCustomer.getName().equals(nameOfCustomer)){
               return checkedCustomer;
           }
        }
        return null;
    }
}
