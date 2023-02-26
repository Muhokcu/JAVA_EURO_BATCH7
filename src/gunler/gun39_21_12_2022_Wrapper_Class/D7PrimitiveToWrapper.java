package gunler.gun39_21_12_2022_Wrapper_Class;


public class D7PrimitiveToWrapper {
    public static void main(String[] args) {

        int num = 10;
        double num2 = 32.3;
        boolean b = true;
        Integer obj1 = Integer.valueOf(num);
        Double obj2 = Double.valueOf(num2);
        Boolean obj3 = Boolean.valueOf(b);

        System.out.println("obj1 = " + obj1);
        System.out.println("obj2 = " + obj2);
        System.out.println("obj3 = " + obj3);

        if (obj1 instanceof Integer) {
            System.out.println(obj1 + " is converted to Wrapper Object");

        } else {
            System.out.println(obj1 + " is not converted to Wrapper Object");


        }

    }
}
