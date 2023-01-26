package dp;

import java.io.*;
import java.util.*;

public class Fibonacci_one {
    static int fib_recur(int n) {
        if (n == 1 || n ==2) {
            return 1;
        }
        else return (fib_recur(n-1) + fib_recur(n - 2));
    }

    static int[] f = new int[40];

    static int fib_repeat(int n) {
        f[1] = 1;
        f[2] = 1;
        for(int i = 3; i <= n; i++) {
            f[i] = f[i-1] + f[i-2];
        }

        return f[n];
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());

        System.out.println(fib_recur(n)+" "+fib_repeat(n));

    }
}
