package com.codingTest_test.ct.programmers.lv2;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class problem_12951T {
    @Test
    void solution() {
        problem_12951 solution = new problem_12951();
        String s = "3people unFollowed me";
        String sol2 = problem_12951.solution(s);
        Assertions.assertThat(sol2).isEqualTo("3people Unfollowed Me");
    }
}