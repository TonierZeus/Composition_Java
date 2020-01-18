public class TV {

    private Dimensions resolution;
    private String model;
    private String manufacture;
    private int size;

    public TV(Dimensions resolution, String model, String manufacture, int size) {
        this.resolution = resolution;
        this.model = model;
        this.manufacture = manufacture;
        this.size = size;
    }

    public void turnOnTV(){
        System.out.println("You turn on the TV");

    }

    public Dimensions getResolution() {
        return resolution;
    }

    public String getModel() {
        return model;
    }

    public String getManufacture() {
        return manufacture;
    }

    public int getSize() {
        return size;
    }
}
