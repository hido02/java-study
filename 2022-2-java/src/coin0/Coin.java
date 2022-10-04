package coin0;

import java.util.Scanner;

public class Coin {
    public static void main(String[] args) {
        int coinType;
        int price;
        int[] coins = new int[20];
        int coinCnt = 0;


        Scanner sc = new Scanner(System.in);
//		System.out.println("coinType");
        coinType = sc.nextInt();
//		System.out.println("price");
        price = sc.nextInt();

//		System.out.println("coinType: "+coinType);
//		System.out.println("price: "+price);

//		System.out.println("coins: ");

        for(int i = 0; i < coinType; i++)
        {
            coins[i] = sc.nextInt();
        }

//		for(int i = 0; i < coinType; i++)
//		{
//			System.out.println("coins["+i+"]: "+coins[i]+" ");
//		}

        for(int i = coinType - 1; i >= 0; i--)
        {
//			System.out.println("coins["+i+"]");
            if(price / coins[i] >= 1)
            {
//				System.out.println("coins: " + coins[i]);
                coinCnt = coinCnt + (price / coins[i]);
//				System.out.println("coinCnt: " + coinCnt);
                price = price % coins[i];
//				System.out.println("price: " + price);
            }

        }

        System.out.println(coinCnt);

    }
}
