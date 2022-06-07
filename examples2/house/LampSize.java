package examples2.house;

public class LampSize {
    private String manufacturer;
    private String Model;
    private int blobNumbers;

    public LampSize(String manufacturer, String model, int blobNumbers) {
        this.manufacturer = manufacturer;
        Model = model;
        this.blobNumbers = blobNumbers;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String getModel() {
        return Model;
    }

    public int getBlobNumbers() {
        return blobNumbers;
    }
}
