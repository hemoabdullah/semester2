package week8;

public class StackBook {
    int size, top;
    Book data[];

    StackBook(int size) {
        this.size = size;
        data = new Book[size];
        top = -1;
    }

    boolean isEmpty() {
        return top == -1;
    }

    boolean isFull() {
        return top == size - 1;
    }

    void push(Book dt) {
        if (isFull()) {
            System.out.println("Stack is full");
            return;
        }
        top++;
        data[top] = dt;
    }

    void pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return;
        }
        System.out.println("Remove data: " + data[top].title + " | " + data[top].authorName + " | "
                + data[top].publishedYear + " | " + data[top].pageAmount + " | " + data[top].price);
        top--;

    }

    void peek() {
        System.out.println("Top element: " + data[top].title);
    }

    void print() {
        System.out.println("Stack contents:");
        for (int i = top; i >= 0; i--) {
            System.out.println(data[i].title + " | " + data[i].authorName + " | " + data[i].publishedYear
                    + " | " + data[i].pageAmount + " | " + data[i].price);
        }
        System.out.println("");
    }

    void clear() {
        top = -1;
    }
}