package week10;

public class PassengerQueue {
    int max, size, front, rear;
    Passenger[] Q;

    PassengerQueue(int max) {
        this.max = max;
        Create();
    }

    void Create() {
        Q = new Passenger[max];
        size = 0;
        front = rear = -1;
    }

    boolean IsEmpty() {
        return (size == 0);
    }

    boolean IsFull() {
        return (size == max);
    }

    void clear() {
        if (IsEmpty())
            System.out.println("Queue is Empty");
        else {
            front = rear = -1;
            size = 0;
            System.out.println("Queue is cleared");            
        }
    }

    void Enqueue(Passenger data) {
        if (IsFull()) {
            System.out.println("Queue is Full");
        } else {
            if (IsEmpty()) {
                front = rear = 0;
            } else {
                if (rear == max - 1) {
                    rear = 0;
                } else {
                    rear++;
                }
            }
            Q[rear] = data;
            size++;
        }
    }

    Passenger Dequeue() {
        Passenger data = new Passenger("", "", "", 0, 0);
        if (IsEmpty()) {
            System.out.println("Queue is Empty");
        } else {
            data = Q[front];
            size--;
            if (IsEmpty()) {
                front = rear = -1;
            } else {
                if (front == max - 1) {
                    front = 0;
                } else {
                    front++;
                }
            }
        }
        return data;
    }
    void peek() {
        if (IsEmpty()) {
            System.out.println("Queue is Empty");
        } else {
            System.out.println("The first element: " + Q[front].name + " " + Q[front].cityOrigin + " "
                    + Q[front].cityDestination + " " + Q[front].ticketAmount + " " + Q[front].price);
        }
    }

    void print() {
        if (IsEmpty())
            System.out.println("Queue is Empty");
        else {
            int i = front;
            while (i != rear) {
                System.out.println(Q[i].name + " " + Q[i].cityOrigin + " " + Q[i].cityDestination + " " + Q[i].ticketAmount
                        + " " + Q[i].price);
                i = (i + 1) % max;
            }
            System.out.println(Q[i] + " ");
            System.out.println("Element amount: " + size);
        }
    }

    void peekRear() {
        if (IsEmpty()) {
            System.out.println("Queue is Empty");
        } else {
            System.out.println("The last element: " + Q[rear].name + " " + Q[rear].cityOrigin + " "
                    + Q[rear].cityDestination + " " + Q[rear].ticketAmount + " " + Q[rear].price);
        }
    }

}
