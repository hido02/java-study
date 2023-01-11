package MovieGrade;

import java.util.Scanner;

public class MovieGrade {
    public static void main(String[] args) {
        int N, L, H;
        int[] grades = new int[50];
        int finalGrade;

        System.out.println("input");
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        L = sc.nextInt();
        H = sc.nextInt();

        for(int i = 0; i < N; i++) {
            grades[i] = sc.nextInt();
        }

        // 계수 정렬
        int[] counting = new int[100]; // 수의 범위
        int[] result = new int[50]; // 정렬될 배열

        // 과정 1
        for(int i = 0; i < grades.length; i++) {
            // arr의 value 값을 인덱스로 하는 counting 배열의 값 1 증가
            counting[grades[i]]++;
        }

        // 과정 2
        for(int i = 1; i < counting.length; i++) {
            // 누적 합
            counting[i] += counting[i - 1];
        }

        // 과정 3
        for(int i = grades.length - 1; i >= 0; i--) {
//            i번째 원소를 인덱스로 하는 counting 배열을 1 감소시킨 뒤
//            counting 배열의 값을 인덱스로 하여, result에 value 값을 저장한다.
            int value = grades[i];
            counting[value]--;
            result[counting[value]] = value;
        }

        // 정렬된 배열
        System.out.println("result[]");
        for(int i = 0; i < result.length; i++) {
            if(i % 10 == 0) System.out.println();
            System.out.print(result[i] + "\t");
        }
        System.out.println();

        int start = 0;

        for(int i = 0; i < result.length; i++) {
            if(result[i] > 0) {
                start = i;
                break;
            }
        }

        for(int i = start; i < start+L; i++) {
            result[i] = 0;
        }

        for(int i = result.length - 1; i > result.length-H-1; i--) {
            result[i] = 0;
        }

        // 정렬된 배열
        System.out.println("result[]");
        for(int i = 0; i < result.length; i++) {
            if(i % 10 == 0) System.out.println();
            System.out.print(result[i] + "\t");
        }
        System.out.println();

        int sum = 0;
        for(int i = 0; i < result.length; i++) {
            sum += result[i];
        }
        double avg;
        avg = (double) sum / (N - L - H);

        System.out.println("output: "+avg);

    }
}
