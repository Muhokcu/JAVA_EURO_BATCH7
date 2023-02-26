package gunler.gun52_23_01_2023.PaketB;

import gunler.gun52_23_01_2023.PaketA.Person;

public class Student extends Person {
    private String okulu;
    private String adresi;


    public Student(String okulu, String adresi) {
        this.okulu = okulu;
        this.adresi = adresi;


    }

    public String getOkulu() {

        return okulu;
    }

    public void setOkulu(String okulu) {

        this.okulu = okulu;
    }

    public String getAdresi() {

        return adresi;
    }

    public void setAdresi(String adresi) {

        this.adresi = adresi;
    }

    @Override
    public String toString() {
        return "Student{" +
                "okulu='" + okulu + '\'' +
                ", adresi='" + adresi + '\'' +
                ", ad='" + ad + '\'' +
                ", soyad='" + soyad + '\'' +
                ", TcNo=" + TcNo +
                '}';
    }

    @Override
    protected void displayInfo() {
        System.out.println("Bu method child classta override edildi.");
        System.out.println("-----------------------------------------");
        super.displayInfo();
    }

    public static void main(String[] args) {
        Student ogrenci = new Student("Okul", "Adres");

        ogrenci.ad = "Ahmet";//Parent-protected
        ogrenci.soyad = "Falanca";//Parent-protected
        ogrenci.TcNo = 12345;//Parent-protected
        ogrenci.okulu = "EuroTech";//Child-private
        ogrenci.adresi = "Adresi...";//Child-private

        ogrenci.displayInfo();//Parent-protected
        System.out.println("ogrenci = " + ogrenci);

    }
}
