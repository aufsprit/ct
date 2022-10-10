package com.codingTest_test.ct.programmers.lv1;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class problem_12918T {
    @Test
    void Solution() {
        problem_12918 t = new problem_12918();
        String s = "a234";
        boolean sol = problem_12918.solution(s);
        Assertions.assertThat(sol).isEqualTo(false);
        String s2 = "1234";
        sol = problem_12918.solution(s2);
        Assertions.assertThat(sol).isEqualTo(true);
    }
}