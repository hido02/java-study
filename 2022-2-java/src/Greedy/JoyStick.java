package Greedy;

public class JoyStick {
    public static int solution(String name) {
            int answer = 0;

            int sub[] = new int[20];

            int cnt = 0;

                if(name.length() > 1) {
                    for(int i = 0; i < name.length(); i++) {
                        System.out.println("<"+i+"번째 글자>");
                        System.out.println("현재 cnt: "+cnt);
                        if(cnt == name.length()) {
                            break;
                        }
                        sub[i] = name.charAt(i) - 'A';
                        answer += sub[i];
                        answer++;
                        System.out.println("현재 answer: "+answer);
                        cnt++;
                    }
                }


            return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution("JAN"));
    }
}
