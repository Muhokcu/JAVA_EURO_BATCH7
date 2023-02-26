package gunler.gun69_16_02_2023_Review;

import java.util.HashMap;
import java.util.Map;

public class MapPasswordUser {
    public static void main(String[] args) {
        Map<String, String> usersPasswordList = new HashMap<>();
        usersPasswordList.put("ahmet", "12345");
        usersPasswordList.put("mehmet", "xyz1234!");
        usersPasswordList.put("ali", "abc234");
        System.out.println("Users and Passwors : " + usersPasswordList);

        String userName = "ali";
        String password = "abc234";
        boolean flag = false;
        for (Map.Entry<String, String> userEntrt : usersPasswordList.entrySet()) {


            if (userName.equals(userEntrt.getKey()) && password.equals(userEntrt.getValue())) {
                System.out.println("Login successful!!");
                flag = true;
                break;
            }
        }
        if (!flag) {// (flag! =true)
            System.out.println("Login unsuccessel.!!");
        }

    }


}
