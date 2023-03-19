package org.example;

public class sum3And5 {

    public static void main(String[] args) {

        int sum = 0;
        int counter = 0;

        for (int i = 500; i <= 1000; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                sum = sum + i;
                counter++;
            }else if(counter == 5){
                System.out.println(sum);
                break;
            }

        }
    }
}



