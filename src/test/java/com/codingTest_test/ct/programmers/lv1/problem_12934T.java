package com.codingTest_test.ct.programmers.lv1;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class problem_12934T {
    @Test
    void Solution() {
        problem_12934 t = new problem_12934();
        int n = 121;
        long solution1 = problem_12934.solution(n);
        Assertions.assertThat(solution1).isEqualTo(144);
    }
}