package examples2.cuboid;

public class Rectangle {
    private double width;
    private double lenght;

    public Rectangle(double width, double lenght){
        this.width = width;
        this.lenght = lenght;
        if(this.width < 0){
            this.width = 0;
        }
        if(this.lenght < 0){
            this.lenght = 0;
        }
    }

    public double getWidth(){
        return width;
    }

    public double getLength(){
        return lenght;
    }

    public double getArea(){
        return width * lenght;
    }
}
