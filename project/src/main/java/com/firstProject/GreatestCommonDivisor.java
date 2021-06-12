package com.firstProject;

public class GreatestCommonDivisor {
    public static void main(String[] args) {
        System.out.println(getGreatestCommonDivisor(12,30));
    }

    public static int getGreatestCommonDivisor(int first, int second) {
        if (first < 10 || second < 10) {
            return -1;
        } else {
            if (first > second) {
                int num = second;
                second = first;
                first = num;
            }
            while (second % first != 0) {
                int remain = second % first;
                second = first;
                first = remain;
            }
            return first;
        }
    }
}
