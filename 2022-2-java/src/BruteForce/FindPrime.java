//package BruteForce;
//
//import java.util.stream.Stream;
//
//public class FindPrime {
//    static int[] perm(int[] arr, int[] output, boolean[] visited, int depth, int n, int r) {
//        if (depth == r) {
//            return output;
//        }
//
//        for (int i=0; i<n; i++) {
//            if (visited[i] != true) {
//                visited[i] = true;
//                output[depth] = arr[i];
//                perm(arr, output, visited, depth + 1, n, r);
//                output[depth] = 0; // 이 줄은 없어도 됨
//                visited[i] = false;;
//            }
//        }
//        return arr;
//    }
//
//    public int solution(String numbers) {
//        int answer = 0;
//
//        int[] digits = Stream.of(numbers.split("")).mapToInt(Integer::parseInt).toArray();
//
//        int[] per = new int[100];
//
//        for(int i = 1; i <= digits.length; i++) {
//            per += perm
//        }
//
//
//        return answer;
//    }
//
//    public static void main(String[] args) {
//
//    }
//}
