package Greedy;

public class JoyStick {
    public static int solution(String name) {
        int answer = 0;

        int sub[] = new int[20];
        sub[0] = 'A';

        int fromLast[] = new int[20];

        int cnt = 1;

        System.out.println("name.length: "+name.length());

        if (name.length() > 1) {
            for (int i = 1; i < name.length(); i++) {
                System.out.println("<" + i + "번째 글자>");
                System.out.println("현재 cnt: " + cnt);
                if (cnt == name.length()) {
                    break;
                }
                sub[i] = name.charAt(i-1) - sub[i-1];
                System.out.println("현재 sub: " + sub[i]);
                if(cnt > 1) {
                    fromLast[i] = name.charAt(i-2) - name.charAt(i-1);
                }
                else {
                    fromLast[i] = 100;
                }
                System.out.println("framLast: " + fromLast[i]);
                answer += (sub[i] < fromLast[i]) ? sub[i] : fromLast[i];
                if (sub[i] > 0) {
                    answer++; // 커서 이동
                }
                System.out.println("현재 answer: " + answer);
                cnt++;
            }
        }


        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution("JAZ"));
    }
}
