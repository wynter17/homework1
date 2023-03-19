package org.example;

import javax.sound.midi.Soundbank;

public class nato {

    public static void main(String[] args) {

       natoLetter("B");

    }

    public static void natoLetter (String character){

        switch (character){
            case "A":
                System.out.println("ABLE");
                break;
            case "B":
                System.out.println("BAKER");
                break;
            case "C":
                System.out.println("CHARLIE");
                break;
            case "D":
                System.out.println("DOG");
                break;
            case "E":
                System.out.println("EASY");
                break;
            default:
                System.out.println("Letter not found");
                break;

        }
    }
}
