package com.codingTest_test.ct.programmers.lv1;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class problem_131128T {
    @Test
    void Solution() {
        problem_131128 solution = new problem_131128();
        String X = "12321";
        String Y = "42531";
        String sol = problem_131128.solution(X, Y);
        Assertions.assertThat(sol).isEqualTo("321");
        String X2 = "100";
        String Y2 = "2345";
        sol = problem_131128.solution(X2, Y2);
        Assertions.assertThat(sol).isEqualTo("-1");
        String X3 = "100";
        String Y3 = "203045";
        sol = problem_131128.solution(X3, Y3);
        Assertions.assertThat(sol).isEqualTo("0");
        String X4 = "1101110101011001";
        String Y4 = "10101011100010011111001100011";
        sol = problem_131128.solution(X4, Y4);
        Assertions.assertThat(sol).isEqualTo("1111111111000000");
    }
}