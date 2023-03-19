package org.example;

public class test {

    public static void main(String[] args) {

//        System.out.println(toMilesPerHours(80));
        printConversion(26.7);

    }

    public static long toMilesPerHours(double kilometerPerHour){

        if(kilometerPerHour < 0){
            return -1;
        }else{
            kilometerPerHour = Math.round(kilometerPerHour * 0.621371);
            return (long)kilometerPerHour;
        }
    }

    public static void printConversion(double kilometersPerHour){
        if(kilometersPerHour > 0) {
            System.out.println(kilometersPerHour + "km/h = " + toMilesPerHours(kilometersPerHour) + "mi/h");
        }else {
            System.out.println("Invalid Value");
        }

        }
    }

