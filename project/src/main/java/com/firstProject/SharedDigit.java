package com.firstProject;

public class SharedDigit {
    public static void main(String[] args) {
        System.out.println(hasSharedDigit(12,23));
    }

    public static boolean hasSharedDigit(int num1, int num2) {
        if (num1 >= 10 && num1 <= 99 && num2 >= 10 && num2 <= 99) {
            int remain1 = 0;
            int remain2 = 0;
            while (num1 / 10 != 0 && num2 / 10 != 0) {
                remain1 = num1 % 10;
                int dev1 = num1 / 10;
                num1 = dev1;
                remain2 = num2 % 10;
                int dev2 = num2 / 10;
                num2 = dev2;
                if (remain1 == remain2) {
                    return true;
                }
            }
            if (num1 == num2 || remain1 == num2 || remain2 == num1) {
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }
}
