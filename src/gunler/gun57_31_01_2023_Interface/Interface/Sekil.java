package gunler.gun57_31_01_2023_Interface.Interface;

public interface Sekil {


    // Interface variables are public final static, not instance
    int MAX_SIZE = 100; // public static final int MAX_SIZE = 100;
    // protected int MIN_SIZE = 100;


    // An interface can not have a constructor
//    public Sekil(){
//
//    }


    // Interface methods are always abstract
    // No need to user abstract keyword for an abstract method in Interface
    //public abstract void draw();
    public void draw();

    // Interface methods are always public
    // Can not have any other access modifier
    // protected void draw2();
    // public void draw2();
    void draw2();

    // Interface can not have final and static abstract methods
    // final void draw3();
    // static void draw3();

    // Interface can have default method
    default void draw4() {

    }
    // public void draw4(){}
    // protected void draw4(){}

    // Interface can have static method
    static void draw5() {

    }


    // private methods are also available in interface
    // just to allow private method t be called inside the interface
    default void draw6() {
        draw7();
    }

    private void draw7() {
    }
}