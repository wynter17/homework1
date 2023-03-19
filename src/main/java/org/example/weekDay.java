package org.example;

public class weekDay {
    public static void main(String[] args) {

        printDayOfWeek(2);

    }

    public static void printDayOfWeek(int day){

      String dayOfTheWeek = switch (day){
            case 0 -> { yield "Sunday";}
            case 1 -> { yield "Monday";}
            case 2 -> { yield "Tuesday";}
            case 3 -> { yield "Wednesday";}
            case 4 -> { yield "Thursday";}
            case 5 -> { yield "Friday";}
            case 6 -> { yield "Saturday";}
            default -> { yield "Invalid number";}
            };
        System.out.println(day + " stands for " + dayOfTheWeek);
        }
    }

