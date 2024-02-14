package TaskPattern.Task1;

public interface HomeBuild {

    enum HomeType{
        SIMPLE, EVERAGE, COMPARATIVE
    }

    void setHomeType(HomeType homeType);
    void setCountRooms(int countRooms);
    void setMainMaterial(String mainMaterial);
    void setAdditionMaterial(String additionMaterial);
    void setDecorationMaterial(String decorationMaterial);
    void setHomeOwner(String homeOwner);
}
