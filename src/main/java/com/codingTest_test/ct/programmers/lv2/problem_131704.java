package com.codingTest_test.ct.programmers.lv2;

import java.util.ArrayList;
import java.util.Stack;

public class problem_131704 {
    public int solution(int[] order) {

        Stack<Integer> st = new Stack<>();
        ArrayList<Integer> al = new ArrayList<>();
        int n = 0;
        for (int i = 0; i < order.length; i++) {
            if (i + 1 != order[n]) {
                st.push(i+1);
            } else {
                al.add(i+1);
                n++;
            }

            if (!st.isEmpty() && !al.isEmpty() && st.peek() == order[n]) {
                al.add(st.pop());
                n++;
            }
        }
        while (!st.isEmpty()) {
            if (order[n] == st.peek()) {
                al.add(st.pop());
                n++;
            } else {
                break;
            }
        }
        return al.size();
    }
    public static void main(String[] args) {
        problem_131704 t = new problem_131704();
        int[] order = {5, 4, 3, 2, 1};
        System.out.println(t.solution(order));
        order = new int[]{4,3,1,2,5};
        System.out.println(t.solution(order));
    }
}
