public class SingleLinkedListCustomer {
    Nodecustomer head;
    Nodecustomer tail;

    public boolean isEmpty() {
        return head == null;
    }

    public void print() {
        if (!isEmpty()) {
            Nodecustomer tmp = head;
            System.out.println("Linked list content:");
            while (tmp != null) {
                tmp.data.print();
                tmp = tmp.next;
            }
        } else {
            System.out.println("Linked list is empty");
        }
    }

    public void addFirst(Customer input) {
        Nodecustomer ndInput = new Nodecustomer(input, null);
        if (isEmpty()) {
            head = ndInput;
            tail = ndInput;
        } else {
            ndInput.next = head;
            head = ndInput;
        }
    }

    public void addLast(Customer input) {
        Nodecustomer ndInput = new Nodecustomer(input, null);
        if (isEmpty()) {
            head = ndInput;
            tail = ndInput;
        } else {
            tail.next = ndInput;
            tail = ndInput;
        }
    }

    public void insertAfter(Customer key, Customer input) {
        Nodecustomer ndInput = new Nodecustomer(input, null);
        Nodecustomer temp = head;
        while (temp != null) {
            if (temp.data.equals(key)) {
                ndInput.next = temp.next;
                temp.next = ndInput;
                if (ndInput.next == null) {
                    tail = ndInput;
                }
                break;
            }
            temp = temp.next;
        }
    }

    public void insertAt(int index, Customer input) {
        if (index < 0) {
            System.out.println("Wrong index");
        } else if (index == 0) {
            addFirst(input);
        } else {
            Nodecustomer temp = head;
            for (int i = 0; i < index - 1; i++) {
                if (temp == null) {
                    System.out.println("Index out of bounds");
                    return;
                }
                temp = temp.next;
            }
            temp.next = new Nodecustomer(input, temp.next);
            if (temp.next.next == null) {
                tail = temp.next;
            }
        }
    }

    public Customer getData(int index) {
        if (index < 0) {
            return null;
        }
        Nodecustomer temp = head;
        for (int i = 0; i < index; i++) {
            if (temp == null) {
                return null;
            }
            temp = temp.next;
        }
        return (temp != null) ? temp.data : null;
    }

    public int indexOf(Customer key) {
        Nodecustomer temp = head;
        int index = 0;
        while (temp != null && !temp.data.equals(key)) {
            temp = temp.next;
            index++;
        }
        return (temp != null) ? index : -1;
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
            Nodecustomer temp = head;
            while (temp.next != tail) {
                temp = temp.next;
            }
            temp.next = null;
            tail = temp;
        }
    }

    public void remove(Customer key) {
        if (isEmpty()) {
            System.out.println("Linked list is empty. Cannot remove data");
        } else {
            if (head.data.equals(key)) {
                removeFirst();
            } else {
                Nodecustomer temp = head;
                while (temp.next != null) {
                    if (temp.next.data.equals(key)) {
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
    }

    public void removeAt(int index) {
        if (index < 0) {
            System.out.println("Wrong index");
        } else if (index == 0) {
            removeFirst();
        } else {
            Nodecustomer temp = head;
            for (int i = 0; i < index - 1; i++) {
                if (temp == null || temp.next == null) {
                    System.out.println("Index out of bounds");
                    return;
                }
                temp = temp.next;
            }
            if (temp.next != null) {
                temp.next = temp.next.next;
                if (temp.next == null) {
                    tail = temp;
                }
            }
        }
    }

    public void insertBefore(Customer key, Customer input) {
        Nodecustomer ndInput = new Nodecustomer(input, null);
        if (isEmpty()) {
            head = tail = ndInput;
        } else if (head.data.equals(key)) {
            addFirst(input);
        } else {
            Nodecustomer temp = head;
            while (temp.next != null) {
                if (temp.next.data.equals(key)) {
                    ndInput.next = temp.next;
                    temp.next = ndInput;
                    break;
                }
                temp = temp.next;
            }
        }
    }
}
