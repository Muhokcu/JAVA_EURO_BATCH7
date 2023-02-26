package gunler.gun54_25_01_2023.Bilgisayar;

public class D2Cozunurluk {

    private int boy;
    private int en;

    public D2Cozunurluk(int boy, int en){// parantez icindekiler instence
        this.boy = boy;
        this.en = en;
    }

    public int getBoy(){
        return boy;
    }

    public int getEn(){
        return en;
    }

    @Override
    public String toString() {
        return "Cozunurluk{" +
                "boy=" + boy +
                ", en=" + en +
                '}';
    }
}
