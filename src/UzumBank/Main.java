import UzumBank.BankModel;
import UzumBank.UzumBankService;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        UzumBankService uzumBankService=new UzumBankService();
        BankModel user1 = new BankModel(944856603, "Sanjarbek", "rahmatov", "Sanjek", "qwer1234", 5614);
        BankModel user2 = new BankModel(944856603, "Sanjarbek", "rahmatov", "Sanjek", "qwer1234", 5614);
        uzumBankService.addUser(user1);
        uzumBankService.addUser(user2);
        uzumBankService.showInfo();
    }
}