package examples2.house;

public class Home {
    private LivingRoom livingRoom;
    public Home(LivingRoom livingRoom) {
        this.livingRoom = livingRoom;
    }

    public void buyRoom(){
        System.out.println("Congratulation buying room");

    }

    public void describeRoom(){
        System.out.println("WallXDD are " + livingRoom.getWallsColor() + ", sofa colour is " + livingRoom.getSofaColor() + ", dimensions: x: " +
                livingRoom.getDimensions().getLenght() + ",y: " + livingRoom.getDimensions().getWidth() + ". TV manufacturer is " + livingRoom.getTelevisor().getManufacturer()
                + " and model " + livingRoom.getTelevisor().getModel() + ", size " + livingRoom.getTelevisor().getSize() + ". Lamp manufacturer is " + livingRoom.getLampSize().getManufacturer());
    }
}
