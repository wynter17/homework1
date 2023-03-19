package org.example;

public class printNumber {

    public static void main(String[] args) {

        System.out.println("The number is "+ printNumberInWord(4));

    }

    public static String printNumberInWord (int number){

        return switch(number){
            case 0 -> { yield "ZERO";}
            case 1 -> { yield "ONE";}
            case 2 -> { yield "TWO";}
            case 3 -> { yield "THREE";}
            case 4 -> { yield "FOUR";}
            case 5 -> { yield "FIVE";}
            case 6 -> { yield "SIX";}
            case 7 -> { yield "SEVEN";}
            case 8 -> { yield "EIGHT";}
            case 9 -> { yield "NINE";}
            default -> { yield "OTHER";}

        };

    }
}
