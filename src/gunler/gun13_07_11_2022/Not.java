package gunler.gun13_07_11_2022;

public class Not {
    public static void main(String[] args) {
        int not = 45;
        char derece = 'A';
        if (not >= 0 && not < 101) {
            System.out.println("distaki if body");
            if (not >= 85) {
                derece = 'A';
                System.out.println("super");
            } else if (not >= 70) {
                derece = 'B';
                System.out.println("bravo");
            } else if (not >= 50) {
                derece = 'C';
                System.out.println("iyi daha guzel olacak");
            } else if (not >= 30) {
                derece = 'D';
                System.out.println("biraz gayret");
            } else if (not >= 0) {
                derece = 'E';
                System.out.println("calismak gerek");
            }

            System.out.println("distaki if block sonu");
      //  } else if (not > 100) {
          //  System.out.println("yanlis bir sayi girdiniz");
            System.out.println("aldiginiz notun derecesi = " + derece);// burayada yazilabilir
        }







   // }


 //       System.out.println("aldiginiz notun derecesi = "+derece);// burayada yazilabilir
 //   {
  //      System.out.println("if ler bitti");
    }

}


/*

        int not = 23;
        // 100 - 85 arasinda ise super
        // 85 - 60 arasinda ise suoer
        // 0  - 30 cok  calismalk gerek
        // 30 - 50 biraz daha gayret
        // 50- 70
        // 70 - 85
        if (not >= 0 && not < 30) {
            System.out.println("calismak gerek");
        } else if (not >= 30 && not < 50) {
            System.out.println("biraz daha gayret");
        } else if (not >= 70 && not < 85) {
            System.out.println("iyi daha iyi olacak");
        } else if (not >= 85 && not < 100) {
            System.out.println("Super!!!!!");

        }

    }

}

 */


//    asagidakiler yanlis mutlaka bak


        /*

        int not = 85;
        if (not <= 100 && not > 80) {
            System.out.println("süper");

        } else if (not >= 0 && not <= 29) {
            System.out.println("çok çalışman gerek");
        } else if (not >= 30 && not <= 50) {
            System.out.println("biraz daha gayret");
        } else {


            System.out.println("iyi yoldasın, devam");
        }
    }
}
*/

//   if (85 <= not <= 100) {
//        System.out.println("Super");
//   } else if (70 <= not <= 85) {
//        System.out.println("iyi");
//   } else if (50 <= not <= 70) {
//       System.out.println("idare eder");
//   } else if (30 <= not <= 50) {
//       System.out.println("kotu");
//    } else if (0 <= not <= 30) {


