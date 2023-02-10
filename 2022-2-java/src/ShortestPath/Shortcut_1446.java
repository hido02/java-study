package ShortestPath;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.util.*;

public class Shortcut_1446 {
    private static int n, d;
    private static int[] shortcut; // 지름길을 저장할 배열
    private static boolean[] visited = new boolean[d];

    static class Road {
        public int start, end, dist;

        public Road (int start, int end, int dist) {
            this.start = start;
            this.end = end;
            this.dist = dist;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken()); // 지름길의 개수
        d = Integer.parseInt(st.nextToken()); // 고속도로의 길이

        List<Road> RoadList = new ArrayList<>();

        for(int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            RoadList.add()
        }


    }

}
