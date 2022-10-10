package com.codingTest_test.ct.programmers.lv1;

public class problem_12918 {
    public static boolean solution(String s) {
        boolean answer = true;
        for (int i=0; i<s.length(); i++) {
            if (!Character.isDigit(s.charAt(i))) {
                answer = false;
            }
        }
        if (s.length() != 4 && s.length() != 6) {
            answer = false;
        }
        return answer;
    }
}
