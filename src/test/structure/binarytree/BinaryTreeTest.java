package structure.binarytree;

import org.junit.jupiter.api.*;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

public class BinaryTreeTest {

    @Test
    public void traversalAssertions () {

        Node root = new Node(10);
        root.left = new Node(5);
        root.right = new Node(15);

        root.left.left = new Node(3);
        root.left.right = new Node(7);

        root.right.left = new Node(12);
        root.right.right = new Node(18);

        BinaryTree tree = new BinaryTree(root);

        List<Integer> expectedPre = Arrays.asList(10, 5, 3, 7, 15, 12, 18);
        List<Integer> expectedIn = Arrays.asList(3, 5, 7, 10, 12, 15, 18);
        List<Integer> expectedPost = Arrays.asList(3, 7, 5, 12, 18, 15, 10);

        assertEquals(expectedPre, tree.preOrder(), "pre-order");
        assertEquals(expectedIn, tree.inOrder(), "in-order");
        assertEquals(expectedPost, tree.postOrder(), "post-order");
    }

    @Test
    public void bfsAssertions() {
        Node root = new Node(10);
        root.left = new Node(5);
        root.right = new Node(15);
        root.left.left = new Node(3);
        root.left.right = new Node(7);
        root.right.left = new Node(12);
        root.right.right = new Node(18);

        BinaryTree tree = new BinaryTree(root);

        List<Integer> expected = Arrays.asList(10, 5, 15, 3, 7, 12, 18);
        assertEquals(expected, tree.breadthFirstSearchReturningPath(), "breadth-first traversal");
        assertTrue(tree.breadthFirstSearch(5));
        assertTrue(tree.breadthFirstSearch(10));
        assertTrue(tree.breadthFirstSearch(15));
        assertFalse(tree.breadthFirstSearch(20));
    }

}
