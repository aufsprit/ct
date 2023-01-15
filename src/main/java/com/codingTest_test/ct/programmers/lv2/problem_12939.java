package com.codingTest_test.ct.programmers.lv2;

public class problem_12939 {
    public String solution(String s) {
        String answer = "";
        String[] numbers = s.split(" ");

        int min = Integer.parseInt(numbers[0]);
        int max = Integer.parseInt(numbers[0]);

        for (String i : numbers) {
            min = Math.min(min, Integer.parseInt(i));
            max = Math.max(max, Integer.parseInt(i));
        }

        answer += min + " " + max;

        return answer;
    }
}
