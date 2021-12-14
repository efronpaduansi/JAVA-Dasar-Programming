package com.efronius;

public class Main {

    public static void main(String[] args) {
	// Tipe data Casting -> kita bisa mengubah tipe data ke bentuk yang lain

        //Contoh mengubah tipe int ke double ataupun sebaliknya
        int myInt = 55;
        double myDouble = myInt;

        System.out.println("Tipe data int : "+myInt);
        System.out.println("Tipe data Double : "+myDouble);

        //Mengubah tipe data double ke Int
        double Double = 99.9d;
        int Integer = (int) Double;

        System.out.println("Tipe data double : " +Double);
        System.out.println("Tipe data Int : "+Integer);


    }
}
