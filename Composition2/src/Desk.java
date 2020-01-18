public class Desk {
    private String woodType;
    private Dimensions dimensions;
    private int numberOfLegs;
    private int numberOfDrawers;

    public Desk(String woodType, Dimensions dimensions, int numberOfLegs, int numberOfDrawers) {
        this.woodType = woodType;
        this.dimensions = dimensions;
        this.numberOfLegs = numberOfLegs;
        this.numberOfDrawers = numberOfDrawers;
    }

    public void doHomework(int numberOfHomework){
        while(numberOfHomework!=0){
            System.out.println("You are doing homework");
            numberOfHomework--;
        }
        System.out.println("Homework is done");
    }

    public String getWoodType() {
        return woodType;
    }

    public Dimensions getDimensions() {
        return dimensions;
    }

    public int getNumberOfLegs() {
        return numberOfLegs;
    }

    public int getNumberOfDrawers() {
        return numberOfDrawers;
    }
}
