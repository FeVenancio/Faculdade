import javax.management.RuntimeErrorException;

public class QueueArrayLinear {
    
    private int queue[];
    private int capacity;
    private int rear;
    private int front;

    public QueueArrayLinear(int capacity) {
        this.queue = new int[capacity];
        this.capacity = capacity;
        this.front = 0;
        this.rear = -1;
    }

    public boolean isEmpty() { // esta vazia ?
        return front > rear; // true / false
    }

    public boolean isFull() {
        return rear == capacity - 1;
    }

    public void enqueue(int data) {
        if (isFull()) {
            throw new RuntimeException("Fila cheia");
        }

        rear++;
        queue[rear] = data;
    }

    public int dequeue() {
        if (isEmpty()) {
            throw new RuntimeException("Fila vazia");
        }

        int value = queue[front];
        front++;
        return value;
    }
}
