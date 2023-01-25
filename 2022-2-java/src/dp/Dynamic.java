package dp;

import java.util.Scanner;

public class Dynamic {
    static long[][] memo;

    public static void main(String[] args) {
        int s = 1000;
        memo = new long[s+1][s+1];

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        for(int i = 0; i <= n; i++) {
            for(int j = 0; j <= m; j++) {
                memo[i][j] = -1;
            }
        }

        System.out.println(dynamic(n, m));
    }

    public static long dynamic(int n, int m) {
        // base case 도달 시, 1로 초기화
        if(n==0 || m==0) return 0;
        if(n==1 && m==1) return 1;
        if(memo[n][m] != -1) return memo[n][m];

        long result = (dynamic(n, m-1) + dynamic(n-1, m) + dynamic(n-1, m-1))%1000000007;
        memo[n][m] = result;

        // 재귀 사용
        System.out.println("memo["+n+"]["+m+"]: "+memo[n][m]);

        return result;
    }
}
