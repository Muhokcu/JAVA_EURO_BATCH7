package gunler.gun59_02_02_2023_Polymorphism2;

public class D2Polymorphism2 {
    public static void main(String[] args) {
        System.out.println("Polymorphism-2 in java.");
        //Anonymous class definition and inner class implemantaion of abstract class
        D1Deneme deneme = new D1Deneme() {
            @Override
            void print() {
                System.out.println("Anonymous class...inner class");
            }
        };
        deneme.print();
        //Anonymous class olduğundan getSimpleName() metodu herhangi bir isim döndürmez.
        System.out.println("deneme.getClass().getSimpleName() = " + deneme.getClass().getSimpleName());
        System.out.println("deneme.getClass().getName() = " + deneme.getClass().getName());

        //Normal bir miras ilişkisi ile abstract class tan miras alan child class ın override ettiği metod.
        D3DenemeInherit denemeInherit = new D3DenemeInherit();
        denemeInherit.print();
        System.out.println("denemeInherit.getClass().getSimpleName() = " + denemeInherit.getClass().getSimpleName());

    }
}
