package gunler.gun42_04_01_2023_Constructor_2.Otopark;

import java.util.ArrayList;

public class OtoPark {
    String name;
    String adress;
    ArrayList<Car> arabalar = new ArrayList<>();

    public OtoPark(String name, String adress) {
    }


    public void arabaEkle(Car araba) {
        System.out.println(araba.marka + " marka = " + araba.plakasi + " plakali arac otoparka giris yapti");

        this.arabalar.add(araba);
        System.out.println("Otoparkta su anda " + arabalar.size() + " araba var ");
    }

    public  void arabaListesi(){
        System.out.println(this.name + " park etmis arabalar listesi");
        System.out.println("---------------------------------");
        for (Car araba: this.arabalar){
            System.out.println("araba = " + araba);
        }
    }
    @Override
    public String toString() {
        return "OtoPark{" +
                "name='" + name + '\'' +
                ", adress='" + adress + '\'' +
                '}';
    }


    }

