package com.codingTest_test.ct.programmers.lv1;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class problem_12932T {
    @Test
    void solution() {
        problem_12932 solution = new problem_12932();
        int n = 12345;
        int[] solution1 = problem_12932.solution(n);
        Assertions.assertThat(solution1).isEqualTo(new int[]{5,4,3,2,1});
    }
}