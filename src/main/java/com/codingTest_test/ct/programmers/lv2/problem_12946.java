package com.codingTest_test.ct.programmers.lv2;

import java.util.Arrays;

public class problem_12946 {
    static int idx = 0;
    public static int[][] solution(int n) {
        /*
         n == 1일 때, 1번
         n == 2일 때, 3번
         n == 3일 때, 7번..
         n == x일 때, 2^x - 1번
        */
        int[][] answer = new int[(int)(Math.pow(2,n)-1)][2];
        func(n, 1, 2, 3, answer);
        return answer;
    }

    public static void func(int n, int start, int mid, int end, int[][] answer) {
        if (n == 0) return;
        func(n-1, start, end, mid, answer);
        answer[idx][0] = start;
        answer[idx++][1] = end;
        func(n-1, mid, start, end, answer);
    }

    public static void main(String[] args) {
        problem_12946 t = new problem_12946();
        int n = 2;
        System.out.println(Arrays.deepToString(solution(n)));
        // result = [[1,2], [1,3], [2,3]]
    }
}
