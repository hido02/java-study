package BinarySearch;

public class recursion {
    private static int arr[] = { 0, 2, 4, 6, 8, 10, 12, 14, 16, 18 };

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
        System.out.println("result: " + binarySearch_recursion(4, 0, 9));
    }
}
