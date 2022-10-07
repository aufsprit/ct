package com.codingTest_test.ct.programmers.lv1;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class problem_12935T {
    @Test
    void Solution() {
        problem_12935 problem = new problem_12935();
        int[] arr = {4,3,2,1};
        int[] sol = problem_12935.solution(arr);
        Assertions.assertThat(sol).isEqualTo(new int[]{4,3,2});
    }
}