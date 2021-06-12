package com.firstProject;

public class LargestPrime {
    public static void main(String[] args) {
        System.out.println(getLargestPrime(15));
    }
    public static int getLargestPrime(int number) {
        int prime = 0;
        if (number <= 1) {
            return -1;
        } else {
            for (int i = 2; i <= number; i++) {
                int num = 0;
                for (int j = 1; j <= i; j++) {
                    if (i % j == 0) {
                        num = num + 1;
                    }
                }
                if (num == 2 && number % i == 0) {
                    prime = i;
                }
            }
            return prime;
        }
    }
}
