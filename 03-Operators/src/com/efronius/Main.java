package com.efronius;

public class Main {

    public static void main(String[] args) {
	// Operatos pada java : +, -, *, /, %, ++, --

        //Addition
        int nilai1 = 100;
        int nilai2 = 200;
        int totalNilai = (nilai1 + nilai2);
        System.out.println("Hasil Penjumlahan : " + totalNilai);

        //Modulus /
        int a = 11;
        int b = 3;
        int mod = (a % b);
        System.out.println("Hasilnya : "+mod);

        //Increment
        int x = 10;
        ++x;
        System.out.println(x);

        //Decrement
        int y = 20;
        --y;
        System.out.println(y);

        //Operator Assignment (Penugasan)
        int n = 5;
        n +=5;
        System.out.println(n);

    }
}
