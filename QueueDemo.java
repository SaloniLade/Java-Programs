class Queue {

    int arr[] = new int[5];
    int front = 0, rear = -1;

    void enqueue(int value) {
        if (rear == arr.length - 1)
            System.out.println("Queue Overflow");
        else {
            arr[++rear] = value;
            System.out.println(value + " inserted into Queue");
        }
    }

    void dequeue() {
        if (front > rear)
            System.out.println("Queue Underflow");
        else
            System.out.println(arr[front++] + " removed from Queue");
    }
}

public class QueueDemo {

    public static void main(String[] args) {

        Queue q = new Queue();

        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);

        q.dequeue();
        q.dequeue();
        q.dequeue();

        q.dequeue();  
    }
}

