package gunler.gun47_13_01_2023;

public class MyBankAccountTest {
    public static void main(String[] args) {
        MyBankAccount user = new MyBankAccount(1234567, 0);
        System.out.println("User account number: " + user.printAccountNumber() + " User account balance : " + user.printAccountBalance());

        user.depositMoney(150000);
        System.out.println("User account number: " + user.printAccountNumber() + " User account balance : " + user.printAccountBalance());

        // Hesap numarasini update etmeye musaade etmedik yani nu istance var icin setter method yok
        // user.setAcc_Number();

    }
}
