package dp.SumOfN;
import java.util.*;

class Solution {

    public void unionset(Set<Integer> union, Set<Integer> a, Set<Integer> b) {
        for (int n1 : a) {     // 순서쌍 a에 b 합치기
            for (int n2 : b) {
                union.add(n1 + n2); // 사칙연산
                union.add(n1 - n2);
                union.add(n1 * n2);
                if(n2 != 0)
                    union.add(n1 / n2);
            }
        }
    }
    public int solution(int N, int number) {
        List<Set<Integer>> setList = new ArrayList<>(); // Set 선언

        for(int i = 0; i < 9; i++) // 0부터 8까지
            setList.add(new HashSet<>()); // 개수 별 해쉬셋
        setList.get(1).add(N); // 1개로 만들 수 있는 건 나 자신뿐
        if (number == N)
            return 1;
        for(int i = 2; i < 9; i++) {
            for (int j = 1; j <= i / 2; j++) {
                unionset(setList.get(i), setList.get(i - j), setList.get(j)); // (1+2)
                // unionSet: N이 3인 경우 (1+2)(2+1)을 해주어 1번 박스와 2번 박스를 사칙연산한 결과를 넣어줌
                // 박스인 Set을 List에 담아 8개의 Set(박스)가 담긴 리스트를 만들어 로직ㅇ르 수행
                unionset(setList.get(i), setList.get(j), setList.get(i-j)); // (2+1)
            }
            String n = Integer.toString(N);
            setList.get(i).add(Integer.parseInt(n.repeat(i))); // 연속된 숫자 넣기 ex) 555 ...
            for (int num : setList.get(i)) // setList에서 인덱스별로 객체를 꺼내서 num에 입력
                if (num == number)
                    return i;
        }
        return -1;
    }
}

