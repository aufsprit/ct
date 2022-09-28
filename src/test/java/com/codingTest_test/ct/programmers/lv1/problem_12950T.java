package com.codingTest_test.ct.programmers.lv1;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class problem_12950T {
    @Test
    void Solution() {
        problem_12950 problem = new problem_12950();
        int[][] arr1 = {{1,2},{2,3}};
        int[][] arr2 = {{3,4},{5,6}};
        int[][] sol = problem_12950.solution(arr1, arr2);
        Assertions.assertThat(sol).isEqualTo(new int[][]{{4,6},{7,9}});
    }
}