public class singlelinkedlistassigenment {
    NodeAssignment head;
    NodeAssignment tail;

    public boolean isEmpty() {
        return head == null;
    }

    public void print() {
        if (!isEmpty()) {
            NodeAssignment tmp = head;
            System.out.print("Linked list content: \t");
            while (tmp != null) {
                System.out.print(tmp.data + "\t");
                tmp = tmp.next;
            }
            System.out.println("");
        } else {
            System.out.println("Linked list is empty");
        }
    }

    public void addFirst(String input) {
        NodeAssignment ndInput = new NodeAssignment(input, null);
        if (isEmpty()) {
            head = ndInput;
            tail = ndInput;
        } else {
            ndInput.next = head;
            head = ndInput;
        }
    }

    public void addLast(String input) {
        NodeAssignment ndInput = new NodeAssignment(input, null);
        if (isEmpty()) {
            head = ndInput;
            tail = ndInput;
        } else {
            tail.next = ndInput;
            tail = ndInput;
        }
    }

    public void insertAfter(String key, String input) {
        NodeAssignment ndInput = new NodeAssignment(input, null);
        NodeAssignment temp = head;
        while (temp != null) {
            if (temp.data.equals(key)) {
                ndInput.next = temp.next;
                temp.next = ndInput;
                if (ndInput.next == null) tail = ndInput;
                break;
            }
            temp = temp.next;
        }
    }

    public void insertAt(int index, String input) {
        if (index < 0) {
            System.out.println("Wrong index");
        } else if (index == 0) {
            addFirst(input);
        } else {
            NodeAssignment temp = head;
            for (int i = 0; i < index - 1; i++) {
                if (temp != null) {
                    temp = temp.next;
                } else {
                    System.out.println("Index out of range");
                    return;
                }
            }
            if (temp != null) {
                temp.next = new NodeAssignment(input, temp.next);
                if (temp.next.next == null) tail = temp.next;
            } else {
                System.out.println("Index out of range");
            }
        }
    }

    public String getData(int index) {
        NodeAssignment temp = head;
        for (int i = 0; i < index; i++) {
            if (temp != null) {
                temp = temp.next;
            } else {
                return "Index out of range";
            }
        }
        return temp != null ? temp.data : "Index out of range";
    }

    public int indexOf(String key) {
        NodeAssignment temp = head;
        int index = 0;
        while (temp != null && !temp.data.equals(key)) {
            temp = temp.next;
            index++;
        }
        return temp != null ? index : -1;
    }

    public void removeFirst() {
        if (isEmpty()) {
            System.out.println("Linked list is empty. Can not remove data");
        } else if (head.equals(tail)) {
            head = tail = null;
        } else {
            head = head.next;
        }
    }

    public void removeLast() {
        if (isEmpty()) {
            System.out.println("Linked list is empty. Can not remove data");
        } else if (head.equals(tail)) {
            head = tail = null;
        } else {
            NodeAssignment temp = head;
            while (temp.next != tail) {
                temp = temp.next;
            }
            temp.next = null;
            tail = temp;
        }
    }

    public void remove(String key) {
        if (isEmpty()) {
            System.out.println("Linked list is empty. Can not remove data");
        } else {
            NodeAssignment temp = head;
            while (temp != null) {
                if (temp.data.equals(key) && temp.equals(head)) {
                    this.removeFirst();
                    break;
                } else if (temp.next != null && temp.next.data.equals(key)) {
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
            NodeAssignment temp = head;
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

    public void insertBefore(String key, String input) {
        NodeAssignment ndInput = new NodeAssignment(input, null);
        if (isEmpty()) {
            head = tail = ndInput;
        } else if (head.equals(tail)) {
            if (head.data.equals(key)) {
                ndInput.next = head;
                head = ndInput;
            } else {
                System.out.println("Key not found");
            }
        } else {
            NodeAssignment temp = head;
            while (temp != null && temp.next != null) {
                if (temp.next.data.equals(key)) {
                    ndInput.next = temp.next;
                    temp.next = ndInput;
                    break;
                }
                temp = temp.next;
            }
            if (head.data.equals(key)) {
                ndInput.next = head;
                head = ndInput;
            }
        }
    }
}
