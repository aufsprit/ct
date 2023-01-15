package com.codingTest_test.ct.programmers.lv2;

import java.util.LinkedList;
import java.util.Queue;

public class problem_1844 {
    static int[][] dir = {{1,0}, {0,1}, {-1,0}, {0,-1}};
    static int[][] visit;
    static int distance = 0;
    static int min = 0;
    public int solution(int[][] maps) {
        int answer = 0;
        visit = new int[maps.length][maps[0].length];

        bfs(maps);
        answer = visit[maps.length-1][maps[0].length-1];
        if (answer == 0) return -1;
        return answer;
    }

    private void bfs(int[][] maps) {
        visit[0][0] = 1;
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{0,0});

        while (!queue.isEmpty()) {
            int[] queuePoll = queue.poll();
            int x = queuePoll[0];
            int y = queuePoll[1];

            for (int k = 0; k < 4; k++) {
                int dx = x + dir[k][0];
                int dy = y + dir[k][1];

                if (dx < 0 || dy < 0 || dx >= maps.length || dy >= maps[0].length) continue;
                if (maps[dx][dy] == 1 && visit[dx][dy] == 0) {
                    visit[dx][dy] = visit[x][y] + 1;
                    queue.add(new int[]{dx, dy});
                }
            }
        }
    }

    public static void main(String[] args) {
        problem_1844 t = new problem_1844();
        int[][] maps = {{1,0,1,1,1}, {1,0,1,0,1}, {1,0,1,1,1}, {1,1,1,0,1}, {0,0,0,0,1}};
        System.out.println(t.solution(maps));
        maps = new int[][]{{1,0,1,1,1}, {1,0,1,0,1}, {1,0,1,1,1}, {1,1,1,0,0}, {0,0,0,0,1}};
        System.out.println(t.solution(maps));
    }
}
