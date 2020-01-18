public class Floor {

    private String woodType;
    private Dimensions dimensions;
    private boolean carpet;

    public Floor(String woodType, Dimensions dimensions, boolean carpet) {
        this.woodType = woodType;
        this.dimensions = dimensions;
        this.carpet = carpet;
    }

    public void cleanTheFloor(){
        if(carpet==true){
            System.out.println("You start to cleaning your carpet");
        }else
        System.out.println("You start to cleaning floor");
    }

    public String getWoodType() {
        return woodType;
    }

    public Dimensions getDimensions() {
        return dimensions;
    }

    public boolean isCarpet() {
        return carpet;
    }

    public double getArea(){
        double area=dimensions.getLength() *dimensions.getWidth();
        return area;
    }
}
