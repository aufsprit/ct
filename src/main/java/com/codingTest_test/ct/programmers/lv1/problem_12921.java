package com.codingTest_test.ct.programmers.lv1;

public class problem_12921 {
    public static int solution(int n) {
        int answer = 0;

        for (int i=1; i<=n; i++) {
            answer += binaryCheck(i) ? 1 : 0;
        }

        return answer;
    }

    public static boolean binaryCheck(int n) {
        if (n == 1) return false;

        for (int i=2; i<=Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
