package dp;

import java.util.Scanner;

public class Dynamic {
    static int[][] memo;

    public static void main(String[] args) {
        int s = 1000;
        memo = new int[s+1][s+1];

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        System.out.println(dynamic(n, m));
    }

    public static int dynamic(int n, int m) {
        // base case 도달 시, 1로 초기화
        if(n == 1) return memo[n][m] = 1;
        if(m == 1) return memo[n][m] = 1;

        // 메모에 계산된 값이 있으면 바로 반환
        if(memo[n][m] > 0) return memo[n][m];

        // 재귀 사용
        memo[n][m] = dynamic(n-1, m) + dynamic(n, m-1);
        System.out.println("memo["+n+"]["+m+"]: "+memo[n][m]);

        return memo[n][m];
    }
}
