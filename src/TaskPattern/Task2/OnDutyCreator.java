package TaskPattern.Task2;

public class OnDutyCreator extends OfficeFactory{
    @Override
    Office createOnDuty(String cafedraName, String officeName) {
        return switch (cafedraName){
            case "Matematika"->new MathCafedra(officeName);
            case "Informatika"->new InformationCafedra(officeName);
            default -> throw new IllegalStateException("Mavjud bo'lmagan kafedira: " + cafedraName);
        };
    }
}
