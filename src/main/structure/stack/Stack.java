package structure.stack;

class Node<T> {
    T value;
    Node<T> prev;

    public Node (T value) {
        this.value = value;
        this.prev = null;
    }

}

public class Stack<T> {
    private int length;
    private Node<T> head;

    public Stack () {
        this.head = null;
        this.length = 0;
    }

    public T pop () {
        if (this.head == null || this.length == 0) {
            return null;
        }

        Node<T> head = this.head;

        this.head = head.prev;

        return head.value;
    }

    public void push (T item) {

        Node<T> node = new Node<>(item);

        if (this.head == null) {
            this.head = node;
            this.length++;
            return;
        }

        node.prev = this.head;
        this.head = node;

        this.length++;
    }

    public T peek () {
        if (this.head == null) {
            return null;
        }
        return this.head.value;
    }

    public int size () {
        return this.length;
    }

}
