package com.codingTest_test.ct.programmers.lv2;

public class problem_12945 {
    public int solution(int n) {
        int ans = 0;
        int[] a = new int[n+1];
        a[0] = 0;
        a[1] = 1;
        if (n>=2) {
            for (int i=2; i<=n; i++) {
                a[i] = a[i-2]%1234567 + a[i-1]%1234567;
            }
        }

        ans = a[n]%1234567;

        return ans;
    }
}
