package com.efronius;
import java.util.Scanner;

public class MethodApp {
    static void greetingMethod(){
        System.out.println("Selamat anda mendapatkan diskon sebesar 20%");
    }
    static void exitMethod(){
        System.out.println("Maaf! anda tidak mendapatkan diskon");
    }


    public static void main(String[] args) {

        String name, kartu;
        double totalBelanja, totalBayar, diskon;
        Scanner scan = new Scanner(System.in);

        System.out.print("Masukan nama : ");
        name = scan.nextLine();
        System.out.print("Apakah anda mempunyai kartu member ? ");
        kartu = scan.nextLine();
        System.out.print("Masukan total belanja anda : ");
        totalBelanja = scan.nextFloat();

        totalBayar = (totalBelanja * 0.2);

        if(kartu.equalsIgnoreCase("ya")){
            if(totalBelanja > 100000){
                System.out.println("Total bayar anda adalah sebesar : " + totalBayar);
                greetingMethod();
            } else {
               diskon = 0;
            }

        } else {
            exitMethod();
        }

    }

}
