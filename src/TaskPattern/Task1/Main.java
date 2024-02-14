package TaskPattern.Task1;

public class Main {
    public static void main(String[] args) {
        HomeMaster homeMaster=new HomeMaster();

        ConcreateHomeBuild homeBuild=new ConcreateHomeBuild();
        homeMaster.creatSimple(homeBuild,"Sanjarbek");
        Home home=homeBuild.build();
        System.out.println(home);
    }
}
