package com.efronius;

public class Main {

    public static void main(String[] args) {
	// Kita akan coba menentukan panjang dari sebuah string

        String fullName = "Frank Safio";
        System.out.println("Panjang dari nama dari adalah : " + fullName.length());

    //Kita bisa mengubah string methods
        String address = "Jakarta Indonesia";

        System.out.println("Huruf besar semua : "+address.toUpperCase());
        System.out.println("Huruf kecil semua : "+address.toLowerCase());

    //Kita bisa menentukan posisi dari sebuah karakter
            String greeting = "Halo selamat datang di BELAJAR Java.";

            System.out.println(greeting.indexOf("BELAJAR"));

    //String Concatenation
        String fName = "Andi";
        String lName = "Agat";

        System.out.println("My full name is, "+ fName + " " + lName);




    }
}
