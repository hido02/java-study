// 백준 18870번: 좌표 압축

package sort;

import java.util.Scanner;

public class Coordinate {
    public static int removeDuplicateElements(Integer arr[], int n){
        if (n==0 || n==1){
            return n;
        }

        Integer[] temp = new Integer[n];

        int j = 0;

        for (int i=0; i<n-1; i++){
            if (arr[i] != arr[i+1]){
                temp[j++] = arr[i];
            }
        }

        temp[j++] = arr[n-1];

        for (int i=0; i<j; i++){
            arr[i] = temp[i];
        }
        return j;
    }

    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int coordinates[] = new int[100];
        for(int i = 0; i < n; i++) {
            coordinates[i] = sc.nextInt();
        }

        int minIndex = 0; // 가장 작은 원소의 인덱스

        for(int i = 0; i < coordinates.length; i++) {
            for(int j = i + 1; j < coordinates.length; j++) {
                if(coordinates[minIndex] > coordinates[j]) {
                    minIndex = j;
                }
            }

            int tmp = coordinates[i];
            coordinates[i] = coordinates[minIndex];
            coordinates[minIndex] = tmp;
        }

//        for(int i = 0; i < coordinates.length; i++) {
//            System.out.println(coordinates[i] + " ");
//        }

        Integer[] removeDuplicate = new Integer[100];
        for(int i = 0; i < coordinates.length; i++) {
            removeDuplicate[i] = coordinates[i];
        }
        int l = removeDuplicate.length;

        l = removeDuplicateElements(removeDuplicate, l);

        int cnt = 0;

        for (int i = 0; i < l; i++) {
            if(removeDuplicate[i] == 0) {
                continue;
            }
            cnt++;
            System.out.print(removeDuplicate[i] + " ");
        }

        int[] rankArr = new int[100]; // 각 좌표별 순위(0으로 초기화)

        for(int i = 0; i < cnt; i++) {
            removeDuplicate[i] = cnt; // 순위 배열을 돌 때마다 초기화
            for(int j = 0; j < cnt; j++) {
                if(removeDuplicate[i] < removeDuplicate[j]) {
                    rankArr[i] = rankArr[i] + 1; // 순위 증가
                }
            }
        }

        for(int i = 0; i < cnt; i++) {
            if(rankArr[i] == 0) {
                continue;
            }
            System.out.println(rankArr[i]);
        }

    }
}
