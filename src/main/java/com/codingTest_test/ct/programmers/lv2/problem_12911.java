package com.codingTest_test.ct.programmers.lv2;

public class problem_12911 {
    public int solution(int n) {
        int answer = 0;

        String bn = Integer.toBinaryString(n);
        int bn1n = 0; //bn 의 1의 개수
        for (int i = 0; i < bn.length(); i++) {
            if (bn.charAt(i) == '1') {
                bn1n++;
            }
        }

        int bn2n = 0;
        while (bn2n != bn1n) {
            bn2n = 0; //bn2 의 1의 개수
            n++;
            String bn2 = Integer.toBinaryString(n);
            for (int i = 0; i < bn2.length(); i++) {
                if (bn2.charAt(i) == '1') {
                    bn2n++;
                }
            }
        }

        answer = n;
        return answer;
    }

    public static void main(String[] args) {
        problem_12911 t = new problem_12911();
        int n = 78;
        System.out.println(t.solution(n));
    }
}
