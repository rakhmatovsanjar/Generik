package UzumBank;

import UzumBank.S_ArrayList.S_ArrayList;

import java.util.Scanner;

public class UzumBankService {
    S_ArrayList<BankModel> list = new S_ArrayList<BankModel>();
    Scanner scanner = new Scanner(System.in);
    BankModel bankModel = new BankModel();

    public void signUp() {

    }

    public void signIn() {
        int phoneNumber;
        String password;
        System.out.print("Telefon raqam kiriting: ");
        phoneNumber = scanner.nextInt();
        if (!list.containsNumber(phoneNumber)) {
            signUp();
        } else {
            System.out.print("Parolni kirting: ");
            password=scanner.next();
            if (!list.containsPassword(password)){
                System.out.println("Parol xato");
            }
        }
    }

    public void addUser(BankModel bankModel) {
        list.add(bankModel);
    }

    public void showInfo() {
        System.out.println(list);
    }
}
