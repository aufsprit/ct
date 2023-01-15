package com.codingTest_test.ct.programmers.lv2;

public class problem_12909 {
    boolean solution(String s) {
        if (s.length() % 2 != 0) return false; //괄호의 개수가 짝수가 아닌경우
        if (s.charAt(0) == ')') { //맨 처음이 닫히는 경우
            return false;
        }
        if (s.charAt(s.length()-1) == '(') { //맨 끝이 열리는 경우
            return false;
        }

        int n = 0; //열리는 경우 n++, 닫히는 경우 n--
        for (int i=0; i<s.length(); i++) {
            if (s.charAt(i) == '(') n++;
            else n--;
            if (n == -1) return false; //닫히는 경우가 더 많이 생기게 되는 경우
        }

        if (n != 0) return false; //열리는 경우가 더 많이 생기는 경우
        return true;
    }
}