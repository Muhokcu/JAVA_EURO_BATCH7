package gunler.gun25_28_11_2022;

public class Baskentler {
    public static void main(String[] args) {
        // baskent(Turkiye);

        // Turkiye--->Ankara
        // Almanya---->Berlin
        //Ingiltere---->Londra
        //Italya---->Roma
        //Ispanya---->Madrid
        //Norvec ---->OSlo
        baskent("Almanya");
        String norvecBaskenti = baskent("Norvec");
        System.out.println(baskent("Ispanya"));
        System.out.println("norvecBaskenti = " + norvecBaskenti);
        System.out.println("baskentReturn(\"Turkiye\") = " + baskentReturn("Turkiye"));
    }

    public static String baskent(String ulke) {
        String capital = "";
        switch (ulke) {
            case "Almanya":
                capital = "Berlin";
                System.out.println("capital = " + capital);
                break;
            case "Italya":
                capital = "Roma";
                break;
            case "Ingiltere":
                capital = "Londra";
                break;
            case "Norvec":
                capital = "Oslo";
                break;
            case "Turkiye":
                capital = "Ankara";
                break;
            case "Ispanya":
                capital = "Madrid";
                break;
            default:
                capital = "Atina";
        }

//        System.out.println("capital = " + capital);
        return capital;
    }

    public static String baskentReturn(String ulke) {
        String capital = "";
        switch (ulke) {
            case "Almanya":
                return "Berlin";
            case "Italya":
                return "Roma";
            case "Ingiltere":
                return "Londra";
            case "Norvec":
                return "Oslo";
            case "Turkiye":
                return "Ankara";
            case "Ispanya":
                return "Madrid";
            default:
                return "Atina";
        }
    }
}
