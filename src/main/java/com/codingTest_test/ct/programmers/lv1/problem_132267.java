package com.codingTest_test.ct.programmers.lv1;

public class problem_132267 {
    public int solution(int a, int b, int n) {
        int answer = 0, store = 0, m = 0;

        while (n >= a) {
            m = (n / a) * b;
            answer += m;
            store = n % a;
            n = m + store;
        }

        return answer;
    }

    public static void main(String[] args) {
        problem_132267 t = new problem_132267();
        int a = 3;
        int b = 1;
        int n = 20;
        System.out.println(t.solution(a, b, n));
    }
}