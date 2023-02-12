package Greedy;

public class Physical {
    public static int solution(int n, int[] lost, int[] reserve) {
        int answer = 0;

        int[] clothes = new int[n];

        for(int i = 0; i < lost.length; i++) {
            for(int j = 0; j < reserve.length; j++) {
                if(lost[i] == reserve[j]) { // 여벌 체육복을 가져온 학생이 도난당한 경우
                    clothes[i] = 1;
                }
                clothes[i] = lost[i];
                if(reserve[i] == i+1) {
                    clothes[i] = 2;
                }
            }
        }

        for(int i = 0; i < n; i++) {
            System.out.println(clothes[i]);
        }
        System.out.println();

        return answer;
    }

    public static void main(String[] args) {
        int[] lost = {2, 4};
        int[] reserve = {1, 3, 5};

        System.out.println(solution(5, lost, reserve));
    }
}
