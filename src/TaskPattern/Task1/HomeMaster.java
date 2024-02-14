package TaskPattern.Task1;

public class HomeMaster {
    public void creatSimple(HomeBuild homeBuild, String homeOwner){
        homeBuild.setHomeType(HomeBuild.HomeType.SIMPLE);
        homeBuild.setCountRooms(3);
        homeBuild.setMainMaterial("4 sotiyli tayyot uy");
        homeBuild.setAdditionMaterial("Ayvon");
        homeBuild.setDecorationMaterial("Oddiy soyabon");
        homeBuild.setHomeOwner(homeOwner);
    }
}
