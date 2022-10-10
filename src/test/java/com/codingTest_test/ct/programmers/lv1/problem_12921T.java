package com.codingTest_test.ct.programmers.lv1;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class problem_12921T {
    @Test
    void Solution() {
        problem_12921 t = new problem_12921();
        int n = 10;
        int sol = problem_12921.solution(n);
        Assertions.assertThat(sol).isEqualTo(4);
    }
}