package com.codingTest_test.ct.programmers.lv2;

public class problem_12905 {
    public int solution(int[][] board)
    {
        int answer = 0;
        int max = 0;

        if (board.length == 1) {
            return 1;
        }

        for (int i = 1; i < board.length; i++) {
            for (int j = 1; j < board[0].length; j++) {
                if (board[i][j] != 0) {
                    board[i][j] = Math.min(Math.min(board[i - 1][j], board[i][j - 1]), board[i - 1][j - 1]) + 1;
                    max = Math.max(board[i][j], max);
                }
            }
        }

        answer = max*max;
        return answer;
    }

    public static void main(String[] args) {
        problem_12905 t = new problem_12905();
        int[][] board = {{1}};
        System.out.println(t.solution(board));
    }
}
