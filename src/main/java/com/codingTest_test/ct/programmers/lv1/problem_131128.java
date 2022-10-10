package com.codingTest_test.ct.programmers.lv1;

import java.util.ArrayList;
import java.util.Comparator;

public class problem_131128 {
    public static String solution(String X, String Y) {
        ArrayList<String> sl = new ArrayList<>();
        int[] x = new int[10];
        int[] y = new int[10];
        for (int i=0; i<X.length(); i++) {
            x[Integer.parseInt(X.substring(i, i+1))]++;
        }
        for (int i=0; i<Y.length(); i++) {
            y[Integer.parseInt(Y.substring(i, i+1))]++;
        }
        for (int i=0; i<=9; i++) {
            if (x[i] == 0 || y[i] == 0) {
                continue;
            }
            if (x[i] <= y[i]) {
                for (int j=0; j < x[i]; j++) {
                    sl.add(String.valueOf(i));
                }
            } else if (x[i] > y[i]) {
                for (int j = 0; j < y[i]; j++) {
                    sl.add(String.valueOf(i));
                }
            }
        }
        if (sl.size() == 0) return "-1";
        sl.sort(Comparator.reverseOrder());
        if (sl.get(0).equals("0")) return "0";
        StringBuilder sb = new StringBuilder();
        for (int i=0; i<sl.size(); i++) {
            sb.append(sl.get(i));
        }
        return sb.toString();
    }
}
