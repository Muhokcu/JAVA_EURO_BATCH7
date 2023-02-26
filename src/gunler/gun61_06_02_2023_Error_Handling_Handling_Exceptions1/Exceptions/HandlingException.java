package gunler.gun61_06_02_2023_Error_Handling_Handling_Exceptions1.Exceptions;

import java.sql.SQLOutput;

public class HandlingException {
    public static void main(String[] args) {

        // BURDA TRY VE CATCH ARASINA HATALI BIR MATEMATIK KODU YAZILDIGINDA HATA GOSTERMIYOR SEN NE YAZARSANN ONU VERIRYOR

        try {

            //try block
            // code throws exception

        } catch (Exception e) {// Exception class and reference for the object

            //catch block
            // Handling exception

        }

        try {
            System.out.println(1 / 0);

        } catch (Exception e) {
            System.out.println("Can not devided zero ");

        }
        System.out.println("///////////////////////////////");


        // Not Getting Exception if not handled
        System.out.println("Star Test");
        System.out.println("Run Test");


        try {
            System.out.println("Calculation " + 1 / 0);


        } catch (Exception e) {
            System.out.println("Can not divided zero ");


        }
        System.out.println("Ende Test ");

        System.out.println("///////////////////////////////");



        // Not Getting Exception if not handled with having some other code inside try block
        System.out.println("Star Test");
        System.out.println("Run Test");


        try {
            System.out.println("Run Test");

            System.out.println("Calculation " + 1 / 0);
            System.out.println("Another Calculation" + 1 / 1);// Not Executed line burayi okumadi eger okunmasi istanirse bir ust satira alinmali


        } catch (Exception e) {
            System.out.println("Can not divided zero ");
            System.out.println("Exception handled");


        }
        System.out.println("Ende Test ");
    }
}
