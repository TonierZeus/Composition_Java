public class Main {

    public static void main(String[] args) {

        Dimensions floorDimensions = new Dimensions(5,6); //in meters
        Dimensions deskDimensions = new Dimensions(50,120);// in cm
        Dimensions bedDimensions = new Dimensions(120,200); // in cm

        Floor theFloor = new Floor("oak",floorDimensions,true);

        Wall theWall = new Wall("white",4);

        Bed theBed = new Bed(bedDimensions,"red",4);

        Desk theDesk = new Desk("oak",deskDimensions,4,5);

        TV theTV = new TV(new Dimensions(2450,1440),"Blue4K","Samsung",27);

        Console theConsole = new Console("PS5","Sony","Ps5-v1.5");

        Room theRoom = new Room(theFloor,theWall,theBed,theConsole,theTV,theDesk);
        theRoom.newWalls();
        theRoom.play();
        theRoom.endDay();



    }
}
