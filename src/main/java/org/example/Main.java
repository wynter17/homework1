package org.example;

public class Main {
    public static void main(String[] args) {
//        System.out.println("Hello world!");
        int a = 10;
//        System.out.println(a);
        int b = suma(15, 20);
//        System.out.println(b);
//        System.out.println(suma(2, 3));
        System.out.println(isProdEven(5,7));
    }

    public static int suma(int a, int b) {
        return a + b;
    }

    public static int prod(int a, int b) {
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        return a * b;
    }

    public static boolean isProdEven(int a, int b) {
        System.out.println("prod = " + prod(a, b));
        return prod(a, b) % 2 == 0;
    }
}