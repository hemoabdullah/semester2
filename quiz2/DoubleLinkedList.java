package quiz2;

public class DoubleLinkedList {
    Node head;
    Node tail;
    int size;

    DoubleLinkedList() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    // 1. complete the missing code addLast
    /**
     * this method will add new node at the last
     */
    void addLast(int data) {
        Node newNode = new Node(data);
        if (tail == null) {
            head = tail = newNode;
        } else {
            tail.n = newNode;
            newNode.p = tail;
            tail = newNode;
        }
        size++;
    }

    // 2. complete the deleteLast
    /**
     * this method will remove tail
     */
    void deleteLast() {
        if (tail == null) {
            return;
        }
        if (head == tail) {
            head = tail = null;
        } else {
            tail = tail.p;
            tail.n = null;
        }
        size--;
    }

    // 3. complete the printFromTail
    /**
     * this method will print all data from tail to head
     */
    void printFromTail() {
        Node current = tail;
        while (current != null) {
            System.out.print(current.data);
            if (current.p != null) {
                System.out.print(" - ");
            }
            current = current.p;
        }
        System.out.println();
    }

    // 4. complete getPositionFromTail
    // and modify return 1
    /**
     * this method will return the position of data from last
     */
    int getPositionFromTail(int data) {
        Node current = tail;
        int position = 1;
        while (current != null) {
            if (current.data == data) {
                return position;
            }
            position++;
            current = current.p;
        }
        return -1; // Data not found
    }

    // 5. complete getLastPositionFromTail
    // and modify return 1
    /**
     * this method will return the last position where the data found
     * and the searching start from last
     */
    int getLastPositionFromTail(int data) {
        Node current = tail;
        int position = 1;
        int lastPosition = -1;
        while (current != null) {
            if (current.data == data) {
                lastPosition = position;
            }
            position++;
            current = current.p;
        }
        return lastPosition; // Data not found
    }

    // 6. complete getAverage
    /**
     * this method will return average from all data
     */
    double getAverage() {
        if (size == 0) {
            return 0;
        }
        Node current = head;
        int sum = 0;
        while (current != null) {
            sum += current.data;
            current = current.n;
        }
        return (double) sum / size;
    }

    // 7. complete the missing code getNodeByIndex
    /**
     * this method will return NODE at certain index 
     * you may use this method at sort() and getMedian()
     */
    Node getNodeByIndex(int index) {
        if (index < 0 || index >= size) {
            return null;
        }
        Node current = head;
        for (int i = 0; i < index; i++) {
            current = current.n;
        }
        return current;
    }

    // 8. complete getMedian 
    /**
     * this method will return median value
     * median is calculated by the following steps:
     * 1) sort the data in ascending mode
     * 2) if the size of data is odd, then median is the data at the middle
     * 3) if the size of data is even, then median is the average of 
     *    2 data at the middle
     */
    double getMedian() {
        if (size == 0) {
            return 0;
        }
        int[] values = new int[size];
        Node current = head;
        int index = 0;
        while (current != null) {
            values[index++] = current.data;
            current = current.n;
        }
        java.util.Arrays.sort(values);
        if (size % 2 == 0) {
            return (values[size / 2 - 1] + values[size / 2]) / 2.0;
        } else {
            return values[size / 2];
        }
    }

    // 9. complete main to make a simulation
    public static void main(String[] args) {
        DoubleLinkedList dll = new DoubleLinkedList();

        // Adding elements to the list
        dll.addLast(10);
        dll.addLast(20);
        dll.addLast(30);
        dll.addLast(40);
        dll.addLast(50);
        dll.addLast(30);

        // Printing the list from tail
        System.out.println("List printed from tail:");
        dll.printFromTail(); // Should print: 30 50 40 30 20 10

        // Getting the position of 30 from tail
        System.out.println("Position of 30: " + dll.getPositionFromTail(30)); 

        // Getting the last position of 30 from tail
        System.out.println("Last position of 30: " + dll.getLastPositionFromTail(30)); 

        // Getting the average of the list
        System.out.println("Average: " + dll.getAverage());

        // Getting the median of the list
        System.out.println("Median: " + dll.getMedian()); 

        // Deleting the last element
        dll.deleteLast();
        System.out.println("after deleting last element:");
        dll.printFromTail(); 

        // Getting the average of the list after deletion
        System.out.println("Average: " + dll.getAverage()); 

        // Getting the median of the list after deletion
        System.out.println("Median " + dll.getMedian()); 
    }
}
