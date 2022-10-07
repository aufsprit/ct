package com.codingTest_test.ct.programmers.lv1;

public class problem_12932 {
    public static int[] solution(long n) {
        String s = String.valueOf(n);
        String[] st = s.split("");
        int[] answer = new int[st.length];
        int m = 0;
        for (int i=st.length-1; i>=0; i--) {
            answer[m] = Integer.parseInt(st[i]);
            m++;
        }
        return answer;
    }
}
