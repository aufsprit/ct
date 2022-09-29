package com.codingTest_test.ct.programmers.lv2;

import java.util.Arrays;

public class problem_12941 {
    public int solution(int []A, int []B)
    {
        int sum = 0;
        Arrays.sort(A);
        Arrays.sort(B);

        for (int i=0; i<A.length; i++) {
            int a = A[i];
            int b = B[A.length-i-1];
            sum += a*b;
        }

        return sum;
    }
}
