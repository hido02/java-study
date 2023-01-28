package dp;

public class Fibonacci_topdown {
    static int[] topDown_memo;

    public static void main(String[] args) {
        int n = 90;
        topDown_memo = new int[n+1];
    }

    public static int topDown(int n) {
        if(n < 2) return topDown_memo[n] = n;

        // 메모에 계산된 값이 있으면
        if(topDown_memo[n] > 0) return topDown_memo[n];

        // 재귀를 사용하고 있음
        topDown_memo[n] = topDown(n-1) + topDown(n-2);

        return topDown_memo[n];
    }
}
