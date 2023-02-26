package gunler.gun53_24_01_2023;

public class D9FinalClassTest {
    //public class FinalClassTest extends FinalClass{ FinalClass final olduğundan miras alınamaz

    public static void main(String[] args) {
        D9FinalClassTest fnlClassTest = new D9FinalClassTest();
        D8FinalClass fnlClass = new D8FinalClass(); //Final tanımlansa bile instance oluşturup ilgili metod çağrılabilir
        fnlClass.birMethod();
        //fnlClassTest.birMethod();
    }
}
