package com.codingTest_test.ct.programmers.lv1;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class problem_12948T {
    @Test
    void solution() {
        problem_12948 solution = new problem_12948();
        String phone_number = "01033334444";
        String solution1 = problem_12948.solution(phone_number);
        Assertions.assertThat(solution1).isEqualTo("*******4444");
    }
}