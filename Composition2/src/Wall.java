import java.util.Scanner;

public class Wall {

    private String colorOfPaint;
    private int numberOfWalls;
    Scanner scaner = new Scanner(System.in);


    public Wall(String colorOfPaint, int numberOfWalls) {
        this.colorOfPaint = colorOfPaint;
        if(numberOfWalls<3){
            numberOfWalls=3;
        }
        this.numberOfWalls = numberOfWalls;
    }

    public void paintTheWalls(){
        System.out.println("Paint the walls to other colour than it was painted before");
        String newColor=scaner.nextLine();
        colorOfPaint=newColor;
        System.out.println("New colour of walls is " + newColor);
    }

    public String getColorOfPaint() {
        return colorOfPaint;
    }

    public int getNumberOfWalls() {
        return numberOfWalls;
    }
}
