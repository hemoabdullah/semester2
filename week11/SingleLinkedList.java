
public class SingleLinkedList {
    Node head;
    Node tail;

    public boolean isEmpty() {
        return head == null;
    }

    public void print() {
        if (!isEmpty()) {
            Node tmp = head;
            System.out.print("Linked list content: ");
            while (tmp != null) {
                System.out.print(tmp.data + " ");
                tmp = tmp.next;
            }
            System.out.println();
        } else {
            System.out.println("Linked list is empty");
        }
    }

    public void addFirst(int input) {
        Node newNode = new Node(input, null);
        if (isEmpty()) {
            head = tail = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
    }

    public void addLast(int input) {
        Node newNode = new Node(input, null);
        if (isEmpty()) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
    }

    public void insertAfter(int key, int input) {
        Node newNode = new Node(input, null);
        Node temp = head;
        while (temp != null) {
            if (temp.data == key) {
                newNode.next = temp.next;
                temp.next = newNode;
                if (newNode.next == null) {
                    tail = newNode;
                }
                break;
            }
            temp = temp.next;
        }
    }

    public void insertAt(int index, int input) {
        if (index < 0) {
            System.out.println("Wrong index");
        } else if (index == 0) {
            addFirst(input);
        } else {
            Node temp = head;
            for (int i = 0; i < index - 1; i++) {
                if (temp == null) {
                    System.out.println("Index out of range");
                    return;
                }
                temp = temp.next;
            }
            if (temp != null) {
                temp.next = new Node(input, temp.next);
                if (temp.next.next == null) {
                    tail = temp.next;
                }
            } else {
                System.out.println("Index out of range");
            }
        }
    }

    public int getData(int index) {
        Node temp = head;
        for (int i = 0; i < index; i++) {
            if (temp != null) {
                temp = temp.next;
            } else {
                throw new IndexOutOfBoundsException("Index out of range");
            }
        }
        return temp != null ? temp.data : -1;
    }

    public int indexOf(int key) {
        Node temp = head;
        int index = 0;
        while (temp != null && temp.data != key) {
            temp = temp.next;
            index++;
        }
        return temp != null ? index : -1;
    }

    public void removeFirst() {
        if (isEmpty()) {
            System.out.println("Linked list is empty. Cannot remove data");
        } else if (head.equals(tail)) {
            head = tail = null;
        } else {
            head = head.next;
        }
    }

    public void removeLast() {
        if (isEmpty()) {
            System.out.println("Linked list is empty. Cannot remove data");
        } else if (head.equals(tail)) {
            head = tail = null;
        } else {
            Node temp = head;
            while (temp.next != tail) {
                temp = temp.next;
            }
            temp.next = null;
            tail = temp;
        }
    }

    public void remove(int key) {
        if (isEmpty()) {
            System.out.println("Linked list is empty. Cannot remove data");
        } else {
            Node temp = head;
            while (temp != null) {
                if (temp.data == key && temp.equals(head)) {
                    this.removeFirst();
                    break;
                } else if (temp.next != null && temp.next.data == key) {
                    temp.next = temp.next.next;
                    if (temp.next == null) {
                        tail = temp;
                    }
                    break;
                }
                temp = temp.next;
            }
        }
    }

    public void removeAt(int index) {
        if (index == 0) {
            removeFirst();
        } else {
            Node temp = head;
            for (int i = 0; i < index - 1; i++) {
                if (temp != null) {
                    temp = temp.next;
                } else {
                    System.out.println("Index out of range");
                    return;
                }
            }
            if (temp != null && temp.next != null) {
                temp.next = temp.next.next;
                if (temp.next == null) {
                    tail = temp;
                }
            } else {
                System.out.println("Index out of range");
            }
        }
    }
}

