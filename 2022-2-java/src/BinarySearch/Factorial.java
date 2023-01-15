package BinarySearch;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class Factorial {
    public static int fact(int n) {

        if (n <= 1)
            return n;

        else
            return fact(n-1) * n;
    }

    public static void main(String[] args) {
        int m;
        Scanner sc = new Scanner(System.in);
        m = sc.nextInt();

        int num;
        LinkedList<Integer> stack = new LinkedList<Integer>();
        
        int cnt = 0;
        int result = 0;

        for(int i = 1; i < 100; i++) {
            num = fact(i);
            System.out.println("fact("+i+"): "+num);
            while(num > 0) {
                stack.push(num % 10);
                num = num / 10;
            }
            while ((!stack.isEmpty())) {
                if(stack.pop() == 0) {
                    cnt++;
                }
            }
            System.out.println("cnt: "+cnt);
            if(cnt == m) {
                result = i;
                break;
            }
            System.out.println();
        }
        System.out.println(result);
    }
}
