package week12;

public class DLL4 {
    Node4 head;
    int size;

    public DLL4() {
        head = null;
        size = 0;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void addFirst(Student item) {
        if (isEmpty()) {
            head = new Node4(null, item, null);
        } else {
            Node4 newNode = new Node4(null, item, head);
            head.prev = newNode;
            head = newNode;
        }
        size++;
    }

    public void addLast(Student item) {
        if (isEmpty()) {
            addFirst(item);
        } else {
            Node4 current = head;
            while (current.next != null) {
                current = current.next;
            }
            Node4 newNode = new Node4(current, item, null);
            current.next = newNode;
            size++;
        }
    }

    public void add(Student item, int index) throws Exception {
        if (index < 1 || index > size + 1) {
            throw new Exception("Index out of bound");
        } else if (index == 1) {
            addFirst(item);
        } else if (index == size + 1) {
            addLast(item);
        } else {
            Node4 current = head;
            for (int i = 1; i < index - 1; i++) {
                current = current.next;
            }
            Node4 newNode = new Node4(current, item, current.next);
            current.next.prev = newNode;
            current.next = newNode;
            size++;
        }
    }

    public int size() {
        return size;
    }

    public void clear() {
        head = null;
        size = 0;
    }

    public void print() {
        if (!isEmpty()) {
            Node4 temp = head;
            while (temp != null) {
                temp.data.print();
                temp = temp.next;
            }
            System.out.println("\nAll data printed successfully");
        } else {
            System.out.println("Linked list is empty");
        }
    }

    public void removeFirst() throws Exception {
        if (isEmpty()) {
            throw new Exception("Linked list is still empty, cannot remove data");
        } else if (head.next == null) {
            head = null;
        } else {
            head = head.next;
            head.prev = null;
        }
        size--;
    }

    public void removeLast() throws Exception {
        if (isEmpty()) {
            throw new Exception("Linked list is still empty, cannot remove data");
        } else if (head.next == null) {
            head = null;
        } else {
            Node4 current = head;
            while (current.next.next != null) {
                current = current.next;
            }
            current.next = null;
        }
        size--;
    }

    public void remove(int index) throws Exception {
        if (isEmpty() || index < 1 || index > size) {
            throw new Exception("Index value is out of bound");
        } else if (index == 1) {
            removeFirst();
        } else if (index == size) {
            removeLast();
        } else {
            Node4 current = head;
            for (int i = 1; i < index - 1; i++) {
                current = current.next;
            }
            current.next = current.next.next;
            current.next.prev = current;
            size--;
        }
    }

    public Student getFirst() throws Exception {
        if (isEmpty()) {
            throw new Exception("Linked list still empty");
        }
        return head.data;
    }

    public Student getLast() throws Exception {
        if (isEmpty()) {
            throw new Exception("Linked list still empty");
        }
        Node4 temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        return temp.data;
    }

    public Student get(int index) throws Exception {
        if (isEmpty() || index < 1 || index > size) {
            throw new Exception("Index out of bound");
        }
        Node4 temp = head;
        for (int i = 1; i < index; i++) {
            temp = temp.next;
        }
        return temp.data;
    }

    public int search(int key) throws Exception {
        Node4 temp = head;
        int i = 1;
        while (temp != null) {
            if (temp.data.nim == key) {
                return i;
            }
            i++;
            temp = temp.next;
        }
        throw new Exception("Key value doesn't exist");
    }

    public void sort() throws Exception {
        if (head == null || head.next == null) {
            return;
        }
        boolean swapped;
        Node4 current;
        Node4 last = null;
        do {
            swapped = false;
            current = head;
            while (current.next != last) {
                if (current.data.gpa < current.next.data.gpa) {
                    Student temp = current.data;
                    current.data = current.next.data;
                    current.next.data = temp;
                    swapped = true;
                }
                current = current.next;
            }
            last = current;
        } while (swapped);
    }
}