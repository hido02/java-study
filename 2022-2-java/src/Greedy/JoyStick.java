package Greedy;

public class JoyStick {
    public static int solution(String name) {
        int answer = 0;

        int index; // 다음 값이 A인지 확인
        int move = name.length() - 1; // 좌우 움직임 수 체크

        // 상하 조작
        for(int i = 0; i < name.length(); i++) {
            answer += Math.min((name.charAt(i) - 'A'), (name.charAt(i) - 'Z' + 1));
            // A부터: 상 Z부터: 하
            index = i + 1;
            // 연속되는 A 갯수 확인
            while(index < name.length() && name.charAt(index) == 'A') {
                index++; // A 갯수 증가 =
            }

            // 순서대로 가는 것과 뒤로 돌아가는 것 중 이동수가 적은 것을 선택
            move = Math.min(move, i * 2 + name.length() - index);

        }


        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution("JAZ"));
    }
}
