package BinarySearch;

import java.util.Scanner;

public class Stock2 {
    static int binary(int left, int right, int target, int[] lis) {
        while (left <= right) {
            int mid = (left + right) / 2;
            if (lis[mid] < target) {
                left = mid + 1;
            }
            else {
                right = mid - 1;
            }
        }

        return left;
    }
    public static void main(String[] args) {
        int t;
        Scanner sc = new Scanner(System.in);
        t = sc.nextInt();

        int n[] = new int[100];
        int k[] = new int[100];
        int stock[][] = new int[100][100];
        int lis[] = new int[100];

        for(int i = 0; i < t; i++) {
            n[i] = sc.nextInt();
            k[i] = sc.nextInt();

            for(int j = 0; j < n[i]; j++) {
                stock[i][j] = sc.nextInt();
            }

            lis[i] = stock[i][0];

            for(int j = 0; j < n[i]; j++) {
                if (lis[0] < stock[i][j]) {
                    lis[i] = stock[i][j];
                }
                else {
                    int cnt = binary(0, lis.length, stock[i][j], lis);
                    lis[cnt] = stock[i][j];
                }
            }

            System.out.println("Case #"+(i+1));
            if (lis.length >= k[i]) {
                System.out.println(1);
            }
            else {
                System.out.println(0);
            }
        }
    }
}
