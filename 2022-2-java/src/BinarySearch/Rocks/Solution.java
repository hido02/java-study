package BinarySearch.Rocks;

import java.util.*;

class Solution {
    public long solution(int distance, int[] rocks, int n) {
        // distance: 출발지점부터 도착까지의 거리
        // rocks[]: 바위들이 있는 위치
        // n: 제거할 바위의 수

        int answer = 0;


        int start = 0, end = distance;

        Arrays.sort(rocks);

        int mid;

        while(start <= end) {
            mid = (start + end) / 2;
            int removeRocks = 0;
            int prev = 0; // 이전 바위: 초기값은 시작 지점

            for(int i = 0; i < rocks.length; i++) {
                if (rocks[i] - prev < mid) // 현재 바위에서 이전 바위까지의 거리가 mid(지점 간 최소 거리)보다 작다면
                    removeRocks++; // 제거해야 할 바위의 개수 증가
                else // mid보다 크다면
                    prev = rocks[i]; // 현재 바위가 다음 탐색의 이전 바위가 된다
            }

            // 도착지점부터 마지막 바위
            if(distance - rocks[rocks.length-1] < mid) // 도착지점부터 마지막 바위의 거리가 mid보다 작다면
                removeRocks++; // 제거 바위 증가

            if(removeRocks <= n) { // 제거되어야 할 바위 수가 문제에서 주어진 제거해야하는 바위 수보다 작다면
                answer = mid; // 현재 mid가 정답이 되고
                // 정답: 바위를 n개 제거한 뒤 각 지점 사이의 거리의 최소값 중에 가장 큰 값 mid: 각 지점 사이의 거리
                start = mid + 1;
            }
            else // 제거되어야 할 바위 수가 문제에서 주어진 제거해야 하는 바위 수보다 크다면
                end = mid - 1; // 범위를 start-(mid-1)로 줄여서 재탐색
        }


        return answer; // 바위를 n개 제거한 뒤 각 지점 사의의 거리의 최소값 중에 가장 큰 값
    }
}
