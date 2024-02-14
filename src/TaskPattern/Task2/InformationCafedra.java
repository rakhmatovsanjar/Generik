package TaskPattern.Task2;

public class InformationCafedra extends Office{
    public InformationCafedra(String officeName) {
        super(officeName);
    }

    @Override
    String getOnDutyPlan() {
        return "Bugun informatika kafidirasi navbatchi";
    }
}
