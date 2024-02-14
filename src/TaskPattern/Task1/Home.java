package TaskPattern.Task1;

public class Home {
    private final HomeBuild.HomeType homeType;
    private final int countRooms;
    private final String mainMaterial;
    private final String additionMaterial;
    private final String  decorationMaterial;
    private final String homeOwner;

    public Home(HomeBuild.HomeType homeType, int countRooms, String mainMaterial, String additionMaterial, String decorationMaterial,String homeOwner) {
        this.homeType = homeType;
        this.countRooms = countRooms;
        this.mainMaterial = mainMaterial;
        this.additionMaterial = additionMaterial;
        this.decorationMaterial = decorationMaterial;
        this.homeOwner=homeOwner;
    }

    @Override
    public String toString() {
        return "Home{" +
                "homeType=" + homeType +
                ", countRooms=" + countRooms +
                ", mainMaterial='" + mainMaterial + '\'' +
                ", additionMaterial='" + additionMaterial + '\'' +
                ", decorationMaterial='" + decorationMaterial + '\'' +
                ", homeOwner='" + homeOwner + '\'' +
                '}';
    }
}
