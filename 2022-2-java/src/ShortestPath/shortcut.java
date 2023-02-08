package ShortestPath;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

class Node {
    int idx;
    int cost;

    Node(int idx, int cost) {
        this.idx = idx;
        this.cost = cost;
    }
}

public class shortcut {
    static int N, M;
    static char[][] arr;

    public static void main(String[] arg) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int[][] arr = new int[N][M];
        int V = N * M;
        int E = V * (V-1)/2;

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < M; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        ArrayList<ArrayList<Node>> graph = new ArrayList<ArrayList<Node>>();

        for(int i = 0; i < V + 1; i++) {
            graph.add(new ArrayList<>());
        }

        int start_i = 0; int start_j = 0; int start = 0;

        for(int i = 0; i < N; i++) {
            for(int j = 0; j < M; j++) {
                if(arr[i][j] == 2) {
                    start_i = i;
                    start_j = j;
                    start = (i+1) * M + j;
                }
            }
        }

        for(int i = 0; i < N; i++) {
            for(int j = 0; j < M; j++) {
                graph.get(arr[start_i][start_j]).add(new Node(arr[start_i][start_j-1], 1));
                graph.get(arr[start_i][start_j]).add(new Node(arr[start_i+1][start_j], 1));
                graph.get(arr[start_i][start_j]).add(new Node(arr[start_i][start_j+1], 1));
                graph.get(arr[start_i][start_j]).add(new Node(arr[start_i-1][start_j], 1));
            }
        }

        boolean[] visited = new boolean[V + 1];
        int[] dist = new int[V + 1]; // start 노드부터 end 노드까지의 최소 거리를 저장할 배열

        for(int i = 0; i < V + 1; i++) {
            dist[i] = Integer.MAX_VALUE; // 출발 지점 외 나머지 지점까지의 최소 비용은 무한
        }
        dist[start] = 0; // 출발 지점의 비용은 0

        for(int i = 0; i < V; i++) {
            // 현재 거리 비용 중 최소인 지점을 선택
            int nodeValue = Integer.MAX_VALUE; // 해당 노드가 가지고 있는 현재 비용
            int nodeIdx = 0;
            for(int j = 1; j < V + 1; j++) {
                // 해당 노드를 방문하지 않았고, 현재 모든 거리 비용 중 최솟값을 찾는다
                if(!visited[j] && dist[j] < nodeValue) {
                    nodeValue = dist[j];
                    nodeIdx = j;
                }
            }
            // 최종 선택된 노드를 방문처리
            visited[nodeIdx] = true;

            // 해당 지점을 기준으로 인접 노드의 최소 거리 값을 갱신
            for(int j = 0; j < graph.get(nodeIdx).size(); j++) {
                // 인접 노드를 선택
                Node adjNode = graph.get(nodeIdx).get(j);
            }
        }






    }
}
