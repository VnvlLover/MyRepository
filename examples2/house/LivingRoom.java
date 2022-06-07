package examples2.house;

public class LivingRoom {
    private String sofaColor;
    private String wallsColor;
    private LampSize lampSize;
    private Televisor televisor;
    private Dimensions dimensions;

    public LivingRoom(String sofaColor, String wallsColor, LampSize lampSize, Televisor televisor, Dimensions dimensions){
        this.sofaColor = sofaColor;
        this.wallsColor = wallsColor;
        this.lampSize = lampSize;
        this.televisor = televisor;
        this.dimensions= dimensions;
    }

    public String getSofaColor() {
        return sofaColor;
    }

    public String getWallsColor() {
        return wallsColor;
    }

    public LampSize getLampSize() {
        return lampSize;
    }

    public Televisor getTelevisor() {
        return televisor;
    }
    
    public Dimensions getDimensions(){
        return dimensions;
    }

    public void describeRoom(){
        System.out.println("WallXDD are " + getWallsColor() + ", sofa colour is " + getSofaColor() + ", dimensions: x: " +
                getDimensions().getLenght() + ",y: " + getDimensions().getWidth() + ". TV manufacturer is " + getTelevisor().getManufacturer()
        + " and model " + getTelevisor().getModel() + ", size " + getTelevisor().getSize() + ". Lamp manufacturer is " + getLampSize().getManufacturer());
    }
}
