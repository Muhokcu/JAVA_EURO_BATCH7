package gunler.gun62_07_02_2023_Error_Handling_Handling_Exceptions2;

public class AddressException extends RuntimeException {//Unchecked exception
    //UnChecked exception olduğundan bu exception ı throw eden metodları çağıranlar handling mekanızması kurmak zorunda değildir.
    AddressException(String mesaj){
        super(mesaj);
    }
}
