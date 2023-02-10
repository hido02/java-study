package ShortestPath;

import java.util.*;
import java.io.*;

public class EasyShortcut {
    static int n, m;
    static int[][] map;
    static int[][] dist;
    static boolean[][] visited = new boolean[n][m];
    static int[] xMove = {0, 0, -1, 1}; // 상하좌우
    static int[] yMove = {1, -1, 0, 0};

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder builder = new StringBuilder();

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int[][] map = new int[n][m];
        int[][] dist = new int[n][m];
        int startX = -1, startY = -1;

        // 거리 배열은 -1로 초기화해준다.
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                dist[i][j] = -1;
            }
        }

        // 지도 입력받기
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < m; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());

                // 목표지점(2)일 경우
                if (map[i][j] == 2) {
                    visited[i][j] = true;
                    dist[i][j] = 0; // 애초에 갈 수 없는 곳이므로 거리 배열에 0 저장
                    startX = i;
                    startY = j;
                }
            }
        }

        bfs(startX, startY);

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (!visited[i][j] && map[i][j] == 1) { // 방문하지 않았고 갈 수 있는 곳이라면
                    builder.append(-1 + " ");
                } else { // 방문했고 갈 수 있는 곳이라면
                    builder.append(dist[i][j]).append(" ");
                    builder.append("\n");
                }

                System.out.println(builder.toString());
            }
        }
    }

    private static void bfs(int x, int y) {
        Queue<Point> queue = new LinkedList<>();
        queue.add(new Point(x, y));
        visited[x][y] = true;

        while (!queue.isEmpty()) { // 큐에 데이터가 있다면
            Point current = queue.poll(); // 그 데이터를 꺼내서 확인

            for (int i = 0; i < 4; i++) { // 상하좌우로 움직여본다.
                int nextX = current.x + xMove[i];  // 상하좌우 중 다음 시점의 x좌표
                int nextY = current.y + yMove[i]; // 상하좌우 중 다음 시점의 y좌표

                if (nextX < 0 || nextY < 0 || nextX >= n || nextY >= m) continue; // 지도를 벗어났을 경우 패스
                if (map[nextX][nextY] == 0) continue; // 지도 상 원래 갈 수 없는 곳(0)이라면 패스
                if (visited[nextX][nextY]) continue; // 이미 방문한 곳이라면 패스

                queue.add(new Point(nextX, nextY)); // 큐에 다음 시점의 좌표 저장
                dist[nextX][nextY] = dist[current.x][current.y] + 1; // 이동 거리를 +1
                visited[nextX][nextY] = true; // 방문 상태로 저장
            }
        }
    }

    static class Point {
        public int x, y;

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
}