package com.codingTest_test.ct.programmers.lv2;

import java.util.Arrays;

public class problem_1829 {
    static boolean[][] visit;
    static int colorCount;
    static int colorCntMax;
    static int cnt = 0;
    static int[][] dir = {{1,0}, {0,1}, {-1,0}, {0,-1}};
    public int[] solution(int m, int n, int[][] picture) {

        colorCount = 0;
        colorCntMax = 0;
        int[] answer = new int[2];
        visit = new boolean[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (picture[i][j] != 0 && !visit[i][j]) {
                    colorCount++;
                    dfs(i, j, visit, picture);
                }

                if (cnt > colorCntMax) colorCntMax = cnt;
                cnt = 0;
            }
        }

        answer[0] = colorCount;
        answer[1] = colorCntMax;

        return answer;
    }

    public static void dfs(int x, int y, boolean[][] visit, int[][] picture) {
        if (visit[x][y]) return;

        visit[x][y] = true;
        cnt++;

        for (int i = 0; i < 4; i++) {
            int dx = x + dir[i][0];
            int dy = y + dir[i][1];

            if (dx < 0 || dy < 0 || dx >= picture.length || dy >= picture[0].length) continue;
            if (picture[x][y] == picture[dx][dy] && !visit[dx][dy])
                dfs(dx, dy, visit, picture);
        }
    }

    public static void main(String[] args) {
        problem_1829 t = new problem_1829();
        int m = 6;
        int n = 4;
        int[][] picture =
                       {{1, 1, 1, 0},
                        {1, 2, 2, 0},
                        {1, 0, 0, 1},
                        {0, 0, 0, 1},
                        {0, 0, 0, 3},
                        {0, 0, 0, 3}};
        System.out.println(Arrays.toString(t.solution(m, n, picture)));
    }
}
