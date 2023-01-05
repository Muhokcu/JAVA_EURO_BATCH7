package gunler.gun16_11_11_2022;

public class MutlakDeger {
    public static void main(String[] args) {
        // bir sayinin mutlak degerini dogru bir sekilde bulan ternary
        int num = -46245;
        int mutlakDeger= num>0 ? num : -num;

        System.out.println("sonuc = " + mutlakDeger);
    }
}
