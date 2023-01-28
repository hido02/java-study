package dp;

import java.util.Scanner;

public class LCS_1 {
    static char[] str1;
    static char[] str2;

    static Integer[][] dp;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        str1 = sc.nextLine().toCharArray();
        str2 = sc.nextLine().toCharArray();

        dp = new Integer[str1.length][str2.length];

        System.out.println(lcs(str1.length - 1, str2.length - 1));
    }

    static int lcs(int x, int y) {
        // 인덱스 밖 (공집합)일 경우 0 반환
        if(x == -1 || y == -1) {
            return 0;
        }

        // 만약 탐색하지 않은 인덱스라면?
        if(dp[x][y] == null) {
            dp[x][y] = 0;

            // str1의 x번째 문자와 str2의 y번째 문자가 같은지 검사
            if(str1[x] == str2[y]) { // 같으면
                dp[x][y] = lcs(x-1, y-1) + 1;
            }

            // 같지 않다면 lcs(dp)[x-1][y]와 lcs(dp)[x,y-1] 중 큰 값으로 초기화
            else {
                dp[x][y] = Math.max(lcs(x-1,y), lcs(x,y-1));
            }
        }

        return dp[x][y];
    }
}
