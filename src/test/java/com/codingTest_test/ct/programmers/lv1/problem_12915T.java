package com.codingTest_test.ct.programmers.lv1;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class problem_12915T {
    @Test
    void solution() {
        problem_12915 problem = new problem_12915();
        String[] strings = {"sun", "bed", "car"};
        int n = 1;
        String[] sol = problem.solution(strings, n);
        Assertions.assertThat(sol).isEqualTo(new String[]{"car", "bed", "sun"});
        strings = new String[]{"abce", "abcd", "cdx"};
        n = 2;
        sol = problem.solution(strings, n);
        Assertions.assertThat(sol).isEqualTo(new String[]{"abcd", "abce", "cdx"});
        strings = new String[]{"aea", "ba", "ce", "aee"};
        n = 1;
        sol = problem.solution(strings, n);
        Assertions.assertThat(sol).isEqualTo(new String[]{"ba", "aea", "aee", "ce"});
    }
}