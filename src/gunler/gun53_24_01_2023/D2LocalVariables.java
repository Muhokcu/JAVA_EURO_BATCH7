package gunler.gun53_24_01_2023;

public class D2LocalVariables {

    // Instance variables
    public String name; // Declaration // name icin atama ya burda yapilacak yada constructor veya initialization icinde atanacak
    // public String name = "Hasan";   Declaration and assigmengt in same statment  // bunu yapabilirz
    public int age;

    //public int age = 25; bunu yapabiliriz
    // name = "Zeynep";boyle yapamayiz // assigmengt is not valid
    //Constructor block
    // Constructor icerisinde degiskenlerine instance degiskenlerine deger atamasi yapilabilir
    D2LocalVariables() { // Burasi constructor
        name = "Ahmet";
        age = 12;
        String lastName;// Local variable. initialization is mandatory
        //  System.out.println(lastName);//wont be compiled by java. it gives an error
        System.out.println("name = " + name);// instance variable initialization is mandatory

    }

    // Method block  yani kod blogu
    public void method() {
        // instance degiskenlerine deger atamasini burda yapilabilir
        name = "Muhammet";
        int number;// Local variable. initialization is mandatory
        // fakat bboyle bir deger atarsak sorun ortadan kalkar
        number = 10;// burdaki  atamayi yapmazsak bir alttaki satir hata veriyor
        System.out.println(number);// yukarda baslangic degeri atamadan hata verir   //// // wont be compiled by java. it gives an error
        System.out.println(age);// burda herhangi bir sorun yok //  instance variable  initialization is mandatory
    }

    {

        // init block
        // instance degiskenlerine bu non-statik blok icerisinde deger atamasi yapilabilir
        name = "Ali";
        age = 45;
        double salary;// Local variable. initialization is mandatory
        //System.out.println(salary);// wont be compiled by java. it gives an error
    }
    // salary=10.0 // local degisken oldugunda tanimlandigi blogun didinda varligini surduremez / erisilemez.
    // number =34; // local degisken oldugunda tanimlandigi blogun didinda varligini surduremez / erisilemez.
    // name="Ahmet"; // burda atama yapamiyoruz bu atama ya ayni satirda yapariz yada constructor veya initialization icinde atanabilir


}
