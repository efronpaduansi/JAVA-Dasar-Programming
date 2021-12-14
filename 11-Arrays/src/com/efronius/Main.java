package com.efronius;

public class Main {

    public static void main(String[] args) {
	// Contoh program array
        String[] buah = {"Jeruk", "Pisang", "Melon", "Mangga", "Semangka"};
        int[] myNum = {1, 2, 3, 4, 5};
        //akses elemen array
        System.out.println(buah[3]);
        System.out.println(myNum[2]);

        //Change elemen array
        String[] cars = {"Volvo", "Honda", "BMW"};
        cars[0] = "Ford";
        System.out.println(cars[0]);

        //array length
        System.out.println("Length of array "+cars.length);
    }
}
