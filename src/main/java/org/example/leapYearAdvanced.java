package org.example;

public class leapYearAdvanced {

    public static void main(String[] args) {

        System.out.println(getDaysInMonth(3,2021));

    }

    public static boolean isLeapYear(int year){

        if (year >= 1 && year <= 9999 && year % 4 == 0){
            return true;
        }else{
            return false;
        }

    }


    public static String getDaysInMonth(int month,int year){

       return switch(month){
           case 1 -> { yield "January has 31 days";}
           case 2 -> {if(isLeapYear(year)) {
               yield "February has 29 days";
                    }else{
               yield "February has 28 days";
                    }
           }
           case 3 -> { yield "March has 31 days";}
           case 4 -> { yield "April has 30 days";}
           case 5 -> { yield "May has 30 days";}
           case 6 -> { yield  "June has 30 days";}
           case 7 -> { yield  "July has 31 days";}
           case 8 -> { yield "August has 31 days";}
           case 9 -> { yield  "September has 30 days";}
           case 10 -> { yield "October has 31 days";}
           case 11 -> { yield "November has 30 days";}
           case 12 -> { yield "December has 31 days";}
           default -> "Not valid entry!";
       };
    }
}

