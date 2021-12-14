package com.efronius;

public class Main {
    // Method adalah barisan kode program yang hanya running ketika dipanggil
    static void firstMethod(){
        System.out.println("Ini adalah method satu.");
    }
    //Method parameters
    static void namesMethod(String fname){
        System.out.println(fname + " Doe");
    }

    //Multiple methods
    static void mainMethod(String name, int age){
        System.out.println(name + " is " + age);
    }

    //Return values
    static  int intMethod(int x ){
        return 5 + x;

    }

    //Methods two parameters
    static int myMethod(int x, int y){
        return x + y;
    }
    public static void main(String[] args) {

        //Panggil called
        firstMethod();

        namesMethod("Jhon");
        namesMethod("Andi");
        namesMethod("Agat");

        System.out.println("Ini adalah Multi Methods");
        mainMethod("Efron", 22);
        mainMethod("Helna", 21);
        mainMethod("Andi", 20);

        System.out.println("Method value");
        System.out.println(intMethod(3));

        System.out.println("Method two parameters");
        System.out.println(myMethod(5, 10));
    }
}
