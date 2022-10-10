package com.codingTest_test.ct.programmers.lv1;

public class problem_12930 {
    public static String solution(String s) {
        StringBuilder sb = new StringBuilder();
        String[] st = s.split(" ");

        for (int i=0; i<st.length; i++) {
            for (int j=0; j<st[i].length(); j++) {
                if (j % 2 == 0) sb.append(st[i].substring(j, j+1).toUpperCase());
                else sb.append(st[i].substring(j, j+1).toLowerCase());
            }
            if (i != st.length-1) sb.append(" ");
        }
        StringBuilder answer = new StringBuilder(sb.toString());
        if (s.length() != answer.length()) {
            for (int i=0; i<=s.length() - answer.length(); i++) {
                answer.append(" ");
            }
        }
        return answer.toString();
    }
}
