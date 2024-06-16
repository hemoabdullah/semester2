package week12;

public class Node3 {
    Person data;
    Node3 prev, next;

    public Node3(Node3 prev, Person data, Node3 next) {
        this.data = data;
        this.prev = prev;
        this.next = next;
    }
}
