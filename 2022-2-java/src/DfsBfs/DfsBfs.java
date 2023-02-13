//package DfsBfs;
//
//import java.util.LinkedList;
//import java.util.Queue;
//import java.util.Scanner;
//
//public class DfsBfs {
//    static int[][] arr;
//    static boolean[] visited;
//
//    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
//
//        int N = scan.nextInt(); // N: 정점의 개수
//        int M = scan.nextInt(); // M: 간선의 개수
//
//        int V = scan.nextInt(); // V: 탐색을 시작할 정점 번호
//
//        // 인접 배열 생성
//        arr = new int[N+1][N+1];
//        for(int i = 0; i < M; i++) { // 간선의 개수만큼 반복
//            int a = scan.nextInt(); // 간선 입력 받는건가
//            int b = scan.nextInt();
//            arr[a][b] = 1;
//            arr[b][a] = 1;
//        }
//
//        visited = new boolean[N + 1];
//        dfs(V);
//
//        System.out.println();
//
//        visited = new boolean[N + 1];
//        bfs(V);
//    }
//
//    // 깊이 우선 탐색 (재귀)
//    public static void dfs(int V) {
//        visited[V] = true;
//        System.out.print(V + " ");
//
//        if(V == arr.length) {
//            return;
//        }
//        for (int j = 1; j < arr.length; j++) {
//            // 연결은 되어 있는데, 방문하지 않았다면 (재귀)
//            if (arr[V][j] == 1 && visited[j] == false) {
//                dfs(j); // 재귀
//            }
//        }
//    }
//
//    // 너비 우선 탐색 (큐)
//    public static void bfs(int V) {
//        Queue<Integer> que = new LinkedList<Integer>(); // 연결 리스트로 생성
//
//        que.add(V); // V 객체 변수를 큐에 저장
//        visited[V] = true; // 방문
//        System.out.print(V + " ");
//
//        while(!que.isEmpty()) { // 큐가 안 비어있으면
//            int temp = que.poll();
//            for(int i = 1; i < arr.length; i++) {
//                if(arr[temp][i] == 1 && visited[i] == false) { // 연결은 되어 있는데, 방문하지 않았다면?
//                    que.add(i);
//                    visited[i] = true; // 방문
//                    System.out.print(i + " ");
//
//                }
//            }
//        }
//    }
//
//}