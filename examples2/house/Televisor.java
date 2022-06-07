package examples2.house;

public class Televisor {
    private String manufacturer;
    private String model;
    private int size;

    public Televisor(String manufacturer, String model, int size) {
        this.manufacturer = manufacturer;
        this.model = model;
        this.size = size;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String getModel() {
        return model;
    }

    public int getSize() {
        return size;
    }
}
