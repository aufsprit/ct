package com.codingTest_test.ct.programmers.lv2;

public class problem_12899 {
    public String solution(int n) {
        String[] num = {"4", "1", "2"};
        String answer = "";

        while (n > 0) {
            int r = n % 3;
            n = n / 3;

            if (r == 0) {
                n--;
            }

            answer = num[r] + answer;
        }
        /*
        * 11 / 3
        * n = 3, r = 2
        * answer = 2
        * 3 / 3
        * n = 1, r = 0
        * r == 0 이므로, n = 0, r = 0
        * num[0] = 4
        * answer = 4 + 2 = 42*/
        return answer;
    }
    public static void main(String[] args) {
        problem_12899 t = new problem_12899();
        int n = 11;
        System.out.println(t.solution(n));
    }
}
