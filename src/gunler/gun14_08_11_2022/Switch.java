package gunler.gun14_08_11_2022;

public class Switch {
    public static void main(String[] args) {
        // haftanin gunleri pazartesi 1 sali 2 carsamba 3
        int gunSiraNo = 7;
        String gun = "Sali";
        if (gunSiraNo == 1) {
            gun = "Pazartesi";
        } else if (gunSiraNo == 2) {
            gun = "sali";
        } else if (gunSiraNo == 3) {
            gun = "Carsamba";
        } else if (gunSiraNo == 4) {
            gun = "persembe";
        } else if (gunSiraNo == 5) {
            gun = "cuma";
        } else if (gunSiraNo == 6) {
            gun = "cumartesi";
        } else
            gun = "pazar";
        System.out.println("gun = " + gun);
        gunSiraNo = 7;
    String bugun ="";

        switch (gunSiraNo) {
            case 1:

                System.out.println("gunlerden pazartesi");
                break;
            case 2:
                System.out.println("gunlerden sali");
                break;
            case 3:
                System.out.println("gunlerden carsamba");
                break;
            case 4:
                System.out.println("gunlerden persembe");
                break;
            case 5:
                System.out.println("mubarek gun");
                break;
            case 7:
                System.out.println("gunlerden pazar");
                break;
            case 6:
                System.out.println("gunlerden cumartesi");
            default:
                //  System.out.println("gun sira degeri olmadi");


        }
        // System.out.println("switch disi");
        // Switcte boolen kullanamiyoruz
        gunSiraNo = 5;
        switch (gunSiraNo) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("hafta ici");
                break;
            case 7:
            case 6:
                System.out.println("happy wekend");
                break;
            default:
                System.out.println("ne hafta ici nede hafta sonu");
        }
        System.out.println("block disi");
    }

}
