package gunler.gun47_13_01_2023;

public class VictimBank {
    int acc_number;
    int acc_balance;

    public int printAccountNumber() {
        return this.acc_number;
    }

    public int printAccountBalance() {
        return this.acc_balance;

    }

    public void depositMoney(int money) {
        this.acc_balance += money;


    }

}
