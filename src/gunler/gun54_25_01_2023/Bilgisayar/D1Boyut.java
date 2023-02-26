package gunler.gun54_25_01_2023.Bilgisayar;



public class D1Boyut {

    private double yukseklik;
    private double genislik;
    private double derinlik;

    public D1Boyut(double yukseklik, double genislik, double derinlik){
        this.yukseklik = yukseklik;
        this.genislik = genislik;
        this.derinlik = derinlik;
    }

    public double getYukseklik(){
        return yukseklik;
    }

    public double getGenislik(){
        return genislik;
    }

    public double getDerinlik(){
        return derinlik;
    }

    @Override
    public String toString() {
        return "Boyut{" +
                "yukseklik=" + yukseklik +
                ", genislik=" + genislik +
                ", derinlik=" + derinlik +
                '}';
    }

}
