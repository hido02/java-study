package BruteForce;

import java.util.stream.Stream;

public class FindPrime {
    public int solution(String numbers) {
        int answer = 0;

        int[] digits = Stream.of(numbers.split("")).mapToInt(Integer::parseInt).toArray();

        int[][] makeNum = new int[100][100];

        for(int i = 1; i <= digits.length; i++) {
            for(int j = 1; j <= (digits.length * i); j++) {
                makeNum[i][j] = (10 * i) * digits[j-1]; //
            }
        }


        return answer;
    }

    public static void main(String[] args) {

    }
}
