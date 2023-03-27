package Immigration;

import java.util.*;

class Solution {
    public long solution(int n, int[] times) {
        Arrays.sort(times);
        return BinarySearch(times,n,times[times.length - 1]);
    }

    long BinarySearch(int[] times, int n, long max){
        long left = 1, right = max * n; // 최소 1분부터 가장 오래 걸리는 입국 심사 시간(times[times.length-1], 예시에서 10분)까지 탐색
        long mid = 0;
        long ans = Long.MAX_VALUE; // 가장 큰 값을 사용한 이유는 후에 바뀔 수도 있어서

        while (left <= right){ // 이진탐색
            mid = (left+right)/2;

            if (isPassed(times,n,mid)){ // isPassed: mid 시간 동안 n명이 심사받을 수 있는지 확인
                ans = ans > mid ? mid : ans;
                right = mid - 1;
            }else{
                left = mid + 1;
            }
        }
        return ans;
    }

    boolean isPassed(int[] times, int n, long mid){
        long amount = 0; // 심사를 받은 사람 수

        for(int i = 0; i < times.length; ++i){
            amount += mid / times[i]; // mid값을 times로 나눠준다
            // 예시
            // mid: 30분 times[i]: 7분
            // 30분 안에 7분이 몇번 수행될 수 있는지
            // 30분 (7, 14, 21, 28) -> amount: 4

            // mid: 30분 times[i]: 7분 n: 10명이라면
            // 7-1명 14-1명 21-
        }
        if (amount>=n) return true;
        else return false;
    }
}
