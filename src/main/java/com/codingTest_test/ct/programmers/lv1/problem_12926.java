package com.codingTest_test.ct.programmers.lv1;

public class problem_12926 {
    public static String solution(String s, int n) {
        StringBuilder sb = new StringBuilder();
        String answer = "";
        char[] c = s.toCharArray();
        for (int i=0; i<s.length(); i++) {
            if (c[i] >= 'a' && c[i] <= 'z') {
                c[i] += n;
                if (c[i] > 'z') {
                    c[i] -= 26;
                }
            } else if (c[i] >= 'A' && c[i] <= 'Z') {
                c[i] += n;
                if (c[i] > 'Z') {
                    c[i] -= 26;
                }
            }
            sb.append(c[i]);
        }
        return sb.toString();
    }
}
