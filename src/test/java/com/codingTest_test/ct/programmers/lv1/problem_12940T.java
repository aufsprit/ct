package com.codingTest_test.ct.programmers.lv1;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class problem_12940T {
    @Test
    void solution() {
        problem_12940 solution = new problem_12940();
        int n = 3;
        int m = 12;
        int[] solution1 = problem_12940.solution(n, m);
        Assertions.assertThat(solution1).isEqualTo(new int[]{3, 12});
    }
}