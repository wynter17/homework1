package org.example;

public class print {

    public static void main(String[] args) {
        printEqual(1,2,3);

    }

    public static void printEqual (int x,int y,int z){
        if(x < 0 || y < 0 || z < 0){
            System.out.println("Invalid Value");
        } else if (x == y && x == z){
            System.out.println("All numbers are equal");
        } else if (x != y && x != z) {
            System.out.println("All numbers are different");
        } else {
            System.out.println("Neither are all equal or different");
        }
    }
}
