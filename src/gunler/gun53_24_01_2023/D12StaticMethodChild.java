package gunler.gun53_24_01_2023;

public class D12StaticMethodChild extends D13StaticMethodParent {
    //static metodlar override edilemezler. Ancak hide edilebilirler
    //parent access modifier default olduğundan,
    //child class ta default, protected ya da public olabilir
    protected static void methodParent(){ //Parent class static method methodParent() is hided.
        System.out.println("Child static method.");
    }

    public static void main(String[] args) {
        D13StaticMethodParent.methodParent();
        D12StaticMethodChild.methodParent();
    }
}
