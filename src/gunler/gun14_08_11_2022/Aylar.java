package gunler.gun14_08_11_2022;

public class Aylar {
    public static void main(String[] args) {
        int aySiraNo = 4;
        String ay = "";
        switch (aySiraNo) {
            case 1:
                System.out.println("ocak");
                break;
            case 2:
                System.out.println("subat");
                break;
            case 3:
                System.out.println("mart");
                break;
            case 4:
                System.out.println("nisan");
                break;
            case 5:
                System.out.println("mayis");
                break;
            case 6:
                System.out.println("haziran");
                break;
            case 7:
                System.out.println("temmuz");
                break;
            case 8:
                System.out.println("agustos");
                break;
            case 9:
                System.out.println("eylul");
                break;
            case 10:
                System.out.println("ekim");
                break;
            case 11:
                System.out.println("kasim");
                break;
            case 12:
                System.out.println("aralik");
                break;
            default:
                System.out.println("aradiniz ay bulunamadi");


        }
        System.out.println("aylardan : ");
        String mevsim = "";
        switch (ay) {
            case "aralik":
            case "ocak":
            case "subat":
                mevsim = "kis";
                System.out.println("kis: " + ay);
                break;
            case "mart":
            case "nisan":
            case "mayis":
                mevsim = "ilk bahar";
                System.out.println("mevsim : " + mevsim);
                break;
            case "haziran":
            case "temmuz":
            case "agustos":
                mevsim = "yaz";
                System.out.println("mevsim = " + mevsim);
                break;
        }
        System.out.println("mevsim :" + mevsim);


    }
}