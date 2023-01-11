package sort;

import java.util.Scanner;

public class Score {
    public static void main(String[] args) {
        int t; // 테스트 케이스의 개수
        int[][] n = new int[10][5];
        int[] sum = new int[10];
        int[] kin = new int[10];

        System.out.println("input");
        Scanner sc = new Scanner(System.in);
        t = sc.nextInt();

        for(int i = 0; i < t; i++) {
            for(int j = 0; j < 5; j++) {
                n[i][j] = sc.nextInt();
            }
        }

        // 계수 정렬
        int[] origin = new int[5]; // 배열의 원소: 5개
        int[] counting = new int[100]; // 수의 범위 (0~100)
        int[] result = new int[5]; // 정렬된 결과 배열

        for(int i = 0; i < t; i++) {
            for(int j = 0; j < 5; j++) {
                origin[j] = n[i][j];
            }

                // 과정 1
                for(int k = 0; k < origin.length; k++) {
                    // origin의 value 값을 인덱스로 하는 counting 배열의 값 +1 증가
                    counting[origin[k]]++;
                }

                // 과정 2
                for(int k = 1; k < counting.length; k++) {
                    // 누적 합
                    counting[k] += counting[k - 1];
                }

                // 과정 3
                for(int k = origin.length - 1; k >= 0; k--) {
                    // i번째 원소를 인덱스로 하는 counting 배열을 -1 감소시킨 뒤,
                    // counting 배열의 값을 인덱스로 하여, result에 value 값을 저장
                    int value = origin[k];
                    counting[value]--;
//                    System.out.println("counting[value]: "+counting[value]);
                    result[counting[value]] = value;
                }

//                // 정렬된 배열
//                System.out.println("result[]");
//                for(int k = 0; k < result.length; k++) {
//                    if(k % 10 == 0) System.out.println();
//                    System.out.println(result[k] + "\t");
//                }
//                System.out.println();

                result[0] = 0;
                result[4] = 0;

                for(int k = 0; k < result.length; k++) {
                    sum[i] += result[k];
                }

                if((result[3] - result[1]) >= 4) {
                    kin[i] = i;
                }

//                for(int k = 0; k < sum.length; k++) {
//                    System.out.println(sum[i] + "\t");
//                }

            }
//            for(int j = 0; j < 5; j++) {
//                System.out.print(origin[j] + "\t");
//            }

//        for(int i = 0; i < t; i++) {
//
//        }
        System.out.println();
        System.out.println("output");
        for(int i = 0; i < sum.length; i++) {
            System.out.println(sum[i]);
            if(i == kin[i]) {
                break;
            }
        }
    }
}
