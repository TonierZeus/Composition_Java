public class Console {

    private String name;
    private String manufacture;
    private String bios;


    public Console(String name, String manufacture, String bios) {
        this.name = name;
        this.manufacture = manufacture;
        this.bios = bios;
    }

    public void playGames(String gameName, int numberOfControlers){
        if(numberOfControlers>1){
            System.out.println("You start playing " + gameName + " in split screen mode");
        }else if(numberOfControlers<0){
            System.out.println("You dont connect any controler");
        }else
        System.out.println("You start playing " + gameName + " in solo mode");
    }

    public String getName() {
        return name;
    }

    public String getManufacture() {
        return manufacture;
    }

    public String getBios() {
        return bios;
    }


}
