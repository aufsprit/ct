package com.codingTest_test.ct.programmers.lv2;

import java.util.HashMap;

public class problem_132265 {
    public static int solution(int[] topping) {
        int answer = 0;

        HashMap<Integer, Integer> map = new HashMap<>();
        HashMap<Integer, Integer> map2 = new HashMap<>();

        for (int k : topping) {
            if (!map.containsKey(k)) {
                map.put(k, 1);
            } else {
                map.put(k, map.get(k) + 1);
            }
        }
        for (int j : topping) {
            map.put(j, map.get(j) - 1);
            if (!map2.containsKey(j)) {
                map2.put(j, 1);
            } else {
                map2.put(j, map2.get(j) + 1);
            }
            if (map.containsKey(j) && map.get(j) <= 0) {
                map.remove(j);
            }
            if (map.size() == map2.size()) {
                System.out.println(map);
                System.out.println(map2);
                answer++;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        problem_132265 t = new problem_132265();
        int[] topping = {1, 2, 3, 1, 4};
        System.out.println(solution(topping));
        int[] to2 = {1, 2, 1, 3, 1, 4, 1, 2};
        System.out.println(solution(to2));
    }
}
