public class QueueArrayCircular {
    
    private String queue[];
    private int front;
    private int rear;
    private int size;
    private int capacity;

    public QueueArrayCircular(int capacity) {
        this.queue = new String[capacity];
        this.capacity = capacity;
        this.size = 0;
        this.front = 0;
        this.rear = -1;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return capacity == size;
    }

    public void enqueue(String data) {
        if (isFull()) {
            throw new RuntimeException("Fila cheia");
        }
        
        rear = (rear + 1) % capacity;
        queue[rear] = data;
        size++;
    }

    public String dequeue() {
        if (isEmpty()) {
            throw new RuntimeException("Fila vazia");
        }

        String value = queue[front];
        front = (front + 1) % capacity;
        size--;
        return value;
    }
}