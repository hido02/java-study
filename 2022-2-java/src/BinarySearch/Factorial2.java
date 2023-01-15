package BinarySearch;

import java.io.*;
import java.util.*;

public class Factorial2 {
    static int find_right_zeros(int mid) {
        int zeros = 0;
        while (mid >= 5) {
            zeros += (mid / 5);
            mid = mid / 5;
        }

        return zeros;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int m = Integer.parseInt(st.nextToken());

        int left = 1, right = m * 5, result = 0;

        while (left <= right) {
            int mid = (left + right) / 2;

            int zero_cnt = find_right_zeros(mid);

            if (zero_cnt < m) {
                left = mid + 1;
            }
            else {
                right = mid - 1;
                result = mid;
            }
        }

        if(find_right_zeros(result) == m) {
            System.out.println(result);
        }
        else {
            System.out.println(-1);
        }

    }

}
