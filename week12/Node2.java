package week12;

public class Node2 {
    String data;
    Node2 prev, next;

    public Node2(Node2 prev, String data, Node2 next) {
        this.data = data;
        this.prev = prev;
        this.next = next;
    }
}