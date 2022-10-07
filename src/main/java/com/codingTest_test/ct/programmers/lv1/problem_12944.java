package com.codingTest_test.ct.programmers.lv1;

public class problem_12944 {
    public static double solution(int[] arr) {
        double answer = 0;
        double sum = 0;
        for (int i=0; i<arr.length; i++) {
            sum += arr[i];
        }
        answer = sum / arr.length;
        return answer;
    }
}
