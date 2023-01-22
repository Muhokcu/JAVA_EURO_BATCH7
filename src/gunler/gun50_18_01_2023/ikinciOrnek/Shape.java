package gunler.gun50_18_01_2023.ikinciOrnek;

public class Shape {
    //Public -> all other classes can access-see the class members.
    //protected -> all other classes can access-see the class members only in same packace  and if an inheritance relation
    // yanlis //default -> all other classes can access-see only in same package
    //private -> class only- Only same class members can access-see the other members
    // public  - protected  - default  - private
    // Parent  -> publiuc  Sub-Class - > public
    //Parent ->protected  Sub-Class-> public - protected
    // Parent ->default   Sub-Class-> public - protected -default


    //public -> all other classes can access-see the class members.
    //protected -> all other classes can access-see the class members only in same package and if an inheritance relation exist.
    //default -> package only -all other classes can access-see only in same package
    //private -> class only -Only same class members can access-see the other members.

    //public - protected - default - private
    //Parent -> public      Sub-Class -> public
    //Parent -> protected   Sub-Class -> public - protected
    //Parent -> default     Sub-Class -> public - protected - default
    void draw() {//x eccess modifier must be at least  same or wider privilige in sub-classes
        System.out.println("I am drawing a generel shape");
    }
}
