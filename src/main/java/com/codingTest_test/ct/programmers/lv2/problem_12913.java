package com.codingTest_test.ct.programmers.lv2;

import java.util.Arrays;

public class problem_12913 {
    //4개의 열의 개수, 연속으로 밟을 수 없음..
    public int solution(int[][] land) {
        for(int i=1; i<land.length; i++){
            land[i][0] += Math.max(Math.max(land[i-1][1], land[i-1][2]), land[i-1][3]);
            land[i][1] += Math.max(Math.max(land[i-1][0], land[i-1][2]), land[i-1][3]);
            land[i][2] += Math.max(Math.max(land[i-1][1], land[i-1][0]), land[i-1][3]);
            land[i][3] += Math.max(Math.max(land[i-1][1], land[i-1][2]), land[i-1][0]);
        }
        int[] answer = land[land.length-1];
        Arrays.sort(answer);
        return answer[answer.length-1];
    }

    public static void main(String[] args) {
        problem_12913 t = new problem_12913();
        int[][] land = {{1,2,3,5}, {5,6,7,8}, {4,3,2,1}};
        System.out.println(t.solution(land));
    }
}
