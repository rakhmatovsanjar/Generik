package NotListBank;

import java.util.Scanner;

public class  Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        BankServise bankServise=new BankServise();




        Label:
        while (true) {
            System.out.println("Bankimizga xush kelibsiz! \nTanlang 1-> Kirish: 2-> Ro'yxatdan o'tish");

            switch (scanner.nextInt()) {
                case 1 -> {
                    bankServise.kirish();
                    break Label;
                }
                case 2 -> {
                    bankServise.registeratsiya();
                    break Label;
                }
                default -> System.out.println("Qayta urining");
            }
        }
    }
}