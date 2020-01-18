public class Dimensions {

    private double width;
    private double length;

    public Dimensions(double width, double length) {
        if(width<0){
            width=1;
        }
        if(length<0){
            length =1;
        }
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public double getLength() {
        return length;
    }
}
