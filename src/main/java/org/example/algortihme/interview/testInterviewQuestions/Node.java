package org.example.algortihme.interview.testInterviewQuestions;

public class Node {

    private int value;

    private Node left;

    private Node right;

    private Node(int value) {
        this.value = value;
        this.left = null;
        this.right = null;
    }

    private Node find(int v) {
        Node current = this;
        while(current != null) {
            // Si la valeur du nœud actuel est égale à v, retourner ce nœud
            if(current.value == v) {
                return current;
            } else {
                current = current.value > v ? current.left : current.right;
            }
        }

        return null;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public Node getLeft() {
        return left;
    }

    public void setLeft(Node left) {
        this.left = left;
    }

    public Node getRight() {
        return right;
    }

    public void setRight(Node right) {
        this.right = right;
    }

    @Override
    public String toString() {
        return "Node{" + "value=" + value + ", left=" + left + ", right=" + right + '}';
    }

    public static void main(String[] args) {

        Node root = new Node(9);
        root.left = new Node(7);
        root.right = new Node(13);
        root.left.left = new Node(5);
        root.left.right = new Node(8);
        root.right.left = new Node(0);
        root.right.right = new Node(17);
        root.right.right.left = new Node(16);
        root.left.left.left = new Node(2);
        root.left.left.right = new Node(6);

        Node n = root.find(root.right.right.left.value);
        System.out.println(n);
    }
}
