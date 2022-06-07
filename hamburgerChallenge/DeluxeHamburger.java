package hamburgerChallenge;
public class DeluxeHamburger extends BasicHamburger {

    private String chipsName;
    private double chipsPrice;

    private String drinkName;
    private double drinkPrice;

    public DeluxeHamburger(String breadRoll, String meat, double price) {
        super("Hamburger Deluxe", meat, price, breadRoll);
    }
    public void addChips(String name, double price) {
        this.chipsName = name;
        this.chipsPrice = price;
    }
    public void addDrink(String name, double price) {
        this.drinkName = name;
        this.drinkPrice = price;
    }

    @Override
    public void addAddition1(String name, double price){
        System.out.println("Cannot add additions");
    }
    @Override
    public void addAddition2(String name, double price){
        System.out.println("Cannot add additions");
    }
    @Override
    public void addAddition3(String name, double price){
        System.out.println("Cannot add additions");
    }
    @Override
    public void addAddition4(String name, double price){
        System.out.println("Cannot add additions");
    }

    @Override
    public double getFinalPrice() {
        return super.getFinalPrice() + this.chipsPrice + this.drinkPrice;
    }

    @Override
    public double makeHamburger() {
        super.makeHamburger();
        System.out.println("Extra additions: ");
        if(chipsName != null){
            System.out.println("Addition 1: " + this.chipsName.toUpperCase());
        }
        if(drinkName != null){
            System.out.println("Addition 2: " + this.drinkName.toUpperCase());
        }
        System.out.println("Final price: " + getFinalPrice());
        return getFinalPrice();
    }
}
