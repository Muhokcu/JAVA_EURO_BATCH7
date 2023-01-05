package gunler.gun17_14_11_2022;

public class While2 {
    public static void main(String[] args) {
        // degisken degeri olustur ve baslangic degeri ata
        //

        int a = 0;
        while (a<10){
            System.out.println(a);
            a++;
            System.out.print("Siradaki ");
        }
        System.out.println("a = " + a);
        a= 5;
        while(a>0){
            System.out.println(a);
            a--;
            System.out.println("hi");
        }
        System.out.println("Block Disi");

    }
}
