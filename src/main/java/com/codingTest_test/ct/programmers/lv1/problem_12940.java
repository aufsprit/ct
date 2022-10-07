package com.codingTest_test.ct.programmers.lv1;

public class problem_12940 {
    public static int[] solution(int n, int m) {
        int[] answer = new int[2];
        int div = func(n, m);
        int mul = n*m/div;

        answer[0] = div;
        answer[1] = mul;
        return answer;
    }

    private static int func(int n, int m) {
        if (m == 0) return n;
        else return func(m, n%m);
    }
}
