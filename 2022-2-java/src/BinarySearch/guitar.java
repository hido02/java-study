package BinarySearch;

import java.util.Scanner;

public class guitar {

    static int getCount(int n, int[] lesson, int mid) {
        int sum = 0;
        int cnt = 0;

        for(int i = 0; i < n; i++) { // lesson[]을 탐색하여 한 블루레이 당 레슨 길이의 합이 mid보다 작도록 강의를 그룹으로 분리
            if (sum + lesson[i] > mid) { // 한 블루레이 당 레슨 길이의 합
                sum = 0;
                cnt++; // 그룹을 쪼갠다
            }
            sum += lesson[i];
        }

        if(sum != 0) cnt++;
        return cnt;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, m;

        n = sc.nextInt(); // 강의의 수
        m = sc.nextInt(); // 블루레이의 개수

        int lesson[] = new int[10000];

        for(int i = 0; i < n; i++) {
            lesson[i] = sc.nextInt();
        }

        int start = 0;
        int end = 0;
        for (int i = 0; i < n; i++) {
            end += lesson[i]; // end는 각 레슨의 길이를 모두 더한 값
            start = Math.max(start, lesson[i]); // 가장 큰 레슨
        }

        while (start <= end) {
            int mid = (start + end) / 2; // mid: 블루레이 최소 크기의 후보

            int cnt = getCount(n, lesson, mid);
            // cnt: 레슨을 분리한 그룹의 수

            if(cnt > m) { // 필요한 블루레이 개수가 m보다 크다면
                start = mid + 1; // start를 mid+1로 변경 (왼쪽을 버림)
            }
            else { // 필요한 블루레이 개수가 m보다 작다면
                end = mid - 1; // end를 mid-1로 변경 (오른쪽을 버림)
            }
        }

//        int sum[] = new int[100];
//
//        for(int i = 0; i < n; i++) {
//            for(int j = 0; j <= i; j++) {
//                sum[i] += lesson[n-i+j];
//            }
//        }

//        for(int i = 0; i < n; i++) {
//            for(int j = 0; j < n-i; j++) {
//
//            }
//        }


    }
}
