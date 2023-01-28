package DfsBfs;

import java.util.Iterator;
import java.util.LinkedList;

class Graph {
    private int V; // 정점
    private LinkedList<Integer> adj[]; // 연결 리스트

    // 생성자
    Graph (int v) {
        V = v;
        adj = new LinkedList[v];
        // v개의 LinkedList 선언 및 생성
        for (int i = 0; i < v; i++) {
            adj[i] = new LinkedList<>();
        }
    }

    void addEdge (int v, int w) { // v번째 LinkedList에 w를 삽입 (간선?)
        adj[v].add(w);
    }

    // DFS 함수
    void DFS(int v) { // v를 시작 노드로
        boolean visited[] = new boolean[V]; // 각 노드의 방문 여부를 저장
        DFSUtil(v, visited);

    }
    // DFS에서 호출되는 함수
    void DFSUtil(int v, boolean visited[]) {
        // 현재 노드를 방문한 것으로 체크 (visited의 v번째 요소를 true로)
        visited[v] = true;
        System.out.println(v + " ");

        // 방문한 노드와 (인접한 모든 노드)를 가지고 온다
        Iterator<Integer> it = adj[v].listIterator();
        while (it.hasNext()) {
            int n = it.next();
            // 방문하지 않은 노드면 해당 노드를 다시 (시작 노드)로 하여 DFSUtil (재귀) 호출
            if (!visited[n])
                DFSUtil(n, visited);
        }

    }
}
