package gunler.gun69_16_02_2023_Review;

public class PersonKisi {
    private int TCNO;
    private String name;
    private String address;

    public PersonKisi(int TCNO, String name, String address) {
        this.TCNO = TCNO;
        this.name = name;
        this.address = address;
    }

    public int getTCNO() {
        return TCNO;
    }

    public void setTCNO(int TCNO) {
        this.TCNO = TCNO;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "PersonKisi{" +
                "TCNO=" + TCNO +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
