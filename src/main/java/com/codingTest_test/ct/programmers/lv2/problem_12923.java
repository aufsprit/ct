package com.codingTest_test.ct.programmers.lv2;

import java.util.Arrays;

public class problem_12923 {
    public int[] solution(long begin, long end) {
        int b = (int) begin;
        int e = (int) end;
        int[] answer = new int[e-b+1];

        for (int i = b; i <= e; i++) {
            answer[i-b] = isPrimeNumber(i);
        }

        return answer;
    }

    int maxBlock = 10000000;
    public int isPrimeNumber(int n) {
        if (n == 1) return 0;

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n%i == 0 && n/i <= maxBlock) {
                return n/i;
            }
        }
        return 1;
    }


    public static void main(String[] args) {
        problem_12923 t = new problem_12923();
        long begin = 1;
        long end = 10;
        System.out.println(Arrays.toString(t.solution(begin, end)));
    }
}
