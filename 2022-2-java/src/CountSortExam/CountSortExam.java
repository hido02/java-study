package CountSortExam;

public class CountSortExam {

    public static void main(String args[]){

        //모든 원소의 값이 0보다 크거나 같다고 가정
        int arr[] = {7, 5 , 9, 0, 3, 1, 6, 2, 9, 1, 4, 8, 0, 5, 2};
        int sortArr[] = new int[20];

        //모든 범위를 포함하는 리스트 선언(모든 값은 0으로 초기화, int는 기본적으로 0으로 초기호)
        int []count = new int [arr.length];

        for (int i = 0; i < count.length; i++) {
            count[arr[i]] += 1; //각 데이터에 해당하는 인덱스의 값 증가
        }

        for (int i = 0; i < count.length; i++) { //배열에 기록된 정렬 정보 확인
            for (int j = 0; j < count[i]; j++) {
                System.out.printf("%d ", i); // 등작한 횟수만큼 인덱스 출력
                sortArr[j] = i;
            }
        }

        for(int i = 0; i < sortArr.length; i++) {
            System.out.println(sortArr[i] + "\t");
        }
    }
}