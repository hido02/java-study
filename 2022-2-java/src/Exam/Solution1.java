//package Exam;
//
//class Solution1 {
//    public int[] solution(int[] answers) { // 실제 정답
//        int[] answer = {1,2,3,4,5};
//
//        return answer;
//    }
//
//
//    int[] perAnswer = {}; // 사람 별 찍은 답 배열
//
//    for (int i = 1; i <= 3; i++) { // 사람
//        for (int j = i; j <= 5; j++) { // 5번까지 있으니까
//            perAnswer[i] = {j}; // 넣는거 이거 어떻게 하는거지?? j j+1 j+2 ... 5
//        }
//    }
//
//
//    int[] perAllAnswer = {}; // 사람 별 총 문제의 실제 정답
//
//    for (int i = 1, j = 1 ; i <= 10000, j <= 5 ; i++, j++) {
//        perAllAnswer[i] = perAnswer[j]; // ??
//    }
//
//
//    int[] perCnt = {}; // 사람 별 맞춘 개수 ?
//
//    // answer와 perAnswer 비교
//
//    for (int i = 1; i <= 3; i++) { // 사람
//        for (int j = 1; j <= 10000; j++) { // 문제
//            if (answer[i] == perAnswer[i]) { // answer == perAnswer: 맞혔음
//                perCnt[i]++; // 그 사람의 맞춘 개수를 증가
//            }
//        }
//    }
//
//    int max = perCnt[1];
//
//    for (int i = 1; i < 3; i++) {
//        if (perCnt[i] > max) {
//            max = perCnt[i];
//        }
//    }
//
//    Sys
//
//
//}
