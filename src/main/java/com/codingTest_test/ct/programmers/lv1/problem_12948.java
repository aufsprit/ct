package com.codingTest_test.ct.programmers.lv1;

public class problem_12948 {
    public static String solution(String phone_number) {
        String answer = "";
        char[] c = phone_number.toCharArray();
        for (int i=0; i<c.length; i++) {
            if (i < c.length-4) answer += "*";
            else answer += c[i];
        }
        return answer;
    }
}
