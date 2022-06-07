package examples2.polimorphism;

import java.util.Random;

class car {
    private String fullName;
    private int doors;
    private int wheels;
    private int cylinders;
    private double engineCapacity;

    public car(String fullName, int cylinders, double engineCapacity, int doors) {
        this.fullName = fullName;
        this.cylinders = cylinders;
        this.engineCapacity = engineCapacity;
        this.doors = doors;
        this.wheels = 4;
    }

    public String getFullName() {
        return fullName;
    }

    public int getDoors() {
        return doors;
    }

    public int getWheels() {
        return wheels;
    }

    public int getCylinders() {
        return cylinders;
    }

    public double getEngineCapacity() {
        return engineCapacity;
    }

    public String engineStart() {
        return "Engine started";
    }

    public String engineStop() {
        return "Engine stopped";
    }

    public String accelerate() {
        return "Accelerated";
    }

    public String brake() {
        return "Breaked";
    }
}

class e39 extends car {
    public e39() {
        super("BMW Serie 5 E39", 6, 3.0, 4);
    }

    @Override
    public String engineStart() {
        return "E39 engine started";
    }

    @Override
    public String engineStop() {
        return "E39 engine stopped";
    }

    @Override
    public String accelerate() {
        return "E39 accelerated";
    }

    @Override
    public String brake() {
        return "E39 brake";
    }
}

class e46 extends car {
    public e46() {
        super("BMW Serie 3 E46", 4, 2.0, 2);
    }

    @Override
    public String engineStart() {
        return "E46 engine started";
    }

    @Override
    public String engineStop() {
        return "E46 engine stopped";
    }

    @Override
    public String accelerate() {
        return "E46 accelerated";
    }

    @Override
    public String brake() {
        return "E46 brake";
    }
}

class e70 extends car {
    public e70() {
        super("BMW Serie X5 E70", 6, 3.5, 5);
    }

    @Override
    public String engineStart() {
        return "E70 engine started";
    }

    @Override
    public String engineStop() {
        return "E70 engine stopped";
    }

    @Override
    public String accelerate() {
        return "E70 accelerated";
    }

    @Override
    public String brake() {
        return "E70 brake";
    }
}

class e60 extends car {
    public e60() {
        super("BMW Serie 5 E39", 6, 2.5, 4);
    }

    @Override
    public String engineStart() {
        return "E60 engine started";
    }

    @Override
    public String engineStop() {
        return "E60 engine stopped";
    }

    @Override
    public String accelerate() {
        return "E60 accelerated";
    }

    @Override
    public String brake() {
        return "E60 brake";
    }
}

class e92 extends car {
    public e92() {
        super("BMW Serie 3 E92", 8, 5.0, 3);
    }

    @Override
    public String engineStart() {
        return "E92 engine started";
    }

    @Override
    public String engineStop() {
        return "E92 engine stopped";
    }

    @Override
    public String accelerate() {
        return "E92 accelerated";
    }

    @Override
    public String brake() {
        return "E92 brake";
    }
}
public class Main {
    public static void main(String[] args) {
        for(int i = 0; i < 10; i++){
            car randomCar = randomCar();
            System.out.println("Car name: " + randomCar.getFullName() + "\n" +
                    "Engine capacity: " + randomCar.getEngineCapacity() + "\n" +
                    "Number of cylinders: " + randomCar.getCylinders() + "\n" +
                    "Number of doors: " + randomCar.getDoors() + "\n" +
                    randomCar.engineStart() + "\n" +
                    randomCar.accelerate() + "\n" +
                    randomCar.brake() + "\n" +
                    randomCar.engineStop() + "\n");
        }

    }

    public static car randomCar(){
        int randomNumber = (int) ((Math.random() * 5) + 1);

        switch (randomNumber){
            case 1:
                return new e39();
            case 2:
                return new e46();
            case 3:
                return new e70();
            case 4:
                return new e60();
            case 5:
                return new e92();
        }
        return null;
    }
}
