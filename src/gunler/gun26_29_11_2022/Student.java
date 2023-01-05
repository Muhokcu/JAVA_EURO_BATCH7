package gunler.gun26_29_11_2022;

public class Student {
    //name, surname, clasName, schoolName, schoolNumber, age weight
    // study, code, run playGame
    String name;
    String surName;
    String clasName;
    String schoolName;
    int schoolNumber;
    int age;
    double weight;
    // static degisken, tum class duzeyinde tek kopyasi olmasi anlamina gelir

    public void study(){
        System.out.println("Studying...");
    }
    public void code(){
        System.out.println("Coding...");
    }
    public void run(){
        System.out.println("Running...");
    }
    public void playGame(){
        System.out.println("Play gaming...");
    }
}
