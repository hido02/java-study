package dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class makeOne {
    static int[] dp;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        dp = new int[n+1];

        dp[0] = 0; dp[1] = 0; // 0과 1은 연산할 필요가 없으므로, 0으로 초기화

        for(int i = 2; i <= n; i++) {
//            dp[i] = Math.min(Math.min(dp[i/3], dp[i/2]), dp[i-1]) + 1;
            if(i % 6 == 0) {
                dp[i] = Math.min(dp[i/2], dp[i/3]) + 1;
            }
            else if(i % 3 == 0) {
                dp[i] = Math.min(dp[i/3], dp[i-1]) + 1;
            }
            else if(i % 2 == 0) {
                dp[i] = Math.min(dp[i/2], dp[i-1]) + 1;
            }
            else {
                dp[i] = dp[i-1] + 1;
            }
        }

        System.out.println(dp[n]);
    }
}
