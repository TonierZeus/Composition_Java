public class Room {

    private Floor floor;
    private Wall wall;
    private Bed bed;
    private Console console;
    private TV TV;
    private Desk desk;

    public Room(Floor floor, Wall wall, Bed bed, Console console, TV TV, Desk desk) {
        this.floor = floor;
        this.wall = wall;
        this.bed = bed;
        this.console = console;
        this.TV = TV;
        this.desk = desk;
    }

    public void newWalls(){
        wall.paintTheWalls();
        cleanAfterPainting();
    }

    private void cleanAfterPainting(){
        floor.cleanTheFloor();
    }

    public void endDay(){
        homework();
        bedMaking();
        bed.goToSleep();
    }

    private void homework(){
        desk.doHomework(7);
    }

    private void bedMaking(){
        bed.makeBed();
    }

    public void play(){
        startTV();
        console.playGames("Nba2K20",2);
    }

    private void startTV(){
        TV.turnOnTV();
    }
}
