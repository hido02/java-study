package lv2.BehindBig;

import java.util.Arrays;
import java.util.Stack;

public class Solution {
    public int[] solution(int[] numbers) {
        int[] answer = new int[numbers.length];

        Arrays.fill(answer, -1); // -1로 초기화

        Stack<int[]> stack = new Stack<>(); // 스택 생성
        stack.push(new int[] {numbers[0], 0});

        for(int i = 1; i < numbers.length; i++) {
            int num = numbers[i];

            while (!stack.isEmpty() && stack.peek()[0] < num) {
                int[] pop = stack.pop(); // numbers를 순회하면서 stack에 담겨 있는 숫자가 numbers보다 작으면 해당 숫자를 pop 시키고
                answer[pop[1]] = num;
            }

            stack.push(new int[]{num, i}); // 크면 stack 순회를 멈추고 numbers[i]를 저장한다.
        }

        return answer;
    }
}
