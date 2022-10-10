package com.codingTest_test.ct.programmers.lv1;

public class problem_12931 {
    public static int solution(int n) {
        int answer = 0;
        String number = Integer.toString(n);

        for (int i=0; i<number.length(); i++) {
            answer += Integer.parseInt(String.valueOf(number.charAt(i)));
        }
        return answer;
    }
}
