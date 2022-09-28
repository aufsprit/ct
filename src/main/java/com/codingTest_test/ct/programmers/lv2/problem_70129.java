package com.codingTest_test.ct.programmers.lv2;

public class problem_70129 {
    static int m = 0;
    static int n = 0;
    public int[] solution(String s) {
        int[] answer = new int[2];
        func1(s, s.length());
        answer[0] = n;
        answer[1] = m;
        return answer;
    }
    static void func1(String s, int st_length) {
        if (st_length == 1) return;
        StringBuilder sb = new StringBuilder();
        String[] st = s.split("");
        for (int i=0; i<st_length; i++) {
            if (!st[i].equals("0")) {
                sb.append(1);
            } else {
                m++;
            }
        }
        n++;
        String ns = Integer.toBinaryString(sb.length());
        func1(ns, ns.length());
    }
}
