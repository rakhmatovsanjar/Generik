package TaskPattern.Task2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        OnDutyCreator onDutyCreator=new OnDutyCreator();
        System.out.print("Tashkilot nomini kiriting: ");
        String officeName=scanner.nextLine();
        System.out.print("Tanlang [Matematika, Informatika] -> ");
        String cafedraName=scanner.nextLine();

        Office office= onDutyCreator.createOfficeWrapper(cafedraName,officeName);
        System.out.print(office.getOfficename()+" da, "+office.getOnDutyPlan());
    }
}
