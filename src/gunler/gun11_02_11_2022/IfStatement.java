package gunler.gun11_02_11_2022;

public class IfStatement {
    public static void main(String[] args) {
        System.out.println("Code buradan basladi");
        if (true) {
            System.out.println("Hello");
            System.out.println("World");

            System.out.println("Code buradan bitti");
            System.out.println("------------");
            int i = 5;
            // parantez olmadigi takdirde if  shata veri
            //  if (i>0){
            //      System.out.println(i + "sayisi pozitif sayidir");

            //   }
            if (i > 0) {
                System.out.println(i + " sayisi pozitif sayidir");
            }
            // tek bir statement var ise block icin suslu parantez olmadan da code calisir
            // ancak tavsiye edilen ve yaygin bir kullanim degil
            if (i > 0)
                System.out.println(i + " sayisi pozitif sayidir");
        }

    }
}
