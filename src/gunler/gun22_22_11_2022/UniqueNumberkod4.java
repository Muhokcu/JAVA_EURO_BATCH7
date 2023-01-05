package gunler.gun22_22_11_2022;

public class UniqueNumberkod4 {
    // Write a method that finds the unique number among three numbers
    // 3 sayi icerisinde essiz sayi addedini bulan bir method yaziniz

    public static void main(String[] args) {

        uniqueNumber();
    }

    public static void uniqueNumber(){
        int a = 1;
        int b = 2;
        int c = 3;
        int sonuc = 0;

        if(a == b && a == c){
            sonuc = 1;
        }else if(a == b || a == c || b == c){
            sonuc = 2;
        }else{
            sonuc = 3;
        }

        System.out.println("sonuc = " + sonuc);
    }

}
