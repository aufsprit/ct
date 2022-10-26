package com.codingTest_test.ct.programmers.lv1;

public class problem_12916 {
    boolean solution(String s) {
        boolean answer = true;
        int p = 0;
        int y = 0;
        for (int i=0; i<s.length(); i++) {
            if (s.charAt(i) == 'p' || s.charAt(i) == 'P') p++;
            else if (s.charAt(i) == 'y' || s.charAt(i) == 'Y') y++;
            else continue;
        }
        answer = p == y;
        return answer;
    }
}
//"pPoooyY";
