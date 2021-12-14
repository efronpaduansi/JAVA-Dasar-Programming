package com.efronius;

public class Main {

    public static void main(String[] args) {
	// if else digunakan untuk menyeleksi sebuah kondisi
        int x = 20;
        int y = 10;
        if(x > y){
            System.out.println("Nilai x lebih besar dari y");

        } else{
            System.out.println("Nilai x tidak lebih besar dari y.");
        }

        // Time selection
        int time = 20;
        if(time < 18){
            System.out.println("Good day.");
        } else {
            System.out.println("Good evening.");
        }
    }
}
