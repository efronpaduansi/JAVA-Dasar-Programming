package com.efronius;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	//Program sederhana untuk mengecek hadiah belanja menggunakan percabangan
        int totalBelanja = 0;
        double totalBayar;
        double diskon;
        Scanner input = new Scanner(System.in);

        System.out.print("Masukan total belanja anda : ");
        totalBelanja = input.nextInt();


        //Seleksi kondisi
            if(totalBelanja >= 100000){

                diskon = (totalBelanja * 10)/100;
                totalBayar = (totalBelanja - diskon);

                System.out.println("Selamat anda mendapatkan diskon sebesar 10%");
                System.out.println("Total bayar anda : "+ totalBayar);
            } else {
                System.out.println("Maaf! Anda tidak mendapatkan diskon");
                System.out.println("Total bayar anda : "+ totalBelanja);
            }





    }
}
