package com.codingTest_test.ct.programmers.lv1;

public class problem_12943 {
    public static int solution(int num) {
        int answer = 0;
        while (num != 1) {
            if (answer == 450) return -1;
            answer++;
            if (num % 2 == 0)
                num = num / 2;
            else
                num = num*3+1;
        }
        return answer;
    }
}
