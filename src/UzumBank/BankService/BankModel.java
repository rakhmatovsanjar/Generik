package UzumBank;

import S_ArrayList.S_ArrayList;

public class BankModel {
    private int phoneNomber;
    private String userName;
    private String userLastName;
    private String userNikName;
    private String password;
    private int cardNumber;

    public BankModel() {
    }

    public BankModel(int phoneNomber, String userName, String userLastName, String userNikName, String password, int cardNumber) {
        this.phoneNomber = phoneNomber;
        this.userName = userName;
        this.userLastName = userLastName;
        this.userNikName = userNikName;
        this.password = password;
        this.cardNumber = cardNumber;
    }

    public int getPhoneNomber() {
        return phoneNomber;
    }

    public void setPhoneNomber(int phoneNomber) {
        this.phoneNomber = phoneNomber;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserLastName() {
        return userLastName;
    }

    public void setUserLastName(String userLastName) {
        this.userLastName = userLastName;
    }

    public String getUserNikName() {
        return userNikName;
    }

    public void setUserNikName(String userNikName) {
        this.userNikName = userNikName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(int cardNumber) {
        this.cardNumber = cardNumber;
    }

    @Override
    public String toString() {
        return " - Foydalanuvchi\n"+
                "Tel: "+phoneNomber+"\n"+
                "Ism: "+userName+"\n"+
                "Familiya: "+userLastName+"\n"+
                "Foydalanuvchi nomi: "+userNikName+"\n"+
                "Foydalanuvchi paroli: ******"+"\n"+
                "Karta raqami: " +cardNumber+" *** "+"\n";
    }
}
