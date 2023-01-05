package gunler.gun13_07_11_2022;

public class NestedOrnek {
   public static void main(String[] args) {

      int numara = 16;
        if (numara % 2 == 0) {
           System.out.println("numara 2 ye kalansiz boluneblir");
        } else if (numara % 3 == 0) {
           System.out.println("numara 3 e kalansiz bolunebilir");

        }

         // dista bir if olusturuyoruz 2 ye kalansiz bolunebiliyor mu konrol ediyoruz
       // 2 ye kalansiz bolunebilir ise icende baska bir if olusturuyoruz 3 e kalansiz bolunebilir
       // kontrol ediyoruz numara 6 ya kalansiz bolunur
       numara = 20;

           if (numara % 2 == 0) {
            if (numara % 3 == 0) {
               System.out.println(numara + " sayimiz 6 ya kalansiz bolunur");
             }
            if (numara % 5 == 0) {
                System.out.println(numara + " 10 a kalansiz bolunebilir");
            }else{
                System.out.println(numara+ " 10 a kalansiz bolunemez");
            }
         }
       System.out.println("if ler bitti block disindayiz");
   }}
