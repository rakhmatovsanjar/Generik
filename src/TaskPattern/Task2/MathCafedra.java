package TaskPattern.Task2;

public class MathCafedra extends Office{
    public MathCafedra(String officeName){
        super(officeName);
    }
    @Override
    String getOnDutyPlan() {
        return "Bugun matematika fafidirasi navbatchi";
    }
}
