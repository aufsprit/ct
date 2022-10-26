package com.codingTest_test.ct.programmers.lv1;

public class problem_131705 {
    public int solution(int[] number) {
        int answer = 0;
        for (int i=0; i<number.length; i++) {
            for (int j=i+1; j<number.length; j++) {
                for (int k=j+1; k<number.length; k++) {
                    if (number[i] + number[j] + number[k] == 0) answer++;
                }
            }
        }
        return answer;
    }
    public static void main(String[] args) {
        problem_131705 t = new problem_131705();
        int[] number = {-3, -2, -1, 0, 1, 2, 3};
        System.out.println(t.solution(number));
    }
}
