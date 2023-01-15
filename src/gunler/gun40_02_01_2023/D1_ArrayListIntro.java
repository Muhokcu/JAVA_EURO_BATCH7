package gunler.gun40_02_01_2023;

import java.util.ArrayList;

public class D1_ArrayListIntro {
    public static void main(String[] args) {
        // Creating ArrayList

        ArrayList<String> nameList = new ArrayList<>();
        nameList.add("Ayse ");
        nameList.add("Ahmet ");
        nameList.add("Hasan ");
        nameList.add("Emine ");
        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(99);
        numbers.add(25);
        numbers.add(50);
        //numbers.add("45"); bu durumda hata verir
        numbers.add(new Integer("45"));//
        // int value yu arka planda otomatik olarak Integer wrapper objective icin hata almadan parametre olarak gonderebiliyoruz

        numbers.add(63);
        // arka planda  otomatik olarak yapilan islem
        Integer num2 = 35;
        numbers.add(num2);


        Integer num = new Integer("68");
        numbers.add(num);
        // pratik olarak String veriyi Integer object e cevirme yolu
        numbers.add(new Integer("45"));

        System.out.println("nameList.get(0) = " + nameList.get(0));
        System.out.println("nameList.get(1) = " + nameList.get(1));
        System.out.println("nameList.get(2) = " + nameList.get(2));
        System.out.println("nameList.get(3) = " + nameList.get(3));


        System.out.println("numbers.get(0) = " + numbers.get(0));
        System.out.println("numbers.get(1) = " + numbers.get(1));
        System.out.println(numbers.get(2));
        System.out.println(numbers.get(3));
        System.out.println(numbers.get(4));
        System.out.println(numbers.get(5));
        System.out.println(numbers.get(6));
        // System.out.println(numbers.get(7)); IndexOutOfBoundsException hatasi verir

        System.out.println("nameList.size() = " + nameList.size());
        System.out.println("numbers.size() = " + numbers.size());

        System.out.println("nameList.toString() = " + nameList.toString());
        System.out.println("numbers.toString() = " + numbers.toString());
        String list1 = nameList.toString();
        String list2 = numbers.toString();


        System.out.println("nameList = " + nameList);// bu sade konsolda basma da ise yarar toStringi kullanmak lazim
        System.out.println("numbers = " + numbers);//


    }
}
