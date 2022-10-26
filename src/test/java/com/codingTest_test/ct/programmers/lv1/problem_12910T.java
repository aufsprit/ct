package com.codingTest_test.ct.programmers.lv1;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class problem_12910T {
    @Test
    void Solution() {
        problem_12910 solution = new problem_12910();
        int[] arr = {3, 2, 6};
        int divisor = 10;
        int[] solution1 = problem_12910.solution(arr, divisor);
        Assertions.assertThat(solution1).isEqualTo(new int[] {-1});
    }
}