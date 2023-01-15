package com.codingTest_test.ct.programmers.lv2;

public class problem_12924 {
    static int answer = 0;
    public int solution(int n) {
        int sum = 0;
        for (int i=1; i<=n; i++) {
            sum += i;
        }
        func(1, n, n, sum);
        return answer;
    }

    public void func(int start, int end, int target, int sum) {
        if (start == target) {
            answer++;
            return;
        }
        if (sum == target) answer++;
        if (sum > target) func(start, end-1, target, sum-end);
        else func(start+1, end+1, target, sum-start+end+1);
    }
}
