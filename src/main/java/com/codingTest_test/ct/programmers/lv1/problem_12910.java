package com.codingTest_test.ct.programmers.lv1;

import java.util.ArrayList;
import java.util.Arrays;

public class problem_12910 {
    public static int[] solution(int[] arr, int divisor) {
        int[] answer;
        ArrayList<Integer> al = new ArrayList<>();

        for (int i=0; i<arr.length; i++) {
            if (arr[i] % divisor == 0) al.add(arr[i]);
        }
        if (al.size() == 0) {
            answer = new int[1];
            answer[0] = -1;
        } else {
            answer = new int[al.size()];
            for (int i=0; i<answer.length; i++) {
                answer[i] = al.get(i);
            }
        }
        Arrays.sort(answer);
        return answer;
    }
}
