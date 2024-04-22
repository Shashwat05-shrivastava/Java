package Tree;
class Node {
    int data;
    Node left;
    Node right;

    public Node(int data) {
        this.data = data;
    }
}

public class BinaryTree {
    Node root;

    public BinaryTree() {
        this.root = null;
    }

    //PreORder Traversal
    public static void PreOrder(Node node){

        if(node==null){
            return;
        }
        System.out.println(node.data);
        PreOrder(node.left);
        PreOrder(node.right);
    }
    

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        tree.root = new Node(50);
        tree.root.left = new Node(10);
        tree.root.right = new Node(20);
        tree.root.left.left = new Node(30);
        tree.root.left.right = new Node(30);

        PreOrder(tree.root);
    }

}