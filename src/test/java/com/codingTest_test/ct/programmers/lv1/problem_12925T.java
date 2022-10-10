package com.codingTest_test.ct.programmers.lv1;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class problem_12925T {
    @Test
    void Solution() {
        problem_12925 t = new problem_12925();
        String n = "1234";
        long sol = problem_12925.solution(n);
        Assertions.assertThat(sol).isEqualTo(1234);
    }
}