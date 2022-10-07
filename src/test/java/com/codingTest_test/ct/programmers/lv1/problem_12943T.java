package com.codingTest_test.ct.programmers.lv1;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class problem_12943T {
    @Test
    void solution() {
        problem_12943 solution = new problem_12943();
        int n = 6;
        int solution1 = problem_12943.solution(n);
        Assertions.assertThat(solution1).isEqualTo(8);
    }
}