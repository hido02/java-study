package Cycle;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Cycle1 {
    public static void main(String[] args) {
        int T; // 테스트 케이스의 개수
        int N; // 순열의 크기 (2 <= N <= 1000)
        boolean[] visited; // 각 노드의 방문 여부
        int[] node = new int[10];

        Scanner sc = new Scanner(System.in);

        T = sc.nextInt();
        N = sc.nextInt();

        for(int i = 0; i < N; i++) {
            node[i] = sc.nextInt();
        }

        int[] from = new int[15];
        int[] to = new int[15];

        for(int i = 0; i < N; i++) {
            from[i] = i + 1;
        }

        for (int i = 0; i < N; i++) {
            to[i] = node[i];
        }

        int tmp;

//        tmp =

    }
}
