package timeTable;

import java.util.Comparator;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.io.*;
import java.util.*;

public class timeTable {

    public static void main(String[] args) throws IOException {
        int roomCnt;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        System.out.println("수업의 개수");
        int classCnt = Integer.parseInt(br.readLine()); // 수업의 개수
        int[][] coordinate = new int[classCnt][2];

        for (int i = 0; i < classCnt; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            coordinate[i][0] = Integer.parseInt(st.nextToken());
            coordinate[i][1] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(coordinate, new Comparator<int[]>() {

            @Override
            public int compare(int[] o1, int[] o2) {
                // TODO Auto-generated method stub
                if (o1[1] == o2[1])
                    return o1[0] - o2[0];
                return o1[1] - o2[1];
            }
        });

        for (int i = 0; i < classCnt; i++) {
            bw.write(String.valueOf(coordinate[i][0]) + " " + String.valueOf(coordinate[i][1]) + "\n");
        }

//		for (int i = 0; i < n; i++) {
//			bw.write(String.valueOf(coordinate[i][0])); -> 1 2 3
//		}

        bw.write(String.valueOf(coordinate[0][0])); // 1
        bw.write(String.valueOf(coordinate[0][1])); // 3
        System.out.println();
        bw.write(String.valueOf(coordinate[1][0])); // 2
        bw.write(String.valueOf(coordinate[1][1])); // 4
        System.out.println();
        bw.write(String.valueOf(coordinate[2][0])); // 3
        bw.write(String.valueOf(coordinate[2][1])); // 5


        br.close();
        bw.close();
    }

}
