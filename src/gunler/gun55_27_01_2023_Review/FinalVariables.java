package gunler.gun55_27_01_2023_Review;


public class FinalVariables {

//    public final int MAX_RANGE;
//    MAX_RANGE = 10;

    public final int MIN_RANGE = 1;

    // public final int MAX_VALUE;

    public final int MIN_VALUE;

    public final int LAST_VALUE;

    public static final int ID_NUM = 1234;

    public static final String ADMIN_NAME;

//    public FinalVariables(){
//        MAX_VALUE = 100;
//    }

    public FinalVariables(int num){
        MIN_VALUE = num;
    }

    {
        LAST_VALUE = 15;
    }

    static {
        ADMIN_NAME = "ADMIN";
    }

    public static void main(String[] args) {

        final int MAX_COUNT = 5;
        // MAX_COUNT = 6;

        final double TC_NO;
        TC_NO = 1234566;
        // TC_NO++;
    }}