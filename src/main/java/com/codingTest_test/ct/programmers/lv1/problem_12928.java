package com.codingTest_test.ct.programmers.lv1;

import java.util.ArrayList;

public class problem_12928 {
    public int solution(int n) {
        int answer = 0;
        ArrayList<Integer> al = new ArrayList<>();
        for (int i=1; i<=n/2; i++) {
            if (n % i == 0) {
                al.add(i);
            }
        }
        al.add(n);
        for (Integer i : al) {
            answer += i;
        }
        return answer;
    }
}
