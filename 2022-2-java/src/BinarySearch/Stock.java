package BinarySearch;

import java.util.Scanner;

public class Stock {
    public static void main(String[] args) {
        int t;
        Scanner sc = new Scanner(System.in);
        t = sc.nextInt();

        int n[] = new int[100];
        int k[] = new int[100];
        int stock[][] = new int[100][100];

        for(int i = 0; i < t; i++) {
            n[i] = sc.nextInt();
            k[i] = sc.nextInt();

            for(int j = 0; j < n[i]; j++) {
                stock[i][j] = sc.nextInt();
            }
        }

        int cnt = 0;
        int caseCnt[] = new int[100];

        for(int m = 0; m < t; m++) {
//            System.out.println("[test]"+m);
            for(int i = 0; i < n[i]; i++) {
//                System.out.println("[case] start: "+i);
                for(int j = i+1; j < n[i]; j++) {
                    if(stock[m][i] < stock[m][j]) {
//                        System.out.println("i: "+i+" j: "+j);
//                        System.out.println("stock[][i]: "+stock[m][i]+" stock[][j]: "+stock[m][j]);
                        cnt++;
                    }
                    if(cnt >= k[i]-1) {
                        caseCnt[m]++;
                    }
//                    System.out.println("cnt: "+cnt);
//                    System.out.println("caseCnt[m]: "+caseCnt[m]);
                }
                cnt = 0;
            }
//            System.out.println(caseCnt[m]);
//            System.out.println();
        }

        for(int i = 0; i < t; i++) {
            System.out.println("Case #"+(i+1));
            if(caseCnt[i] > 0) {
                System.out.println(1);
            }
            else {
                System.out.println(0);
            }
        }
    }
}
