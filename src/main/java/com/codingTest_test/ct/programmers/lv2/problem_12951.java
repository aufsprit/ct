package com.codingTest_test.ct.programmers.lv2;

public class problem_12951 {
    public static String solution(String s) {
        StringBuilder ans = new StringBuilder();
        String[] st = s.split(" ");
        String[] result = new String[st.length];
        for (int i = 0; i < st.length; i++) {
            result[i] = "";
        }
        for (int i = 0; i < st.length; i++) {
            String[] st1 = st[i].split("");
            for (int j = 0; j < st1.length; j++) {
                if (st1[j].equals("")) {
                    continue;
                } else if (st1[0].charAt(0) >= 'a' && st1[0].charAt(0) <= 'z') {
                    st1[0] = st1[0].toUpperCase();
                } else if (j != 0 && st1[j].charAt(0) >= 'A' && st1[j].charAt(0) <= 'Z') {
                    st1[j] = st1[j].toLowerCase();
                }
            }
            for (String value : st1) {
                result[i] += value;
            }
        }
        for (int i = 0; i < result.length; i++) {
            if (i != result.length - 1) ans.append(result[i]).append(" ");
            else if (s.charAt(s.length() - 1) == ' ') {
                ans.append(result[i]).append(" ");
            } else {
                ans.append(result[i]);
            }
        }
        return ans.toString();
    }
}