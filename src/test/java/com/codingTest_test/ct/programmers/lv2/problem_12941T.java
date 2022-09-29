package com.codingTest_test.ct.programmers.lv2;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class problem_12941T {
    @Test
    void Solution() {
        problem_12941 solution = new problem_12941();
        int[] A = {1,4,2};
        int[] B = {5,4,4};
        int sol = solution.solution(A,B);
        Assertions.assertThat(sol).isEqualTo(29);
    }
}