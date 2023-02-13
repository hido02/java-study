package Queue;

public class queue_linkedlist {
    private Node front = null; // 큐의 첫 번째 위치를 가리키는 변수
    private Node rear = null; // 큐에 삽입될 데이터의 위치를 가리키는 변수. 빈 큐를 나타내기 위해 -1로 초기화
    private Node peek = null; // 큐의 현재 값을 알기 위한 변수. front와 대응됨

    private class Node {
        private Object value;
        private Node next;

        Node(Object value) {
            this.value = value;
        }

        private Object getValue() {
            return this.value;
        }
    }

    public void enqueue(Object value) { // 데이터 삽입
        if (front == null) { // front가 null인 경우는 초기 큐를 생성할 때
            front = new Node(value); // 삽입할 데이터를 가진 노드를 생성
            // front와 peek, rear를 각각 할당
            peek = front;
            rear = front;
        } else { // 큐가 쌓여 있는 경우
            rear.next = new Node(value); // 삽입할 데이터를 가진 노드를 생성한 후
            rear = rear.next; // 큐의 꼬리 부분에 해당하는 rear의 next에 할당하여, rear가 다시 rear.next를 가리키도록 함
        }
    }

    public Object dequeue() {
        Object value = peek.getValue(); // 큐의 첫 번째 노드를 가리키고 있는 peek를 이용하여 데이터를 value 변수에 할당해준다.
        Node temp = front; // 사용한 노드를 제거하기 위해, 임시 노드를 생성하여 front와 같은 노드를 가리키도록 함

        front = front.next; // 다음 노드를 사용하기 위해 front가 front.next를 바라보도록 하고,
        peek = front; // peek도 front와 동일하도록 수정
        temp = null; // 사용한 노드를 제거

        return value; // value를 반환
    }
}
