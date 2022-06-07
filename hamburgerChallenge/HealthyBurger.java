package hamburgerChallenge;
public class HealthyBurger extends BasicHamburger{
    private String healthyAddition1;
    private double healthyAddition1Price = 0;

    private String healthyAddition2;
    private double healthyAddition2Price = 0;

    public HealthyBurger(String meat, double price){
        super("Healthy",meat, price, "Brown rye");
    }

    public void addHealthyAddition1(String additionName, double price) {
        this.healthyAddition1 = additionName;
        this.healthyAddition1Price = price;
    }
    public void addHealthyAddition2(String additionName, double price) {
        this.healthyAddition2 = additionName;
        this.healthyAddition2Price = price;
    }

    @Override
    public double getFinalPrice(){
        return super.getFinalPrice() + healthyAddition1Price + healthyAddition2Price;
    }

    @Override
    public double makeHamburger() {
        super.makeHamburger();
        System.out.println("Extra additions: ");
        if(healthyAddition1 != null){
            System.out.println("Healthy addition 1: " + this.healthyAddition1.toUpperCase() + " Price: " + healthyAddition1Price);
        }
        if(healthyAddition2 != null){
            System.out.println("Healthy addition 2: " + this.healthyAddition2.toUpperCase() + " Price: " + healthyAddition2Price);
        }
        System.out.println("Final Price: " + getFinalPrice());
    return getFinalPrice();
    }
}
