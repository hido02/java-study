package sort;

public class removeDuplicateElements {
    public static int removeDuplicateElements(Integer arr[], int n){
        if (n==0 || n==1){
            return n;
        }

        Integer[] temp = new Integer[n];

        int j = 0;

        for (int i=0; i<n-1; i++){
            if (arr[i] != arr[i+1]){
                temp[j++] = arr[i];
            }
        }

        temp[j++] = arr[n-1];

        for (int i=0; i<j; i++){
            arr[i] = temp[i];
        }
        return j;
    }

    public static void main (String[] args) {
        Integer[] intArr = new Integer[] {10, 10, 20, 20, 20, 30, 30};
        int n = intArr.length;

        n = removeDuplicateElements(intArr, n);

        for (int i=0; i<n; i++)
            System.out.print(intArr[i] + " ");
    }
}
