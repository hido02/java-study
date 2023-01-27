package dp;

import java.io.*;

public class Apart_recur {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int cnt = Integer.parseInt(br.readLine());

        // cnt만큼 반복
        for(int i = 0; i < cnt; i++) {
            int k = Integer.parseInt(br.readLine());
            int n = Integer.parseInt(br.readLine());

            sb.append(PeopleNumber(k, n)).append("\n");
        }
    }

    static int PeopleNumber(int k, int n) {
        if(n == 0) { // 호수가 0
            return 0;
        }
        else if(k == 0) { // 0층
            return n;
        }
        else {
            return PeopleNumber(k, n-1) + PeopleNumber(k-1, n);
        }
    }
}
