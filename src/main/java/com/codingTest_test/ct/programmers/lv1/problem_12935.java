package com.codingTest_test.ct.programmers.lv1;

public class problem_12935 {
    public static int[] solution(int[] arr) {
        int[] answer;
        if (arr.length == 1) {
            answer = new int[1];
            answer[0] = -1;
            return answer;
        } else {
            answer = new int[arr.length - 1];
        }
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            min = Math.min(min, arr[i]);
        }
        int n = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == min) continue;
            else {
                answer[n] = arr[i];
                n++;
            }
        }
        return answer;
    }
}
