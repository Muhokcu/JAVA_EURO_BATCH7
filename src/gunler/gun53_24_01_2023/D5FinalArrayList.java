package gunler.gun53_24_01_2023;

import java.util.ArrayList;

public class D5FinalArrayList {

    ArrayList<Integer> arrayList = new ArrayList<>();
    final ArrayList<Integer> fnlArrayList = new ArrayList<>();

    public static void main(String[] args) {
        D5FinalArrayList nesne = new D5FinalArrayList();
        nesne.arrayList.add(12);
        nesne.arrayList.add(6);
        nesne.arrayList.add(23);
        System.out.println("nesne.arrayList = " + nesne.arrayList);
        nesne.arrayList.remove(1); // remove etmek silmek 1. indeksi siliyor burda
        System.out.println("nesne.arrayList = " + nesne.arrayList);

        nesne.fnlArrayList.add(34);
        nesne.fnlArrayList.add(1);
        nesne.fnlArrayList.add(890);
        System.out.println("nesne.fnlArrayList = " + nesne.fnlArrayList);
        nesne.fnlArrayList.remove(2);// final da olsa silme yad ekleme yapabiliriz
        System.out.println("nesne.fnlArrayList = " + nesne.fnlArrayList);
        nesne.fnlArrayList.add(167);//
        nesne.fnlArrayList.add(3);// FINAL OLARAKDA TANIMLANSA LISTEZE EKLEME VE CIKARMA ISLEMI YAPILABILIR
        nesne.fnlArrayList.add(345);//
        System.out.println("nesne.fnlArrayList = " + nesne.fnlArrayList);

        nesne.arrayList = nesne.fnlArrayList; // nesne.arrayList is not final therefore it can be assigned by another arrayList // bunu yapma izin veriyor ama tersine izin yok
        System.out.println("nesne.arrayList = " + nesne.arrayList);

      //  nesne.fnlArrayList=nesne.arrayList;// burdaki tersi ve hata veriyor// nesne.fnlArrayList declared as final therefor it can not assigned by an other arrayList


    }

}
