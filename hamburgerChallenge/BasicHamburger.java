package hamburgerChallenge;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class BasicHamburger {
    private String name;
    private String breadRoll;
    private double basePrice;
    private String meat;
    private double finalPrice;
    private double additionPrices;

    private double addition1Price = 0;
    private String addition1Name;

    private double addition2Price = 0;
    private String addition2Name;

    private double addition3Price = 0;
    private String addition3Name;

    private double addition4Price = 0;
    private String addition4Name;

    public BasicHamburger(String name, String meat, double price, String breadRoll){
        this.name = name;
        this.breadRoll = breadRoll;
        this.basePrice = price;
        this.meat = meat;
    }
    public void addAddition1(String additionName, double price){
       this.addition1Name = additionName;
       this.addition1Price = price;
    }

    public void addAddition2(String additionName, double price){
        this.addition2Name = additionName;
        this.addition2Price = price;
    }

    public void addAddition3(String additionName, double price){
        this.addition3Name = additionName;
        this.addition3Price = price;
    }

    public void addAddition4(String additionName, double price){
        this.addition4Name = additionName;
        this.addition4Price = price;
    }

    public double getAdditionPrices(){
        return this.addition1Price + this.addition2Price + this.addition3Price + this.addition4Price;
    }

    public String getName() {
        return name;
    }

    public String getBreadRoll() {
        return breadRoll;
    }

    public String getMeat() {
        return meat;
    }

    public double getFinalPrice() {
        return this.basePrice + getAdditionPrices();
    }

    public double makeHamburger(){
        System.out.println("Name: " + this.name.toUpperCase() + "\n" +
                "Bread type: " + this.breadRoll.toUpperCase() + "\n" +
                "Meat type: " + this.meat.toUpperCase());
        if(addition1Name != null){
            System.out.println("Addition 1: " + this.addition1Name.toUpperCase() + " Price: " + addition1Price );
        }
        if(addition2Name != null){
            System.out.println("Addition 2: " + this.addition2Name.toUpperCase() + " Price: " + addition2Price );
        }
        if(addition3Name != null){
            System.out.println("Addition 3: " + this.addition3Name.toUpperCase() + " Price: " + addition3Price );
        }
        if(addition4Name != null){
            System.out.println("Addition 4: " + this.addition4Name.toUpperCase() + " Price: " + addition4Price );
        }
        return getFinalPrice();
    }
}
