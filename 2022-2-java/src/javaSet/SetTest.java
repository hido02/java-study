package javaSet;

import java.util.*;

public class SetTest {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<String>(); // set 선언

        set.add("a");
        set.add("b");
        set.add("b"); // set에 중복값 저장 불가
        set.add("c"); // set에 값 담기

        System.out.println("set 크기 확인: " + set.size());

        Iterator<String> iter = set.iterator(); // set을 Iterator 안에 담기
        while(iter.hasNext()) { // iter에 다음 값이 있다면
            System.out.println("iterator: "+iter.next()); // iter에서 값 꺼내기
        }

        // set은 중복값을 허용하지 않기 때문에
        // b를 1번 넣건 200번 넣건 동일한 값은 하나만 들어가게 된다

        // 삽입 시 순서가 없기 때문에
        // 배열이나 List처럼 .get(인덱스)로 값을 가져올 수 없고

        // Iterator를 통해 가져와야 하는데
        // set.iterator()로 set 값을 iterator에 담은 후
        // .next를 통해 하나씩 뽑아내는 식

        // 순서가 없다고 했는데
        // 100% 보장하지 않을 뿐
        // 대부분의 경우에는 넣은 값의 HashCode 값에 따라 순서가 정해져 나오게 된다
    }
}
