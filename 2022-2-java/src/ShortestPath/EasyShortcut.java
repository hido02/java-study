package ShortestPath;


import com.sun.jdi.IntegerType;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.StringTokenizer;

class Point {
    public int x, y;
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

public class EasyShortcut {
    static int n, m;
    static int[][] map;

    public static void main(String[] args) throws IOException {

        int xMove[] = {0, 0, -1, 1}; // 상하좌우
        int yMove[] = {1, -1, 0, 0};

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

        boolean visited[][] = new boolean[n][m];

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

        for(int i = 0; i < n; i++) {
            for(int j = 0; j < m; j++) {
                if (!visited[i][j] && map[i][j] == 1) { // 방문하지 않았고 갈 수 있는 곳이라면
                    builder.append(-1 + " ");
                }
                else { // 방문했고 갈 수 있는 곳이라면
                    builder.append(distance[i][j] + " ");
                    builder.append("\n");
                }

                System.out.println(builder.toString());
            }

            private static void bfs(int x, int y) {
                Queue<Point> queue = new LinkedList<>();
                queue.add(new Point(x, y)); // 큐에 현재 좌표 저장
                visited[x][y] = true; // 방문 상태

                while(!queue.isEmpty()) {
                    Point current = queue.poll(); // 큐에서 꺼내 값을 확인한다

                    for(int i = 0; i < 4; i++) {
                        int nextX = current.x + xMove[i];
                        int nextY = current.y + yMove[i];

                        if(nextX < 0 || nextY < 0 || nextX >= n || nextY >= m) continue; // 지도를 벗어난 곳이면 패스
                        if(map[nextX][nextY] == 0) continue; // 애초에 갈 수 없는 곳이면 패스
                        if(visited[nextX][nextY]) continue; // 이미 방문한 곳이면

                        queue.add(new Point(nextX, nextY));
                        dist[nextX][nextY] = dist[current.x][current.y] + 1;
                        visited[nextX][nextY] = true; // 방문 상태 저장
                    }
                }
            }
        }
    }
}