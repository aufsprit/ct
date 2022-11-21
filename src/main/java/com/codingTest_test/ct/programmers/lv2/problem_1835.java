package com.codingTest_test.ct.programmers.lv2;

public class problem_1835 {
    static boolean[] visit;
    static String[] st = {"A", "C", "F", "J", "M", "N", "R", "T"};
    static int answer;

    public int solution(int n, String[] data) {

        answer = 0;
        visit = new boolean[st.length];
        dfs("", 0, data);

        return answer;
    }

    public void dfs(String s, int i, String[] data) {
        if (i == st.length) {
            //condition 에 줄을 선 순서를 입력하고 조건이 맞다면 answer++
            if (condition(s, data)) answer++;
            return;
        }

        for (int j = 0; j < st.length; j++) {
            if (visit[j]) continue; //이미 줄을 섰다면 continue;
            visit[j] = true;
            //dfs 에 s + st[j] 를 해나가서 i 가 st.length 가 되었을 때 조건 확인
            dfs(s + st[j], i+1, data);
            visit[j] = false;
        }
    }

    private boolean condition(String s, String[] data) {
        for (int i = 0; i < data.length; i++) {
            //data 의 조건에 맞는지를 확인
            int sti1 = s.indexOf(String.valueOf(data[i].charAt(0)));
            int sti2 = s.indexOf(String.valueOf(data[i].charAt(2)));
            char sign = data[i].charAt(3);
            int distanceCondition = Integer.parseInt(String.valueOf(data[i].charAt(4)));
            int absDistance = Math.abs(sti1 - sti2)-1;
            if ((sign == '<') && !(absDistance < distanceCondition)) return false;
            else if ((sign == '>') && !(absDistance > distanceCondition)) return false;
            else if ((sign == '=') && !(absDistance == distanceCondition)) return false;
        }
        return true;
    }

}
