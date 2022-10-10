package com.codingTest_test.ct.programmers.lv1;

public class problem_12922 {
    public static String solution(int n) {
        String answer = "";
        StringBuilder sb = new StringBuilder();

        for (int i=1; i<=n; i++) {
            if (i % 2 == 1) {
                sb.append("수");
            } else {
                sb.append("박");
            }
        }
        answer = sb.toString();
        return answer;
    }
}
