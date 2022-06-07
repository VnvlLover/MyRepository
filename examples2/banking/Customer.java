package examples2.banking;

import java.util.ArrayList;

public class Customer {
    private String name;
    private ArrayList<Double> transactions;

    public Customer(String name, Double amount) {
        this.name = name;
        this.transactions = new ArrayList<Double>();
        addTransaction(amount);
    }

    public String getName(){
        return this.name;
    }
    public ArrayList<Double> getTransactions(){
        return this.transactions;
    }

    public void addTransaction(double transaction){
        this.transactions.add(transaction);
    }
}
