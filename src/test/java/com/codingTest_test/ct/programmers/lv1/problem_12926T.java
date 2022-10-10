package com.codingTest_test.ct.programmers.lv1;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class problem_12926T {
    @Test
    void Solution() {
        problem_12926 t = new problem_12926();
        String s = "AB";
        int n = 1;
        String sol = problem_12926.solution(s, n);
        Assertions.assertThat(sol).isEqualTo("BC");
        s = "a B z";
        n = 4;
        sol = problem_12926.solution(s, n);
        Assertions.assertThat(sol).isEqualTo("e F d");
    }
}