package com.codingTest_test.ct.programmers.lv1;

import java.util.Arrays;
import java.util.Collections;

public class problem_12933 {
    public static long solution(long n) {
        long answer = 0;
        String s = String.valueOf(n);
        String[] st = s.split("");
        Arrays.sort(st, Collections.reverseOrder());
        StringBuilder sb = new StringBuilder();
        for (int i=0; i<st.length; i++)
            sb.append(st[i]);
        answer = Long.parseLong(String.valueOf(sb));
        return answer;
    }
}
