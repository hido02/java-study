package BinarySearch;

public class repeat {
    private static int arr[] = { 0, 2, 4, 6, 8, 10, 12, 14, 16, 18 };

    static int binarySearch_repeat(int key, int start, int end) {
        int mid;

        while(start <= end) {
            mid = (start + end) / 2;

            if(key == arr[mid]) {
                return mid;
            }
            else if(key < arr[mid]) {
                end = mid - 1;
            }
            else {
                start = mid + 1;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        System.out.println("result: " + binarySearch_repeat(4, 0, 9));
    }
}
