package com.codingTest_test.ct.programmers.lv1;

public class problem_17681 {
    public static String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        for (int i=0; i<n; i++) {
            answer[i] = "";
        }

        int[] width1 = new int[n];
        int[] width2 = new int[n];
        int[] toInt = new int[n];
        int[][] map1 = new int[n][n];
        int[][] map2 = new int[n][n];

        for (int i=0; i<n; i++) {
            width1 = func1(n, arr1[i]);
            width2 = func1(n, arr2[i]);
            for (int j=n-1, k=0; j>=0; j--, k++) {
                map1[i][k] = width1[j];
                map2[i][k] = width2[j];
            }
        }
        for (int i=0; i<n; i++) {
            for (int j=0; j<n; j++) {
                map1[i][j] = map1[i][j] + map2[i][j];
                if (map1[i][j] > 1) {
                    map1[i][j] = 1;
                }
            }
        }
        for (int i=0; i<n; i++) {
            for (int j=0; j<n; j++) {
                if (map1[i][j] == 1) answer[i] += "#";
                else answer[i] += " ";
            }
        }


        return answer;
    }

    public static int[] func1(int n, int arr) {
        int remainder = 0;
        int j = 0;
        int[] width = new int[n];

        while(arr>0) {
            remainder = arr % 2;
            arr = arr / 2;
            width[j] = remainder;
            j++;
        }
        return width;
    }
}