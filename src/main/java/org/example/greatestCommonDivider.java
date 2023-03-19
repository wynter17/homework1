package org.example;

public class greatestCommonDivider {

    public static void main(String[] args) {

        System.out.println(getGreatestCommonDivisor(12,30));

    }

    public static int getGreatestCommonDivisor(int first,int second){
        int firstDivisor = 1;

        if(first <10 || second < 10){
            return -1;
        }
        {
            int greatestDivider = 0;
            for (int i = firstDivisor; i <= first && i <= second; i++) {
                if(first % i == 0 && second % i == 0){
                    greatestDivider = i;
                }

            }
            return greatestDivider;
        }
    }
}
