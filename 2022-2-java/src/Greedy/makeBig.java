package Greedy;

import java.util.Arrays;
import java.util.stream.Stream;

public class makeBig {
    public static String solution(String number, int k) {
        String answer = "";

        int length = number.length();

        int[] digits = Stream.of(number.split("")).mapToInt(Integer::parseInt).toArray();

        int remain = length - k;

        int answerArr[] = new int[length - k];

        for(int i = 0; i <= length - k; i++) {
            if(i == 0) {
                int max = 0;
                for(int j = 0; j <= length - remain; j++) {
                    if(digits[j] > max) {
                        max = digits[j];
                    }
                }
                answerArr[i] = max;
            }
            else {
                int max = 0;
                for(int j = answerArr[i-1]; j <= length - remain; j++) {
                    if(digits[j] > max) {
                        max = digits[j];
                    }
                }
                answerArr[i] = max;
            }
            remain--;
        }

        System.out.println(Arrays.toString(answerArr));

        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution("1924", 2));
    }
}
