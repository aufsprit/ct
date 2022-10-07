package com.codingTest_test.ct.programmers.lv1;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class problem_12933T {
    @Test
    void Solution() {
        problem_12933 t = new problem_12933();
        int n = 118372;
        long sol = problem_12933.solution(n);
        Assertions.assertThat(sol).isEqualTo(873211);
    }
}