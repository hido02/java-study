package Immigration;

import java.util.Arrays;
import java.util.stream.IntStream;

class Main {
        public static long solution(int n, int[] times) {
            long answer = 0;

            int[] arr = IntStream.rangeClosed(times[0], times[times.length-1]).toArray();

            binarySearch_recursion(Math.min(answer, ), times[0], times[times.length-1]);

            return answer;
        }

    static int binarySearch_recursion(int key, int start, int end) {
        int mid;

        if(start <= end) {
            mid = (start + end) / 2;

            if(key == arr[mid]) {
                return mid;
            }
            else if(key < arr[mid]) {
                // 오른쪽 부분 버림. 왼쪽 부분 arr[0]부터 arr[mid-1]까지의 탐색
                return binarySearch_recursion(key, start, mid-1);
            }
            else {
                // 왼쪽 부분 버림. 오른쪽 부분 arr[mid+1]부터 arr[end]까지의 탐색
                return binarySearch_recursion(key, mid+1, end);
            }

        }

        return -1;
    }



    public static void main(String[] args) {
        int times[] = {7, 10};
        System.out.println(solution(6, times));
    }
}
