package test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

class Main
{
    // `BufferedReader` 클래스를 사용하여 Java에서 여러 줄 입력 읽기
    public static void main(String[] args)
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String line;
        try {
            while ((line = br.readLine()) != null)
            {
                String[] tokens = line.split("\\s");
                System.out.println(Arrays.toString(tokens));
            }
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
