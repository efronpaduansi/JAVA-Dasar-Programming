package com.efronius;
import java.util.*;

public class Main {

    public static void main(String[] args) {

        int nilai;
        String nama;
        char grade;
        Scanner input = new Scanner(System.in);

        System.out.println("===Selamat datang di aplikasi cek kelulusan siswa===");
        System.out.print("Masukan nama :");
        nama = input.next();
        System.out.print("Masukan nilai : ");
        nilai = input.nextInt();

        if(nilai >100){
            System.out.println("Maaf input anda salah!. Silahkan coba lagi.");
        }
        else if(nilai >=80){
            grade = 'A';
            System.out.println("Selamat anda lulus " + nilai + " " + "dengan grade " + grade);
        } else if(nilai <=79 ){
            grade = 'B';
            System.out.println("Selamat anda lulus " + nilai + " " + "dengan grade " + grade);
        }

    }
}
