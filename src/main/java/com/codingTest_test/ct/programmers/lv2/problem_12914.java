package com.codingTest_test.ct.programmers.lv2;

public class problem_12914 {
    public long solution(int n) {
        long answer = 0;

        /*
        * n = 1 일때 answer = 1
        * n = 2 일때 answer = 2
        * n = 3 일때 answer = 3
        * n = 4 일때 answer = 5
        * n = x 일때 answer = (x-1) + (x-2)*/

        int[] x = new int[2002];
        int div = 1234567;
        x[1] = 1;
        x[2] = 2;

        for (int i = 3; i <= n; i++) {
            x[i] = x[i-1]%div + x[i-2]%div;
        }
        answer = x[n]%div;

        return answer;
    }

    public static void main(String[] args) {
        problem_12914 t = new problem_12914();
        int n = 5;
        System.out.println(t.solution(n));
    }
}
