package NotListBank;

import java.util.Scanner;

public class BankServise {

    Scanner scanner = new Scanner(System.in);
    UserModel user = new UserModel();
    boolean foydalanuvchi = false;

    void kirish() {
        if (foydalanuvchi) {
            System.out.print("""
                    __________________
                    |     KIRISH     |
                    ------------------
                    """);

            String us, pas;
            System.out.print("User kiriting ");
            us = scanner.next();
            System.out.print("Password kiriting ");
            pas = scanner.next();
            if (user.getPasswor().equals(pas) && user.getUsername().equals(us)) {
                System.out.println("Muvaffaqqiyatli kirdingiz");
                showMenyu();
            } else {
                kirish();
            }
        } else {

            registeratsiya();
        }


    }

    void registeratsiya() {
        System.out.print("Ro'yxatdan o'tish!\n");
        foydalanuvchi = true;
        System.out.print("Ism kiriting ");
        user.setIsm(scanner.next());
        System.out.print("User kiriting ");
        user.setUsername(scanner.next());
        System.out.print("Password kiriting ");
        user.setPasswor(scanner.next());

        kirish();

    }


    void showMenyu() {
        Label:
        while (true) {
            System.out.println("""
                    1->Hisobni tekshirish
                    2->Hisobni to'ldirish
                    3->Kredit so'rovi
                    4->Usermane almashtirish
                    5->Passwordni almashtirish
                    """);
            switch (scanner.nextInt()) {
                case 1 -> {
                    hisobTekshirish();
                    break Label;
                }
                case 2 -> {
                    System.out.print("Summa kiriting ");
                    hisobTuldirish();

                    break Label;
                }
                case 3 -> {
                    kreditSurovi();
                    break Label;
                }
                case 4 -> {
                    System.out.print("Yangi user kiriting ");
                    userAlmashtirish();
                    break Label;
                }
                case 5 -> {
                    passwordAlmashtirish();
                    break Label;
                }
                default -> System.out.println("Qayta urining");
            }
        }

    }

    void hisobTekshirish() {
        System.out.println("----Hozirgi hisob----");
        System.out.println(user.getHisobi());
        showMenyu();


    }


    void hisobTuldirish() {
        double his = user.getHisobi();
        double his1 = scanner.nextDouble();
        his = his + his1;
        user.setHisobi(his);
        System.out.println("\n ---Hisob tuldirildi---\n");
        showMenyu();

    }

    void kreditSurovi() {
        System.out.print("Qancha olmoqchisiz? ");
        double d = scanner.nextDouble();
        if (user.getHisobi() > d) {
            System.out.println("Tabriklaymiz sizga kridet berildi!");
            user.addMoney(d);
        } else {
            System.out.println("Sizga kridet berilmaydi bratishka, sog' bulasiz🙋‍️");
        }
        showMenyu();
    }

    void userAlmashtirish() {

        String us = scanner.next();

        user.setUsername(us);
        System.out.println("\n ---Almashtirildi---\n");
        kirish();


    }

    void passwordAlmashtirish() {
        String pas1 = scanner.next();

        user.setPasswor(pas1);
        System.out.println("\n ---Almashtirildi---\n");
        kirish();

    }
}
