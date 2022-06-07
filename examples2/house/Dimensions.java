package examples2.house;

public class Dimensions {
    private int width;
    private int lenght;

    public Dimensions(int width, int lenght){
        this.width = width;
        this.lenght = lenght;
        if(this.width < 0){
            this.width = 0;
        }
        if(this.lenght < 0){
            this.lenght = 0;
        }
    }
    public int getWidth(){
        return width;
    }

    public int getLenght(){
        return lenght;
    }
}
