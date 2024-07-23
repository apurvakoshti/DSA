class MyQueue {
    int front;
    int rear;
    int[] arr;
    int size;

    MyQueue(int n) {
        front = 0;
        rear = 0;
        arr = new int[n + 1];
        size = n + 1;
    }

    public void enqueue(int val) {
        if (isFull()) {
            System.out.println("Queue is full");
            return;
        }
        arr[rear] = val;
        rear = (rear + 1) % size;
    }

    public int dequeue() {
        if (isEmpty()) {
            return -1;
        }
        int result = arr[front];
        front = (front + 1) % size;
        return result;
    }

    public int peek() {
        if (isEmpty()) {
            return -1;
        }
        return arr[front];
    }

    public boolean isEmpty() {
        return front == rear;
    }

    public boolean isFull() {
        return (rear + 1) % size == front;
    }

    public void printQueue() {
        System.out.print("Queue: ");
        if (isEmpty()) {
            System.out.println("Empty");
            return;
        }
        int i = front;
        while (i != rear) {
            System.out.print(arr[i] + " ");
            i = (i + 1) % size;
        }
        System.out.println();
    }
}

public class circularqueueusingarray {
    public static void main(String[] args) {
        MyQueue q = new MyQueue(5);

        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);
        q.enqueue(4);
        q.enqueue(5); 

        q.printQueue(); 
        System.out.println(q.dequeue()); 
        q.enqueue(6); 
        q.printQueue(); 

        System.out.println(q.peek()); 
        System.out.println(q.isFull()); 
        System.out.println(q.dequeue()); 
        System.out.println(q.isEmpty()); 
        q.printQueue(); 
    }
}
