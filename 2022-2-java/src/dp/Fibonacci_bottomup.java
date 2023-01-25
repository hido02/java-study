package dp;

public class Fibonacci_bottomup {
    static int[] bottomup_table;

    public static void main(String[] args) {
        int n = 30;
        bottomup_table = new int[n + 1];

        System.out.println(bottomUp(n));
    }

    public static int bottomUp(int n) {
        // base case의 경우 사전에 미리 저장
        bottomup_table[0] = 0;
        bottomup_table[1] = 1;

        // 반복문 사용
        for (int i = 2; i <= n; i++) {
            // table을 채워나감
            bottomup_table[i] = bottomup_table[i-1] + bottomup_table[i-2];
        }

        return bottomup_table[n];
    }
}
