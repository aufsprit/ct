package com.codingTest_test.ct.programmers.lv1;

public class problem_12934 {
    public static long solution(long n) {
        long l = (long) Math.sqrt(n);
        double d = Math.sqrt(n);
        if (d % l != 0) {
            return -1;
        }
        l = (long) Math.pow(l+1, 2);
        return l;
    }
}
