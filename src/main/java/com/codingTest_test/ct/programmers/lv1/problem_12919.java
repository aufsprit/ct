package com.codingTest_test.ct.programmers.lv1;

public class problem_12919 {
    public static String solution(String[] seoul) {
        StringBuilder answer = new StringBuilder();
        int index = 0;
        for (int i=0; i<seoul.length; i++) {
            if (seoul[i].equals("Kim")) {
                index = i;
                break;
            }
        }
        answer.append("김서방은 ");
        answer.append(index);
        answer.append("에 있다");
        return answer.toString();
    }
}
