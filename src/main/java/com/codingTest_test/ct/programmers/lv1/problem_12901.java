package com.codingTest_test.ct.programmers.lv1;

public class problem_12901 {
    public String solution(int a, int b) {
        String answer = "";
        int sum = 0;
        int n = 0;
        int[] month = {0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        String[] day = {"THU", "FRI", "SAT", "SUN", "MON", "TUE", "WED"};
        for (int i=1; i<a; i++) {
            sum += month[i];
        }
        sum += b;

        n = sum % 7;

        answer = day[n];

        return day[n];
    }
}
