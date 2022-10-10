package com.codingTest_test.ct.programmers.lv1;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class problem_12922T {
    @Test
    void Solution() {
        problem_12922 t = new problem_12922();
        int n = 3;
        String sol = problem_12922.solution(n);
        Assertions.assertThat(sol).isEqualTo("수박수");
        int n2 = 4;
        sol = problem_12922.solution(n2);
        Assertions.assertThat(sol).isEqualTo("수박수박");
    }
}