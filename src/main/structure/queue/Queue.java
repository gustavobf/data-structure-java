package structure.queue;

class Node<T> {
    T value;
    Node<T> next;

    public Node (T value) {
        this.value = value;
        this.next = null;
    }

}

public class Queue<T> {
    private int length;
    private Node<T> head;
    private Node<T> tail;

    public Queue () {
        this.head = this.tail = null;
        this.length = 0;
    }

    public void enqueue (T item) {
        Node<T> node = new Node(item);
        if (this.tail == null && this.head == null) {
            this.tail = this.head = node;
        }
        this.tail.next = node;
        this.tail = node;

        this.length++;
    }

    public T dequeue () {

        if (this.length == 0 || this.head == null) {
            return null;
        }

        this.length--;

        Node<T> head = this.head;
        this.head = this.head.next;

        head.next = null;

        if (this.length == 0) {
            this.tail = null;
        }

        return head.value;
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
