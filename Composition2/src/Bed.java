public class Bed {

    private Dimensions dimensions;
    private String color;
    private int pillowNumber;

    public Bed(Dimensions dimensions, String color, int pillowNumber) {
        this.dimensions = dimensions;
        this.color = color;
        this.pillowNumber = pillowNumber;
    }

    public void makeBed(){
        System.out.println("Bed was made");
    }

    public void goToSleep(){
        System.out.println("You went sleep");
    }

    public Dimensions getDimensions() {
        return dimensions;
    }

    public String getColor() {
        return color;
    }

    public int getPillowNumber() {
        return pillowNumber;
    }
}
