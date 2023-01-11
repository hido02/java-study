package sort;

public class rank {
    public static void main(String[] args) {
        // 순위 알고리즘(Rank Algorithm)
        // 주어진 범위 데이터의 순위를 구하기
        int[] arr = {100, 92, 87, 91, 10, 40}; // 점수
        int[] rankArr = {1, 1, 1, 1, 1, 1}; // 각 점수별 순위(1로 초기화)

        for(int i = 0; i<arr.length; i++) {
            rankArr[i] = 1; // 순위 배열을 for 돌때마다 1등으로 초기화
            for(int j = 0; j<arr.length; j++) { // 배열 i 인덱스의 점수와 나머지 점수 비교
                if(arr[i] < arr[j]) { // i 인덱스의 값보다 크다면
                    rankArr[i] = rankArr[i] + 1; // 순위 증가
                }
            }
        }

        for(int i = 0; i < arr.length; i++) {
            rankArr[i] = arr.length - rankArr[i];
        }

        for(int i = 0; i<arr.length; i++) {
            System.out.println("score : " + arr[i] + " rank : " + rankArr[i] );
        }
    }
}
