package structure.queue;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class QueueTest {

    @Test
    public void testQueueCreation () {
        Queue<Integer> queue = new Queue<>();
        queue.enqueue(10);

        assertEquals(10, queue.peek());
        assertEquals(1, queue.size());
    }

    @Test
    public void testEnqueue () {
        Queue<Integer> queue = new Queue<>();
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);

        assertEquals(10, queue.peek());
        assertEquals(3, queue.size());
    }

    @Test
    public void testDequeue () {
        Queue<Integer> queue = new Queue<>();
        assertNull(queue.dequeue());
    }

    @Test
    public void testDequeueWithValues () {
        Queue<Integer> queue = new Queue<>();
        queue.enqueue(10);
        assertEquals(10, queue.dequeue());
    }

    @Test
    public void testPeekNoValues () {
        Queue<Integer> queue = new Queue<>();
        assertNull(queue.peek());
    }

}