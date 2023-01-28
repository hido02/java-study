package dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class phoneNum {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        String str1 = bf.readLine();
        String str2 = bf.readLine();

        String[] arr1 = str1.split("");
        String[] arr2 = str2.split("");

        String[] arr3 = new String[16];

        for(int i = 0; i < 8; i++) {
            arr3[2*i] = arr1[i];
            arr3[2*i+1] = arr2[i];
        }

//        for(String str : arr3) {
//            System.out.println(str);
//        }

        while(arr3.length != 2) {
            for(int i = 0; i < arr3.length; i++) {
                arr3[0] = arr3[2*i] + arr3[2*i+1];
            }
        }
    }
}
