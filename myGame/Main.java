package myGame;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    private static final Scanner scanner = new Scanner(System.in);
    private static final Map<Integer, Location> locationMap = new HashMap<>();

    public static void main(String[] args) {

        locationMap.put(1, new Location(1, "BYTOW"));
        locationMap.put(2, new Location(2, "SLUPSK"));
        locationMap.put(3, new Location(3, "SZCZECINEK"));
        locationMap.put(4, new Location(4, "BORNE SULINOWO"));
        locationMap.put(5, new Location(5, "WALCZ"));
        locationMap.put(6, new Location(6, "CHOJNICE"));
        locationMap.put(7, new Location(7, "GRUDZIADZ"));
        locationMap.put(8, new Location(8, "KIELNO"));
        locationMap.put(9, new Location(9, "WLADYSLAWOWO"));
        locationMap.put(0, new Location(0, "Budzisz się w łózku. Wstawaj podróżniku, koniec podróży"));

        locationMap.get(1).addExit("N", 2);
        locationMap.get(1).addExit("S", 6);
        locationMap.get(1).addExit("E", 8);
        locationMap.get(1).addExit("W", 4);

        locationMap.get(2).addExit("E", 9);
        locationMap.get(2).addExit("W", 3);
        locationMap.get(2).addExit("S", 1);

        locationMap.get(3).addExit("E", 2);
        locationMap.get(3).addExit("S", 4);

        locationMap.get(4).addExit("N", 3);
        locationMap.get(4).addExit("E", 1);
        locationMap.get(4).addExit("S", 5);

        locationMap.get(5).addExit("N", 4);
        locationMap.get(5).addExit("E", 6);

        locationMap.get(6).addExit("W", 5);
        locationMap.get(6).addExit("N", 1);
        locationMap.get(6).addExit("E", 7);

        locationMap.get(7).addExit("W", 6);
        locationMap.get(7).addExit("E", 8);

        locationMap.get(8).addExit("W", 1);
        locationMap.get(8).addExit("S", 7);
        locationMap.get(8).addExit("N", 9);

        locationMap.get(9).addExit("W", 2);
        locationMap.get(9).addExit("S", 8);

        Map<String, String> vocabulary = new HashMap<>();
        vocabulary.put("QUIT", "Q");
        vocabulary.put("NORTH", "N");
        vocabulary.put("WEST", "W");
        vocabulary.put("EAST", "E");
        vocabulary.put("SOUTH", "S");


        int location = 1;
        while(true){
            System.out.println(locationMap.get(location).getDescription());
            if(location == 0){
                break;
            }

            Map<String, Integer> exits = locationMap.get(location).getExits();
            System.out.print("Dostepne kierunki: ");
            for (String exit : exits.keySet()){
                System.out.print(exit + ", ");
            }
            System.out.println();

            String direction = scanner.nextLine().toUpperCase();
            String[] directionStringArray = direction.split(" ");
            if(direction.length() > 1) {
                for(String word : directionStringArray){
                    if(vocabulary.containsKey(word)){
                        direction = vocabulary.get(word);
                    }
                }
            }

            if(exits.containsKey(direction)){
                location = exits.get(direction);
            } else {
                System.out.println("Nie możesz poruszyć się w tym kierunku");
            }

        }



    }
}
