package gunler.gun50_18_01_2023.ilkOrnek;

public class AParent {
    String parentFieldStr;
    int parentFieldInt;
    private String privateStr;

    AParent() {
        System.out.println("Super Class constructor.");

    }
    public void setPrivateStr(String str){
        this.privateStr=str;
    }
    public String getPrivateStr(){
      return privateStr;
    }

    public void aMethod() {
        System.out.println("I am e method for super/parent");
    }
}
