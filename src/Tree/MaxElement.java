package Tree;

import java.util.*;

class Node {
    int data;
    Node left;
    Node right;

    public Node(int data) {
        this.data = data;
    }

}

public class MaxElement {
    Node root;

    public MaxElement() {
        this.root = null;
    }

    public static void FindMaxElement(Node node) {
        int max=Integer.MIN_VALUE;
        Queue<Node> q = new LinkedList<>();
        if (node == null) {
            return;
        }
        q.add(node);
        while (!q.isEmpty()) {
            Node n=q.poll();
            if(n.data>max){
                max=n.data;
            }

            if(n.left!=null){
                q.add(n.left);
            }
            if(n.right!=null){
                q.add(n.right);
            }
        }
        System.out.println("The max element is: "+max);
    }

    public static void main(String[] args) {
        MaxElement tree = new MaxElement();
        tree.root = new Node(7);
        tree.root.left = new Node(6);
        tree.root.right = new Node(5);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(3);
        tree.root.right.left = new Node(2);
        tree.root.right.right = new Node(1);

        FindMaxElement(tree.root);
    }
}
