package com.codingTest_test.ct.programmers.lv1;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class problem_12931T {
    @Test
    void Solution() {
        problem_12931 t = new problem_12931();
        int n = 987;
        int sol = problem_12931.solution(n);
        Assertions.assertThat(sol).isEqualTo(24);
    }
}