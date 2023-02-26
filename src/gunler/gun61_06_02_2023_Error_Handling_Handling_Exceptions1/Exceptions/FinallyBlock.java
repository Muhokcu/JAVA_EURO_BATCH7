package gunler.gun61_06_02_2023_Error_Handling_Handling_Exceptions1.Exceptions;

import java.io.File;
import java.util.Scanner;

public class FinallyBlock {
    public static void main(String[] args) {

        try {
            //try block
            // code throws exception

        } catch (Exception e) {
            //catch block
            // Handling exception


        } finally {
            //Regardless of exception
            //Always run

        }
        // Getting exception
        System.out.println("Start test");
        try {
            File file = new File("data.txt");
            Scanner sc = new Scanner(file);//
        } catch (Exception e) {
            System.out.println("File not found");
        } finally {
            System.out.println("Close Connection");// executes always
        }
        System.out.println("End test");
        System.out.println("////////////////");


        System.out.println("Start test");
        try {
            System.out.println(2/2);
        } catch (Exception e) {
            System.out.println("File not found");
        } finally {
            System.out.println("Close Connection");// executes always
        }
        System.out.println("End test");
        System.out.println("////////////////");
    }
}


