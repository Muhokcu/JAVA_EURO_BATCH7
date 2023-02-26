package gunler.gun61_06_02_2023_Error_Handling_Handling_Exceptions1.Errors;

public class StackOverFlowError {
    public static void main(String[] args) {
        recursiveMethod();

    }

    public static void recursiveMethod() {
        // run time error / stackoverFlowerror  run edildikten sonra hafizanin dolmasi ile alakli hata
       // recursiveMethod();// method kendi kendini tekrar cagirmis oluyor ve hata veriryor // HATA BURDA
    }
}
