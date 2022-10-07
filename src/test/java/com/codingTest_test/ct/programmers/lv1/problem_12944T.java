package com.codingTest_test.ct.programmers.lv1;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class problem_12944T {
    @Test
    void solution() {
        problem_12944 solution = new problem_12944();
        int[] arr = {1,2,3,4};
        double solution1 = problem_12944.solution(arr);
        Assertions.assertThat(solution1).isEqualTo(2.5);
    }

}