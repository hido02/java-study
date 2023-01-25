package dp;

import java.io.*;

public class Fibonacci {
    static Long[] table;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int s = 90;
        table = new Long[s + 1];

        int n = Integer.parseInt(br.readLine());

        System.out.println(bottomUp(n));

    }

    public static Long bottomUp(int n) {
        // base case의 경우 사전에 미리 저장
        table[0] = 0L;
        table[1] = 1L;

        // 반복문 사용
        for (int i = 2; i <= n; i++) {
            // table을 채워나감
            table[i] = table[i-1] + table[i-2];
        }

        return table[n];
    }
}
