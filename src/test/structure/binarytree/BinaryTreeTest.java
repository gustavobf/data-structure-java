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
    public void bfsAssertions () {
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

    @Test
    public void identicalTreesShouldBeEqual () {
        Node a = new Node(10);
        a.left = new Node(5);
        a.right = new Node(15);
        a.left.left = new Node(3);
        a.left.right = new Node(7);
        a.right.left = new Node(12);
        a.right.right = new Node(18);

        Node b = new Node(10);
        b.left = new Node(5);
        b.right = new Node(15);
        b.left.left = new Node(3);
        b.left.right = new Node(7);
        b.right.left = new Node(12);
        b.right.right = new Node(18);

        assertTrue(BinaryTree.compare(a, b), "identical trees must compare equal");
    }

    @Test
    public void differentValuesShouldNotBeEqual () {
        Node a = new Node(10);
        a.left = new Node(5);
        a.right = new Node(15);

        Node b = new Node(10);
        b.left = new Node(5);
        b.right = new Node(16);

        assertFalse(BinaryTree.compare(a, b), "trees with different node values must not compare equal");
    }

    @Test
    public void differentStructureShouldNotBeEqual () {
        Node a = new Node(10);
        a.left = new Node(5);
        a.right = new Node(15);
        a.left.left = new Node(3);

        Node b = new Node(10);
        b.left = new Node(5);
        b.right = new Node(15);

        assertFalse(BinaryTree.compare(a, b), "trees with different structure must not compare equal");
    }

    @Test
    public void nullCases () {
        assertTrue(BinaryTree.compare(null, null), "two null trees should be equal");
        assertFalse(BinaryTree.compare(new Node(1), null), "tree vs null must not be equal");
        assertFalse(BinaryTree.compare(null, new Node(1)), "null vs tree must not be equal");
    }

    @Test
    public void findsExistingElements () {
        Node root = new Node(10);
        root.left = new Node(5);
        root.right = new Node(15);
        root.left.left = new Node(3);
        root.left.right = new Node(7);
        root.right.left = new Node(12);
        root.right.right = new Node(18);

        BinaryTree tree = new BinaryTree(root);

        assertTrue(tree.searchByDepthFirstSearch(10), "should find root");
        assertTrue(tree.searchByDepthFirstSearch(5), "should find left child");
        assertTrue(tree.searchByDepthFirstSearch(18), "should find deep right child");
        assertTrue(tree.searchByDepthFirstSearch(3), "should find deep left-left child");
    }

    @Test
    public void returnsFalseWhenNotFound () {
        Node root = new Node(10);
        root.left = new Node(5);
        root.right = new Node(15);

        BinaryTree tree = new BinaryTree(root);

        assertFalse(tree.searchByDepthFirstSearch(20), "should not find missing value");
        assertFalse(tree.searchByDepthFirstSearch(0), "should not find smaller missing value");
    }

    @Test
    public void handlesEmptyTree () {
        BinaryTree empty = new BinaryTree(null);
        assertFalse(empty.searchByDepthFirstSearch(1), "empty tree should not contain any value");
    }

}
