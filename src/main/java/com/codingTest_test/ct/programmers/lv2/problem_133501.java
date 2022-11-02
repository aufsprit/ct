package com.codingTest_test.ct.programmers.lv2;

public class problem_133501 {
    public int solution(int distance, int[][] scope, int[][] times) {
        int answer = 0;

        int[] totalScopeRange = new int[distance];
        for (int i = 0; i < scope.length; i++) {
            if (scope[i][0] > scope[i][1]) {
                int tmp = scope[i][1];
                scope[i][1] = scope[i][0];
                scope[i][0] = tmp;
            }
            for (int j = scope[i][0]-1; j <= scope[i][1]-1; j++) {
                totalScopeRange[j] = scope[i][0];
            }
        }
        for (int i = 0; i < distance; i++) {
            answer++;
            if (totalScopeRange[i] != 0) {
                for (int j = 0; j < scope.length; j++) {
                    if (scope[j][0] == totalScopeRange[i] || scope[j][1] == totalScopeRange[i]) {
                        if (i % (times[j][0] + times[j][1]) < times[j][0]) {
                            return answer;
                        }
                    }
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        problem_133501 t = new problem_133501();
        int distance = 12;
        int[][] scope = {{7,8}, {4,6}, {11,10}};
        int[][] times = {{2,2}, {2,4}, {3,3}};
        System.out.println(t.solution(distance, scope, times));
        distance = 10;
        scope = new int[][]{{3,4}, {5,8}};
        times = new int[][]{{2,5}, {4,3}};
        System.out.println(t.solution(distance, scope, times));
    }
}
