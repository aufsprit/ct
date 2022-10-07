package com.codingTest_test.ct.programmers.lv1;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class problem_12937T {
    @Test
    void Solution() {
        problem_12937 solution = new problem_12937();
        int num = 3;
        String solution1 = problem_12937.solution(num);
        Assertions.assertThat(solution1).isEqualTo("Odd");
        int num2 = 4;
        solution1 = problem_12937.solution(num2);
        Assertions.assertThat(solution1).isEqualTo("Even");
    }
}