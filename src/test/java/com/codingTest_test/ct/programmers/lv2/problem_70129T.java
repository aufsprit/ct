package com.codingTest_test.ct.programmers.lv2;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class problem_70129T {
    @Test
    void Solution() {
        problem_70129 sol = new problem_70129();
        String s = "110010101001";
        int[] solution = sol.solution(s);
        Assertions.assertThat(solution).isEqualTo(new int[]{3,8});
    }
}