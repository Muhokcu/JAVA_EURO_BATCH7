package gunler.gun62_07_02_2023_Error_Handling_Handling_Exceptions2;

// Userdefined exception
public class AgeException extends Exception {//Checked exception

    //Checked exception olduğundan bu exception ı throw eden metodları çağıranlar handling mekanızması kurmak zorundadır.
    AgeException(String mesaj) {
        super(mesaj);
    }
}
