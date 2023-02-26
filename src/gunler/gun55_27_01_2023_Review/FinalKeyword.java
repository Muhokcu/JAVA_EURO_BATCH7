package gunler.gun55_27_01_2023_Review;

public class FinalKeyword {

    // final variable
    private final int finalVar = 1;

    // final method

    public final void finalMethod(){
        System.out.println("Fianl Method");
    }

    // final local variable
    public void testFinal(){
        final int localVar = 1;
    }

    public void testFinalParameter(final int num){
        // re-assignment yapilamiyor
    }
}

final class FinalClass{

    public void print(){
        System.out.println("Final Class");
    }
}

// final class can not be extended
//class ChildClass extends FinalClass{
//
//}


class Parent{
    public final void print(){
        System.out.println("Parent Class");
    }
}

class Child extends Parent{
    // final method can not be overrriden by child class method
//    public void print(){
//        System.out.println("Child Class");
//    }
}
