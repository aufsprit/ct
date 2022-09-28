package com.codingTest_test.ct.programmers.lv1;

public class problem_12947 {
    public static boolean solution(int x) {
        boolean answer = false;
        int sum = 0;
        char[] c = String.valueOf(x).toCharArray();
        for (char value : c) {
            sum += Integer.parseInt(String.valueOf(value));
        }
        if (x % sum == 0) answer = true;
        return answer;
    }
}
