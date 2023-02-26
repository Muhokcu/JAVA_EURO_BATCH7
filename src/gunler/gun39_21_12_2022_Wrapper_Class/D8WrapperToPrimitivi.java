package gunler.gun39_21_12_2022_Wrapper_Class;

public class D8WrapperToPrimitivi {
    public static void main(String[] args) {
        Integer obj1 = Integer.valueOf(25);
        Double obj2 = Double.valueOf(25.8);
        Boolean obj3 = Boolean.valueOf(true);

        int num1 = obj1.intValue();
        double num2 = obj2.doubleValue();
        boolean b = obj3.booleanValue();
        int num3 = obj2.intValue();
        double num5 = obj1.doubleValue();
        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);
        System.out.println("b = " + b);
        System.out.println("num3 = " + num3);
        System.out.println("num5 = " + num5);


    }
}
