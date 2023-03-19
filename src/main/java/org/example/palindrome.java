package org.example;

public class palindrome {

    public static void main(String[] args) {
        System.out.println(isPalindrome(15));

    }

    public static boolean isPalindrome(int number){
        int reverse = 0;

        if(reverse == number) {
            int lastDigit = number % 10;
            reverse = reverse * 10;

        }
        return true;
    }
}
