package Exam;

import java.util.Scanner;

class Solution {
    static int max;
    public static int[] solution(int[] answers) {

        int[] per1Answer = { 1, 2, 3, 4, 5 }; // 사람별 찍은 답 배열
        int[] per2Answer = { 2, 1, 2, 3, 2, 4, 2, 5};
        int[] per3Answer = { 3, 3, 1, 1, 2, 2, 4, 4, 5, 5 };

        int per1Cnt = 0, per2Cnt = 0, per3Cnt = 0;

        for (int i = 0; i < answers.length; i++) {
            if (answers[i] == per1Answer[i % per1Answer.length]) {
                per1Cnt++;
            }
            if (answers[i] == per2Answer[i % per2Answer.length]) {
                per2Cnt++;
            }
            if (answers[i] == per3Answer[i % per3Answer.length]) {
                per3Cnt++;
            }
        }

        max = per1Cnt;

        if (per2Cnt > max) {
            max = per2Cnt;
        }
        else { // per2Cnt < max
            if (per3Cnt > max) {
                max = per3Cnt;
            }
        }

        int[] answer = {}; // 가장 많은 문제를 맞힌 사람-1/2/3번

        return answer;

    }

    public static void main(String[] args) {
        int[] returnAnswer = {};
        int[] answers = {};

        System.out.println("answers input");
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            answers[i] = sc.nextInt();
        }

        returnAnswer = solution(answers);

        System.out.println("max: "+max);

    }
}
