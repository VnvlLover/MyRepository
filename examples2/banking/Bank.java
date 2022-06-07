package examples2.banking;

import java.util.ArrayList;

public class Bank {
    private String name;
    private ArrayList<Branch> branches;

    public Bank(String name) {
        this.name = name;
        branches = new ArrayList<Branch>();
    }
    public boolean addBranch(String name){
      if(findBranch(name) == null){
          this.branches.add(new Branch(name));
          return true;
      }
        return false;

    }
    private Branch findBranch(String nameOfBranch){
       for(int i = 0; i < branches.size(); i++){
           Branch checkedBranch = branches.get(i);
           if (checkedBranch.getName().equals(nameOfBranch)){
               return checkedBranch;
           }
       }
        return null;
    }

   public boolean addCustomer(String nameOfBranch, String nameOfCustomer, double initialAmount){
        Branch branch = findBranch(nameOfBranch);
        if(branch != null){
            branch.newCustomer(nameOfCustomer, initialAmount);
            return true;
        }
        return false;
   }
   public boolean addCustomerTransaction(String nameOfBranch, String nameOfCustomer, double transaction){
        Branch branch = findBranch(nameOfBranch);
        if (branch != null){
            branch.addCustomerTransaction(nameOfCustomer, transaction);
            return true;
        }
        return false;
   }
   public boolean listCustomers(String nameOfBranch, boolean printTransaction){
        Branch branch = findBranch(nameOfBranch);
        if(branch != null){
            System.out.println("Customers details for branch " + branch.getName());
            for(int i = 0; i < branch.getCustomers().size(); i++){
                System.out.println("Customer: " + branch.getCustomers().get(i).getName() + "[" + (i+1) + "]");
                if(printTransaction){
                    System.out.println("Transactions");
                    for(int j = 0; i < branch.getCustomers().get(j).getTransactions().size(); j++){
                        System.out.println("[" + (j+1) + "] Amount " + branch.getCustomers().get(j).getTransactions().get(j));
                    }
                }
            }
            return true;
        }
        return false;
   }
}

