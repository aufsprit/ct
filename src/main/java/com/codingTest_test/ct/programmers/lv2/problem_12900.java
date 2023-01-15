package com.codingTest_test.ct.programmers.lv2;

public class problem_12900 {
    public int solution(int n) {
        int answer = 0;

        int[] dx = new int[n+1];

        dx[1] = 1;
        dx[2] = 2;
        for (int i = 3; i <= n; i++) {
            dx[i] = (dx[i-1] + dx[i-2])%1000000007;
        }
        answer = dx[n];
        /*
         * n = 1의 경우 타일 1개
         * n = 2의 경우 타일 2개
         * n = 3의 경우 타일 3개
         * n = 4의 경우 타일 5개
         * n = 5일 경우 타일 8개 ...
         * n = x일 경우 타일의 개수 = n[n-1] + n[n-2]*/
        return answer;
    }

    public static void main(String[] args) {
        problem_12900 t = new problem_12900();
        int n = 4;
        System.out.println(t.solution(n));
    }
}
