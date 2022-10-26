package com.codingTest_test.ct.programmers.lv1;

import java.util.Arrays;

public class problem_12915 {
    public String[] solution(String[] strings, int n) {
        String[] st = new String[strings.length];
        String[] answer = new String[strings.length];
        for (int i=0; i<st.length; i++) {
            st[i] = strings[i].substring(n, n+1) + strings[i];
        }
        Arrays.sort(st);
        for (int i=0; i<st.length; i++) {
            for (int j=0; j<strings.length; j++) {
                if (st[i].substring(1).equals(strings[j])) {
                    answer[i] = strings[j];
                    break;
                }
            }
        }
        return answer;
    }
}
