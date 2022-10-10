package com.codingTest_test.ct.programmers.lv1;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class problem_12930T {
    @Test
    void Solution() {
        problem_12930 solution = new problem_12930();
        String s = "a     t  ";
        String solution1 = problem_12930.solution(s);
        Assertions.assertThat(solution1).isEqualTo("A     T  ");
        String s2 = "try hello world";
        solution1 = problem_12930.solution(s2);
        Assertions.assertThat(solution1).isEqualTo(	"TrY HeLlO WoRlD");
    }
}