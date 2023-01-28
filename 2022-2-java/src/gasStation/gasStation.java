package gasStation;

import java.util.Scanner;

public class gasStation {

    public static void main(String[] args) {
        int cityCnt; // 도시의 개수(2<=n<=100,000)
        int[] cityDis = new int[100000]; // 도시 사이의 거리
        int[] cityCost = new int[10000]; // 도시별 리터당 가격
        int[] results = new int[10000]; // 경우의 수

        Scanner sc = new Scanner(System.in);
        System.out.println("도시의 개수");
        cityCnt = sc.nextInt();

        System.out.println("도시 사이의 거리");
        for(int i = 0; i < cityCnt - 1; i++) {
            cityDis[i] = sc.nextInt();
        }

        System.out.println("도시별 리터당 가격");
        for(int i = 0; i < cityCnt - 1; i++) {
            cityCost[i] = sc.nextInt();
        }

        for(int i = 0; i < cityCnt; i++)
        {
            System.out.println("cityCnt["+i+"]: "+cityDis[i]+" ");
        }

        for(int i = 0; i < cityCnt; i++)
        {
            System.out.println("cityCost["+i+"]: "+cityCost[i]+" ");
        }

        // cost[0] - cost[1]로 가는 경우

        // cost[0] - cost[2]로 가는 경우

        // cost[0] - cost[3]로 가는 경우

        for(int i = 0; i < cityCnt; i++) {
            results[i] = cityCost[i] * cityDis[i] + cityCost[i + 1] * cityDis[i + 1] + cityCost[i + 2] + cityDis[i + 2];
//            for(int j = )
//                result[i] =

        }


    }

}
