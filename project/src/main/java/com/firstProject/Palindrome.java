package com.firstProject;

public class Palindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome(121));
    }

    public static boolean isPalindrome(int number) {
        int palin = 0;
        int actual = number;
        while (number != 0) {
            int num = number % 10;//1
            number = number / 10;//0
            palin = palin * 10 + num; //11
        }
        return palin == actual;
    }
}
