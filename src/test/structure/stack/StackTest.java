package structure.stack;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class StackTest {

    @Test
    public void testStackCreation () {
        Stack<Integer> stack = new Stack<>();
        stack.push(10);
        stack.push(20);

        assertEquals(2, stack.size());
        assertEquals(20, stack.peek());
    }

    @Test
    public void testPeekWithNoValues () {
        Stack<Integer> stack = new Stack<>();
        assertNull(stack.peek());
    }

    @Test
    public void testPop () {
        Stack<Integer> stack = new Stack<>();
        stack.push(10);

        assertEquals(10, stack.pop());
        assertEquals(1, stack.size());
    }

    @Test
    public void testPopWithNoValues () {
        Stack<Integer> stack = new Stack<>();
        assertNull(stack.pop());
    }

}
