package NotListBank;

public class UserModel {
    String ism;
    String familiya;
    String telefon;
    private String username;
    private String passwor;
    private double hisobi;
    private double kredit;

    public void addMoney(double money) {
        hisobi += money;
    }


    public String getIsm() {
        return ism;
    }

    public void setIsm(String ism) {
        this.ism = ism;
    }

    public String getFamiliya() {
        return familiya;
    }

    public void setFamiliya(String familiya) {
        this.familiya = familiya;
    }

    public String getTelefon() {
        return telefon;
    }

    public void setTelefon(String telefon) {
        this.telefon = telefon;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPasswor() {
        return passwor;
    }

    public void setPasswor(String passwor) {
        this.passwor = passwor;
    }

    public double getHisobi() {
        return hisobi;
    }

    public void setHisobi(double hisobi) {
        this.hisobi = hisobi;
    }

    public double getKredit() {
        return kredit;
    }

    public void setKredit(double kredit) {
        this.kredit = kredit;
    }
}
