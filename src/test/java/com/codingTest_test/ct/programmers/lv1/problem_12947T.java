package com.codingTest_test.ct.programmers.lv1;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class problem_12947T {
    @Test
    void solution() {
        problem_12947 solution = new problem_12947();
        int arr = 10;
        boolean solution1 = problem_12947.solution(arr);
        Assertions.assertThat(solution1).isEqualTo(true);
    }
}
