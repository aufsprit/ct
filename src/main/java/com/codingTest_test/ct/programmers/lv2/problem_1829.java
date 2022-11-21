package com.codingTest_test.ct.programmers.lv2;

public class problem_1829 {
    static boolean[][] visit;
    static int colorCount = 0;
    static int colorCntMax = 0;
    static int cnt = 0;
    static int[][] dir = {{1,0}, {0,1}, {-1,0}, {0,-1}};


    public int[] solution(int m, int n, int[][] picture) {
        int[] answer = new int[2];
        colorCount = 0;
        colorCntMax = 0;
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

}
