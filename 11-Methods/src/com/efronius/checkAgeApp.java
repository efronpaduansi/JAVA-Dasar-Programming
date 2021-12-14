package com.efronius;

public class checkAgeApp {
    //program sederhana untuk mengecek umur
    static void checkAge(int age){
        if(age < 18){
            System.out.println("Maaf, anda masih dibawah umur!");
        } else{
            System.out.println("Selamat anda sudah cukup umur.");
        }
    }

    public static void main(String[] args) {
        checkAge(20);
    }
}
