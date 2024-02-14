package TaskPattern.Task2;

public abstract class OfficeFactory {
    abstract Office createOnDuty(String cafedraName, String officeName);

    Office createOfficeWrapper(String cafedraName, String officeName) {
        return createOnDuty(cafedraName, officeName);
    }
}
