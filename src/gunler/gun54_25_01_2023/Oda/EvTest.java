package gunler.gun54_25_01_2023.Oda;

public class EvTest {
    public static void main(String[] args) {

        Oda oda1 = new Oda("Oturma Odasi", "Mavi");
        Oda oda2 = new Oda("Misafir Odasi", "Yesil");
        Oda oda3 = new Oda("Yatak Odasi", "Sari");
        Oda oda4 = new Oda("Cocuk Odasi", "Kirmizi");
        Cati cati = new Cati(20,"Kiremit");
        Mutfak mutfak = new Mutfak("Amerikan", 30, "Gomme", "Fayans");
        Bahce bahce = new Bahce("Cim", "Demir", "Elektrikli", true);

        Ev ev = new Ev("Kinali Kosk", oda1, oda2, oda3, oda4, cati, mutfak, bahce);

        ev.kapiAc();
        ev.getMutfak().yemekYap();
        ev.getBahce().sulamaYap();
        ev.getCati().tut();

        System.out.println(ev.getOda1().getNeOdasi());

        System.out.println("Evde havuz var mi? " + ev.getBahce().isHavuzVarmi());

    }
}
