package com.codingTest_test.ct.programmers.lv1;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class problem_17681T {
    @Test
    void solution() {
        problem_17681 solution = new problem_17681();
        int n = 5;
        int[] arr1 = {9, 20, 28, 18, 11};
        int[] arr2 = {30, 1, 21, 17, 28};
        String[] solution1 = problem_17681.solution(n, arr1, arr2);
        Assertions.assertThat(solution1).isEqualTo(new String[]{"#####", "# # #", "### #", "#  ##", "#####"});
    }
}
