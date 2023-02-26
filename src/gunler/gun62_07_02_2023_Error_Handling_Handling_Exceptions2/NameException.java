package gunler.gun62_07_02_2023_Error_Handling_Handling_Exceptions2;

public class NameException extends Exception{
    //Checked exception olduğundan bu exception ı throw eden metodları çağıranlar handling mekanızması kurmak zorundadır.
    NameException(String mesaj){
        super(mesaj);
    }
    }

