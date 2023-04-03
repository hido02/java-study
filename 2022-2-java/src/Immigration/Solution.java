package Immigration;

import java.util.*;

class Solution {
    public long solution(int n, int[] times) {
        long answer = 0;

        Arrays.sort(times); // 가장 오래 걸리는 시간을 알아내기 위해 정렬

        long start = times[0]; // 사람이 1명일 때인 times[0]을 대입
        long end = (long)times[times.length-1]*(long)n; // 최대 시간 = 가장 오래 걸리는 시간 * 인원수

        long mid;
        long sum = 0;

        while(start <= end) { // 이진탐색
            mid = (start + end) / 2;
            sum = 0; // 시간이 mid일 때 심사관들이 심사해준 사람들의 합
            for(int time : times) {
                sum += mid / time; // 심사관마다 mid를 기준으로 심사할 수 있는 사람의 수의 합 (내가 모르는 부분: 왜 mid를 time으로 나누는지,,?)
            }

            if(sum >= n) { // 심사하는 사람의 수가 더 많거나 같으므로 시간을 줄일 수 있다
                answer = Math.min(answer, mid);
                end = mid - 1; // 범위 줄이기
            }
            else {
                start = mid + 1; // 범위 늘리기
            }
        }

        return answer;
    }
}
