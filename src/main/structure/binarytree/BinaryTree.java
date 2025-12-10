package structure.binarytree;

import java.util.*;

class Node {
    int value;
    Node left;
    Node right;

    public Node (int value) {
        this.value = value;
        this.left = this.right = null;
    }

}

public class BinaryTree {

    Node root;

    public BinaryTree (Node root) {
        this.root = root;
    }

    public List<Integer> preOrder () {
        return this.pre(this.root, new ArrayList<>());
    }

    public List<Integer> inOrder () {
        return this.in(this.root, new ArrayList<>());
    }

    public List<Integer> postOrder () {
        return this.post(this.root, new ArrayList<>());
    }

    private List<Integer> pre (Node node, List<Integer> path) {

        if (node == null) {
            return path;
        }

        path.add(node.value);
        pre(node.left, path);
        pre(node.right, path);

        return path;
    }

    private List<Integer> in (Node node, List<Integer> path) {

        if (node == null) {
            return path;
        }

        in(node.left, path);
        path.add(node.value);
        in(node.right, path);

        return path;
    }

    private List<Integer> post (Node node, List<Integer> path) {

        if (node == null) {
            return path;
        }

        post(node.left, path);
        post(node.right, path);
        path.add(node.value);

        return path;
    }

    public List<Integer> breadthFirstSearchReturningPath () {

        ArrayList<Integer> list = new ArrayList<>();

        Queue<Node> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            Node poll = queue.poll();

            list.add(poll.value);

            if (poll.left != null) {
                queue.add(poll.left);
            }

            if (poll.right != null) {
                queue.add(poll.right);
            }
        }
        return list;
    }

    public boolean breadthFirstSearch(int needle) {

        Queue<Node> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            Node poll = queue.poll();

            if (poll.value == needle) {
                return true;
            }

            if (poll.left != null) {
                queue.add(poll.left);
            }

            if (poll.right != null) {
                queue.add(poll.right);
            }
        }
        return false;
    }

}
