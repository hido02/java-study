package Graph;

import java.io.IOException;
import java.util.Arrays;

public class Floyd_Warshall {
    static final int INF = 9999999;

    public static void main(String[] args) {
        // 정점의 수 입력
        int N = 4;

        // 인접 행렬 입력
        int[][] D = {{0, 2, 0, 15},
                    {0, 0, 10, 4},
                    {3, 0, 0, 0},
                    {0, 0, 7, 0}};

        // 갈 수 없는 경로 확인
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (i == j) continue;
                if (D[i][j] == 0) // 연결되어 있지 않은 노드
                    D[i][j] = INF; // 매우 큰 값으로 초기화
            }
        }

        // 입력 출력
        System.out.println("=============입력=============");
        for (int[] row : D)
            System.out.println(Arrays.toString(row));

        // 플로이드 와샬
        for (int k = 0; k < N; k++) { // 경유 노드 확인
            for (int i = 0; i < N; i++) { // 출발지
                if (i == k) continue; // 출발지와 경유지가 같으면 다음 탐색
                for (int j = 0; j < N; j++) { // 도착지
                    if (j == i || j == k) continue; // 출발지와 도착지가 같거나 도착지가 경유지이면 다음 탐색
                    D[i][j] = Math.min(D[i][k] + D[k][j], D[i][j]); // 경유하거나 직접 가거나 더 짧은 경로로 대체
               }
            }
        }

        // 결과 출력
        System.out.println("=============결과=============");
        for (int[] row : D) System.out.println(Arrays.toString(row));
    }
}
