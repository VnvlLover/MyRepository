package examples2.house;

public class Main {
    public static void main(String[] args) {
        LivingRoom livingRoom = new LivingRoom("Red", "White",
                new LampSize("Philips", "XDD2000", 4),
                new Televisor("Sony", "XDDDDDD322", 52),
                new Dimensions(20, 30));

        Home home = new Home(livingRoom);

        home.buyRoom();
        home.describeRoom();

        livingRoom = new LivingRoom("White", "Silver",
                new LampSize("Osram", "X0", 2),
                new Televisor("Acer", "44443", 78),
                new Dimensions(13, 55));

        home = new Home(livingRoom);

        home.buyRoom();
        home.describeRoom();


    }
}
