package sort;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {

        int []arr = {7, 5, 9, 0, 3, 1, 6, 2, 4, 8};

        int minIndex = 0; //가장 적은 원소의 인덱스

        for(int i=0; i < arr.length; i++){
            for(int j=i+1 ; j < arr.length; j++){
                if(arr[minIndex] > arr[j])
                    minIndex = j;
            }

            //스와프
            int tmp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = tmp;
        }
        for(int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]+"\t");
        }
        System.out.println(Arrays.toString(arr));
    }
}
