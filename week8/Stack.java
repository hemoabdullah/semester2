package week8;
public class Stack {
  int size, top, data[];

    Stack(int size) {
        this.size = size;
        data = new int[size];
        top = -1;
    }

    boolean isEmpty() {
        return top == -1;
    }

    boolean isFull() {
        return top == size - 1;
    }

    void push(int item) {
        if (isFull()) {
            System.out.println("Stack is full");
            return;
        }
        top++;
        data[top] = item;
    }

    void pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return;
        }
        System.out.println("Remove data: " + data[top]);
        top--;
        
    }

    void peek() {
        System.out.println("Top element: " + data[top]);
    }

    void print() {
        System.out.println("Stack contents:");
        for (int i = top; i >= 0; i--) {
            System.out.println(data[i] + " ");
        }
        System.out.println("");
    }

    void clear() {
        top = -1;
    }
}