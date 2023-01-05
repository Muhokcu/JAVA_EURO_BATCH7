package gunler.gun13_07_11_2022;

public class IfOrnek {
    public static void main(String[] args) {
        int a = 1000;
        int b = 200;
        int buyukSayi = 0;
        if (a > b) {
            System.out.println("buyuk sayi a " + a);
            buyukSayi = a;

        } else if (b > a) {
            System.out.println("buyuk sayi b " + b);
            buyukSayi = b;
        } else {
            System.out.println("sayilar esit");
        }
        System.out.println("buyuk Sayi : " + buyukSayi);

    }
}


      /* if (a != b && a < b) {
            System.out.println("b büyüktur");

        } else {
            System.out.println("a büyüktur");
        }
    }
}


//if (a>b){
  //  System.out.println("buyuk olan sayi a " + a);
//}else if (b>a){
  //  System.out.println("buyuk sayi b " + b);

//}else {
*/