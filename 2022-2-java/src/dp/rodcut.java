package dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class rodcut {

    public static void main(String[] args) throws NumberFormatException, IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        int[] partPrice = new int[n + 1]; // 길이별 가격
        int[] maxPricePerLength = new int[n + 1]; // 길이 n의 막대를 자르는 최대값

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for (int i = 1; i <= n; i++) {
            partPrice[i] = Integer.parseInt(st.nextToken());
        }

        br.close();

        for (int i = 1; i <= n; i++) {
            int max = 0;
            for (int j = 1; j <= i; j++) {
                max = Math.max(max, partPrice[j] + maxPricePerLength[i-j]);
            }
            maxPricePerLength[i] = max;
        }

        System.out.println(maxPricePerLength[n]);
    }

}