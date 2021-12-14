package com.efronius;

public class Main {
    static int plusMethodInt(int a, int b){
        return a + b;
    }
    static double plusMethodDouble(double x, double y){
        return x + y;
    }

    public static void main(String[] args) {
	// write your code here
        int myNum1 = plusMethodInt(8, 5);
        double myNum2 = plusMethodDouble(4.5, 5.6);

        System.out.println(myNum1);
        System.out.println(myNum2);
    }
}
