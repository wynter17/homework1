package org.example;

public class miniChallenge {
    public static void main(String[] args) {

//        System.out.println("0 is " + (isPrime(0) ? "" : "NOT ") + "a prime number");
//        System.out.println("1 is " + (isPrime(1) ? "" : "NOT ") + "a prime number");
//        System.out.println("2 is " + (isPrime(2) ? "" : "NOT ") + "a prime number");
//        System.out.println("3 is " + (isPrime(3) ? "" : "NOT ") + "a prime number");
//
//        System.out.println("8 is " + (isPrime(8) ? "" : "NOT ") + "a prime number");
//        System.out.println("17 is " + (isPrime(17) ? "" : "NOT ") + "a prime number");


//        System.out.println(primeCounter(7));

        int count = 0;

        for(int i = 10;i <= 50; i++) {
            if(isPrime(i)){
                System.out.println("number " + i + " is prime number");
                count ++;
                if(count == 3){
                    System.out.println("Found 3 - Exiting for loop");
                    break;
                }
            }
        }


    }

    public static boolean isPrime(int wholeNumber) {
        if (wholeNumber <= 2) {
            return (wholeNumber == 2);
        }

        for (int divisor = 2; divisor <= wholeNumber / 2; divisor++) {
            if (wholeNumber % divisor == 0) {
                return false;
            }
        }

//        int pCounter = 1;
//
//        if(pCounter <= 3){
//            for(pCounter = 1; pCounter <= 3; pCounter++){
//                System.out.println(isPrime(wholeNumber));
//                }
//            }
//        return pCounter;
        return true;
        }


//    public static int primeCounter(int prime) {
//
//
//            for (int pCounter = 1; pCounter <= 2; pCounter++) {
//                for(prime ; prime <= 1000;prime ++){
//
//                }
//            }
//        }
//
//        return pCounter;
    }
