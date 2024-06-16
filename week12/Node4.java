package week12;
public class Node4 {
    Student data;
    Node4 prev, next;

    public Node4(Node4 prev, Student data, Node4 next) {
        this.data = data;
        this.prev = prev;
        this.next = next;
    }
}