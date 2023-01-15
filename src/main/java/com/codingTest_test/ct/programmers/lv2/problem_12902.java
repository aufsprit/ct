package com.codingTest_test.ct.programmers.lv2;

public class problem_12902 {
    public int solution(int n) {
        int answer = 0;
        int mod = 1000000007;
        int[] dx = new int[n+1];

        dx[1] = 2;
        dx[2] = 3;
        for (int i = 3; i <= n; i++) {
            if (i % 2 == 0) {
                //짝수일 경우 n = n-1 + n-2
                dx[i] = dx[i-1]%mod + dx[i-2]%mod;
            } else {
                //홀수일 경우 n = (n-1)*2 + n-2
                dx[i] = dx[i-1]*2%mod + dx[i-2]%mod;
            }
            dx[i] = dx[i]%mod;
        }
        answer = dx[n];
        /*
         * n = 1의 경우 타일 2개
         * n = 2의 경우 타일 3개
         * n = 3의 경우 타일 8개
         * n = 4의 경우 타일 11개
         */
        return answer;
    }

    public static void main(String[] args) {
        problem_12902 t = new problem_12902();
        int n = 4;
        System.out.println(t.solution(n));
    } //result = 11
}
