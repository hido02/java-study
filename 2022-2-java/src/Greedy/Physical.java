package Greedy;

public class Physical {
    public static int solution(int n, int[] lost, int[] reserve) {
        int answer = 0;

        // 여벌 체육복을 가져온 학생이 도난당한 경우
        for(int i = 0; i < lost.length; i++) {
            for(int j = 0; j < reserve.length; j++) {
                if(lost[i] == reserve[j]) {
                    answer++; // 여벌 체육복을 가져온 학생이 도난당했으므로 1개의 체육복을 가짐 -> 무조건 체육수업 들을 수 있음
                    // lost, reserve 배열에서 제외시킨다
                    lost[i] = -1;
                    reserve[i] = -1;
                    break;
                }
            }
        }

        // 여벌 체육복이 없고 도난당한 경우
        for(int i = 0; i < lost.length; i++) {
            for(int j = 0; j < reserve.length; j++) {
                if((lost[i]-1 == reserve[j]) || (lost[i]+1 == reserve[j])) { // 앞뒤로 빌려줄 수 있는 경우
                    answer++;
                    reserve[j] = -1; // 빌려줬으므로 reserve 배열에서 제외시킨다.
                    break;
                }
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        int[] lost = {2, 4};
        int[] reserve = {1, 3, 5};

        System.out.println(solution(5, lost, reserve));
    }
}
