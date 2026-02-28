class Stack {

    int arr[] = new int[5];
    int top = -1;

    void push(int value) {
        if (top == arr.length - 1)
            System.out.println("Stack Overflow");
        else {
            arr[++top] = value;
            System.out.println(value + " pushed");
        }
    }

    void pop() {
        if (top == -1)
            System.out.println("Stack Underflow");
        else
            System.out.println(arr[top--] + " popped");
    }
}

public class StackDemo {

    public static void main(String[] args) {

        Stack s = new Stack();

        s.push(10);
        s.push(20);
        s.push(30);
        s.push(40);
        s.push(50);

        s.push(60);   

        s.pop();
        s.pop();
        s.pop();
        s.pop();
        s.pop();

        s.pop();     
    }
}
