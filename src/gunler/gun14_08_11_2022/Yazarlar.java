package gunler.gun14_08_11_2022;

public class Yazarlar {
    public static void main(String[] args) {
        String kitapAdi = "Vadideki Zambak";
        String kitabinYazari = "";
        switch (kitapAdi) {
            case "Suc ve Ceza":
                kitabinYazari = "Dostoyevski";
                System.out.println("kitabin yazari dostoyevski");
                break;
            case "Sinekli Bakkal":
                System.out.println("kitabin yazari halide edip");
                break;
            case "Goriot Baba":
            case "Vadideki Zambak":
                kitabinYazari = "Balzac";
                System.out.println("kitabin Yazari Balzac");
                break;
            case "pembe incilli kaftan":
                kitabinYazari = "omer seyfettin";
                System.out.println("kitabin yazari omer seyfettin");
                break;
            case "iki sehrin hikayesi":
                kitabinYazari = "Carles Dickens";
                System.out.println("kitabin yazari Charles Dicken");
                break;
            default:

                System.out.println("aradiginiz kitap bulunamadi");
        }
        System.out.println("kitabin yazari = " + kitabinYazari);
    }
}


// yanlis cikardim kontrol et