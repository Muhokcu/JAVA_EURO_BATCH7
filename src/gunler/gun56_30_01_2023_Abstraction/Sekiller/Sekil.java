package gunler.gun56_30_01_2023_Abstraction.Sekiller;

public abstract class Sekil {
    public Sekil(){}
    public abstract void ciz(); // public abstract void ciz(int a, int b, int c);

    // abstract classta instance(abstract olmaya) method da create edilebilir
    public void cizme(){
        System.out.println("Sekil cizmiyor");
    }
    // final method overriding i engellemk icin abstract class ta olusturabiliriz
    public final void sinirlariCiz(){
        System.out.println("Sinirlar Ciziliyor");


    }

    //
    public static void kaydir(){
        System.out.println("Cizgi kaydiriliyor");
    }


}
