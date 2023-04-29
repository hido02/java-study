package Graph.Rank;
import java.util.*;

public class Solution {
    public int solution(int n, int[][] results) {
        int answer = 0;
        int[][] graph = new int[n+1][n+1];

        for (int i = 1; i < graph.length; i++) {
            for (int j = 1; j < graph.length; j++) {
                graph[i][j] = 10000; // 매우 큰 값으로 초기화
            }
        }

        for (int i = 0; i < results.length; i++)
            graph[results[i][0]][results[i][1]] = 1; // 이김


        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= n; j++) {
                for (int z = 0; z <= n; z++) {
                    if (graph[j][i] == 1 && graph[i][z] == 1) // j에서 i를 거쳐 z로 가는 경우
                        graph[j][z] = 1;

                }
            }
        }

        for (int i = 1; i <= n; i++) {
            int game = 0;
            for (int j = 1; j <= n; j++) {
                if (graph[i][j] == 1 || graph[j][i] == 1) // 이기고 진 경우
                    game++;
            }
            if (game == n-1) // 이기고 진 경우를 합쳐 n-1일 경우
                answer++; // 확정지을 수 있는 순위의 개수를 증가
        }
        return answer;
    }
}
