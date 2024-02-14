package TaskPattern.Task1;

public class ConcreateHomeBuild implements HomeBuild{
    private HomeBuild.HomeType homeType;
    private int countRooms;
    private String mainMaterial;
    private String additionMaterial;
    private String  decorationMaterial;
    private String homeOwner;

    @Override
    public void setHomeType(HomeType homeType) {
        this.homeType=homeType;
    }

    @Override
    public void setCountRooms(int countRooms) {
        this.countRooms=countRooms;
    }

    @Override
    public void setMainMaterial(String mainMaterial) {
        this.mainMaterial=mainMaterial;
    }

    @Override
    public void setAdditionMaterial(String additionMaterial) {
        this.additionMaterial=additionMaterial;
    }

    @Override
    public void setDecorationMaterial(String decorationMaterial) {
        this.decorationMaterial=decorationMaterial;
    }

    @Override
    public void setHomeOwner(String homeOwner) {
        this.homeOwner=homeOwner;
    }
    public Home build(){
        return new Home(homeType,countRooms,mainMaterial,additionMaterial,decorationMaterial,homeOwner);
    }
}
