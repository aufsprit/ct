package com.codingTest_test.ct.programmers.lv1;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class problem_12928T {
    @Test
    void Solution() {
        problem_12928 solution = new problem_12928();
        int n = 12;
        int solution1 = solution.solution(n);
        Assertions.assertThat(solution1).isEqualTo(28);
    }
}