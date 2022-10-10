package com.codingTest_test.ct.programmers.lv1;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class problem_12919T {
    @Test
    void Solution() {
        problem_12919 t = new problem_12919();
        String[] seoul = {"Jane", "Kim"};
        String sol = problem_12919.solution(seoul);
        Assertions.assertThat(sol).isEqualTo("김서방은 1에 있다");
    }
}