package gunler.gun42_04_01_2023_Constructor_2.Student;
import java.util.ArrayList;

public class Kurs {
    String name;
    int maxCapacity;
    int emptyCapacity;

    ArrayList<Ogrenci> ogrenciList = new ArrayList<>();

    public Kurs(String name, int maxCapacity) {
        this.name = name;
        this.maxCapacity = maxCapacity;
        emptyCapacity();
    }
    public int emptyCapacity(){
        emptyCapacity = maxCapacity - ogrenciList.size();
        return emptyCapacity;
    }
    public void ogrenciAdd(Ogrenci ogrenci){
        if(emptyCapacity() > 0){
            ogrenciList.add(ogrenci);
            System.out.println(ogrenci.schoolNumber + " no'lu " + ogrenci.name + " kursa eklandi.");
            emptyCapacity();
        }else System.out.println("Kurs kapasitesi dolduğundan öğrenci kursa eklenemedi!");
    }

    public String infoKurs(){
        String str = "\nKursun adı      : " + name;
        str+= "\nMax kapasite    : " + maxCapacity;
        str+= "\nBoş kapasite    : " + emptyCapacity;
        return str;
    }
    public  String toString(){
        String str = infoKurs();
        str+= "\n---------- Öğrenci Listesi -----------";
        str+= "\nNo    Adı        Şehir      Ülke";
        str+= "\n----- ---------- ---------- ----------";
        for(Ogrenci ogrenci: ogrenciList){
            str+="\n" + ogrenci.toString();
        }

        return str;
    }
}
