package gunler.gun52_23_01_2023.PaketA;

public class Person {
    protected String ad;
    protected String soyad;
    protected long TcNo;



    protected void displayInfo(){
        System.out.println("Sahis bilgileri...");
        System.out.println("--------------------");
        System.out.println("Ad = " + ad);
        System.out.println("Soyad = " + soyad);
        System.out.println("TcNo = " + TcNo);

    }
}
