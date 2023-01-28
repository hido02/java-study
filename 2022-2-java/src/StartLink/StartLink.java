package StartLink;

import java.util.Scanner;

public class StartLink {
    static int n; // 축구를 하기 위해 모인 사람의 수
    static int [][] s = new int[20][20]; // 능력치 s[ij]
    static boolean[] visit;
    static int min = Integer.MAX_VALUE;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("[test] 축구를 하기 위해 모인 사람의 수: ");
        n = sc.nextInt();
        System.out.println("[test] s[ij]: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                s[i][j] = sc.nextInt();
            }
//            System.out.println(System.lineSeparator());
        }

        System.out.println("[test] s[ij] 출력: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.println(s[i][j] + " ");
            }
            System.out.println();
        }

        visit = new boolean[n];

        combi(0, 0);

        System.out.println("정답: "+min);

        sc.close();
    }

    private static void diff() {     // 스타트와 링크 팀의 s 차이를 계산하는 함수
        int startS = 0;
        int linkS = 0;
        System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡdiff함수ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");

        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                // i와 j를 둘다 방문했다면 -> 스타트팀으로 점수 플러스
                System.out.println("[test] visit["+i+"]: "+visit[i]+" visit["+j+"]: "+visit[j]);
                if (visit[i] == true && visit[j] == true) {
                    System.out.println("스타트");
                    startS += s[i][j];
                    System.out.println("[test] s["+i+"]["+j+"]: "+s[i][j]);
                    startS += s[j][i];
                    System.out.println("[test] s["+j+"]["+i+"]: "+s[j][i]);
                }
                // i와 j 둘다 방문하지 않았다면 ->  링크팀으로 점수 플러스
                else if (visit[i] == false && visit[j] == false) {
                    System.out.println("링크");
                    linkS += s[i][j];
                    System.out.println("[test] s["+i+"]["+j+"]: "+s[i][j]);
                    linkS += s[j][i];
                    System.out.println("[test] s["+j+"]["+i+"]: "+s[j][i]);
                }
            }
        }

        int val = Math.abs(startS - linkS); // math abs: 절댓값

        if (val == 0) {
            min = val;
        }

        min = Math.min(val, min);
    }

    // cnt: 조합 개수(재귀 깊이) ?
    private static void combi(int idx, int cnt) { // ?
        if (cnt == n / 2) { // 조합 개수가 n/2라면 더 이상 조합하지 않음 ??
            // 방문한 팀과 방문하지 않은 팀을 각각 나누어
            // 각 팀의 점수를 구한 뒤 최솟값을 찾는다
            diff();
            return;
        }

        for (int i = idx; i < n; i++) {
            System.out.println("[test] 현재 인덱스: "+i+" 조합개수(재귀 깊이): "+cnt);
            System.out.println("[test] visit["+i+"]: "+visit[i]);
            if (!visit[i]) { // 방문하지 않았다면 다음 인덱스로 또 조합 ??
                visit[i] = true; // 현재 인덱스를 방문으로 변경
                System.out.println("[test] visit["+i+"]: "+visit[i]);
                System.out.println("[test] 다음 인덱스: "+(i + 1)+" 다음 조합개수(재귀 깊이): "+(cnt + 1));
                combi(i + 1, cnt + 1); // 다음 인덱스로 재귀
                visit[i] = false; // 재귀가 끝나면 비방문으로 변경
            }
        }
    }


}
