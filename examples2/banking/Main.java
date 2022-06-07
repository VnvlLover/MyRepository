package examples2.banking;

public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank("National Poland Bank");

        System.out.println(bank.addBranch("Bytow"));
        System.out.println(bank.addCustomer("Bytow", "Maciej", 1200));
        System.out.println(bank.addCustomer("Bytow", "Paulinka", 600));
        System.out.println(bank.addCustomer("Bytow", "Jurek", 800));
        System.out.println(bank.addCustomer("Bytow", "Michal", 130));
        System.out.println(bank.addCustomer("Bytow", "Maciej", 1200));
        bank.listCustomers("Bytow", true);






    }
}
