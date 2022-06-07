package examples2.cuboid;

public class Cuboid extends Rectangle {
    private double height;

    public Cuboid (double width, double lenght, double heigth){
        super(width, lenght);
        this.height = heigth;
        if(this.height < 0){
            this.height = 0;
        }
    }

    public double getHeight(){
        return height;
    }

    public double getVolume(){
        return getArea() * height;
    }
}
