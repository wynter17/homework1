package org.example;

public class decimalcomp {

    public static void main(String[] args) {

        System.out.println(areEqualByThreeDecimalPlaces(3.1755,3.1756));

//        double param3 = 3.723*1000;
//        System.out.println((int)param3);
    }

    public static boolean areEqualByThreeDecimalPlaces(double param1,double param2){
        int number1 = (int)(param1 *10);
        int number2 = (int)(param2 *10);
        int number3 = (int)(param1 *100);
        int number4 = (int)(param2 *100);
        int number5 = (int)(param1 *1000);
        int number6 = (int)(param2 *1000);


        return digitsAreEqual((int) param1, (int) param2, number1, number2, number3, number4, number5, number6);


//        if(((int)param1 == (int)param2) && ((int)(param1 * 10) == (int)(param2 * 10)) && ((int)(param1 * 100) == (int)(param2 * 100)) && ((int)(param1 * 1000) == (int)(param2 * 1000))){
//            return true;
//        }else
//            return false;

    }

    private static boolean digitsAreEqual(int param1, int param2, int number1, int number2, int number3, int number4, int number5, int number6) {
        return (param1 == param2) && (number1 == number2) && (number3 == number4) && (number5 == number6);
    }
}
