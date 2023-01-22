package dp;

import java.io.*;
import java.util.*;

public class Apart {
    private static int f(int k, int n) {
        if(n ==0)
            return 0;
        else if(k == 0)
            return n;
        else
            return f(k, n-1) + f(k-1, n);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int t = Integer.parseInt(br.readLine());

        for (int i = 0; i < t; i++) {
            int k = Integer.parseInt(br.readLine());
            int n = Integer.parseInt(br.readLine());

            sb.append(f(k, n)).append("\n");
        }

        System.out.println(sb);

    }
    }

