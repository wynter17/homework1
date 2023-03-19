package org.example;

public class megabytes {

    public static void main(String[] args) {

        printMegaBytesAndKiloBytes(5000);

    }

    public static void printMegaBytesAndKiloBytes(int kiloBytes){

        if(kiloBytes < 0){
            System.out.println("Invalid Value");
        }else {
            System.out.println("some changes");
            int megaBytes = kiloBytes / 1024;
            int rest = kiloBytes % 1024;
            System.out.println(kiloBytes + "KB = " + megaBytes + "MB" + " and " + rest + "KB");
        }
    }
}
