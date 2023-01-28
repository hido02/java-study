package Inhanika;

import java.util.Scanner;

public class Inhanika {
    public static void main(String[] args) {
        int testCase, islandCnt, bridgeCnt;
        int[] from = new int[100];
        int [] to = new int[100];
        int [] dynamite = new int[100];
        int [] leaf = new int[50];
        int [] a = new int[100];

        Scanner sc = new Scanner(System.in);
        System.out.println("테스트 케이스의 개수: ");
        testCase = sc.nextInt();
        System.out.println("섬의 수: ");
        islandCnt = sc.nextInt();
        System.out.println("다리의 수: ");
        bridgeCnt = sc.nextInt();

        System.out.println("이어진 두 섬의 번호와 다이너마이트의 수: ");
        for(int i = 0; i < bridgeCnt; i++) {
            from[i] = sc.nextInt();
            to[i] = sc.nextInt();
            dynamite[i] = sc.nextInt();
        }

        // 리프 노드를 구하는 방법이 멀까
        // from하고 to 둘다에 번호가 있는거면 리프가 아님
        for(int i = 1; i <= islandCnt; i++) {
            for(int j = 0; j < bridgeCnt; j++) {
                if(from[j] == i) {
                    a[i]++;
                }
            }
        }


        for(int i = 0; i <bridgeCnt; i++) {

        }

        // 리프 노드 구하고
        // 루트 - 모든 리프 노드까지의 경로를 제거하는 가장 저렴한 방법

        // 두가지로 나눌 수 있음
        // 리프 노드인 경우
        // 최소 다이너마이트 개수 = 자신 간선의 다이너마이트 수 (바로 구해짐)

        // 리프 노드가 아닌 경우
        // 1. 자식 노드들의 최소 다이너마이트 개수의 합 계산
        // 2. 자신의 간선의 다이너마이트 수, 자식 노드들의 최소 다이너마이트를 비교


    }
}
