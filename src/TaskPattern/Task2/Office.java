package TaskPattern.Task2;

public abstract class Office {
    private final String officeName;

    public Office(String officeName){
        this.officeName=officeName;
    }

    public String getOfficename(){
        return officeName;
    }

    abstract String getOnDutyPlan();
}
