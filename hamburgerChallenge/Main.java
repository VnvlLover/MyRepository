package hamburgerChallenge;

public class Main {
    public static void main(String[] args) {
        BasicHamburger hamburger = new BasicHamburger("Basic", "pork", 5.20, "White");
        hamburger.addAddition1("Lettuce", 2.0);
        hamburger.addAddition2("Onion", 3.45);
        hamburger.addAddition3("Cheese", 4.87);
        hamburger.makeHamburger();
        System.out.println("####################################");

        HealthyBurger healthyBurger = new HealthyBurger("Sausage", 6.50);
        healthyBurger.addAddition1("Lettuce", 2.50);
        healthyBurger.addAddition2("Onion", 2.10);
        healthyBurger.addHealthyAddition1("vegan mayo", 2.40);
        healthyBurger.makeHamburger();
        System.out.println("####################################");
        DeluxeHamburger deluxeHamburger = new DeluxeHamburger("White sesame", "Steak", 10);
        deluxeHamburger.addChips("Big chips", 8);
        deluxeHamburger.addDrink("Coca cola", 3);
        deluxeHamburger.addAddition1("lettuce", 4);
        deluxeHamburger.makeHamburger();
        System.out.println("####################################");

    }
}
