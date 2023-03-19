package org.example;

public class area {
    public static void main(String[] args) {

        System.out.println(areaC(-1.0));
        System.out.println(areaC(-1.0,4.0));

    }

    public static double areaC (double radius){

        if(radius < 0){
            return -1.0;
        }else {
            return radius * (radius * Math.PI);
        }
    }

    public static double areaC (double x , double y){

        if (x < 0 || y < 0){
            return -1.0;
        }else {
            return x * y;
        }
    }

}
