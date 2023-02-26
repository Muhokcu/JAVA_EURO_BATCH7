package gunler.gun42_04_01_2023_Constructor_2.Student;

import java.util.Scanner;

public class KursProgram {

    public static void main(String[] args) {
        Kurs kurs = new Kurs("Java for SDET",2);
/*
        Ogrenci ogrenci1 = new Ogrenci(123,"Yusuf","Türkiye","İstanbul");
        Ogrenci ogrenci2 = new Ogrenci(564,"Ahmet","Türkiye","Ankara");
        Ogrenci ogrenci3 = new Ogrenci(234,"Mehmet","Türkiye","İzmir");
        Ogrenci ogrenci4 = new Ogrenci(543,"Ayşe","Türkiye","Kayseri");
        Ogrenci ogrenci5 = new Ogrenci(890,"Leyla","Türkiye","İstanbul");

        kurs.ogrenciAdd(ogrenci1);
        kurs.ogrenciAdd(ogrenci2);
        kurs.ogrenciAdd(ogrenci3);
        kurs.ogrenciAdd(ogrenci4);
        kurs.ogrenciAdd(ogrenci5);

        System.out.println(kurs);
*/

        Scanner scanner = new Scanner(System.in);

        int number;
        String name;
        String country;
        String city;

        boolean devam = true;
        System.out.println(kurs.infoKurs());
        while (devam && kurs.emptyCapacity > 0){
            System.out.print("Öğrencinin numarasını giriniz : " );
            number = Integer.parseInt(scanner.nextLine());

            System.out.print("Öğrencinin adını giriniz : " );
            name = scanner.nextLine();

            System.out.print("Öğrencinin Ülkesini giriniz : " );
            country = scanner.nextLine();

            System.out.print("Öğrencinin Şehrini giriniz : " );
            city = scanner.nextLine();

            Ogrenci ogrenci = new Ogrenci(number,name,country,city);
            kurs.ogrenciAdd(ogrenci);

            System.out.print("YENİ ÖĞRENCİ EKLEMEK İSTİYOR MUSUNUZ (E/H)--> ");
            String secim = scanner.nextLine();
            if(secim.equalsIgnoreCase("H") || (kurs.emptyCapacity==0)){
                devam = false;
                // break;
            }
        }
        System.out.println(kurs);
    }

}
