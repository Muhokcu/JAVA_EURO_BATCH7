package gunler.gun15_09_11_2022;

public class SwitchToTernary {
    public static void main(String[] args) {
        int not = 70;
        String puan = "";
        switch (not) {
            case 90:
                puan = "Puaniniz A";
                break;
            case 80:
                puan = "Puaniniz B";
                break;
            case 70:
                puan = "Puaniniz C";
                break;
            case 60:
                puan = "Puaniniz D";
                break;
            case 50:
                puan = "Puaniniz E";
                break;
            default:
                puan = "kaldiniz";

        }
        System.out.println("puan = " + puan);
        // Switch To Ternary
        puan =    (not >= 90) ? "puaniniz A "
                : (not >= 80) ? "Puaniniz B"
                : (not >= 70) ? "Puaniniz C"
                : (not >= 60) ? "Puaniniz D"
                : (not >= 50) ? "Puaniniz E"
                : "Kaldiniz";
        System.out.println("puan = " + puan);
    }
}
