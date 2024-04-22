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
    //Inorder Traversal
    public static void InOrder(Node node){
        if(node == null){
            return;
        }
        InOrder(node.left);
        System.out.println(node.data);
        InOrder(node.right);
    }
    //PostOrder Traversal
    public static void PostOrder(Node node){
        if(node == null){
            return;
        }
        PostOrder(node.left);
        PostOrder(node.right);
        System.out.println(node.data);
    }

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        tree.root = new Node(50);
        tree.root.left = new Node(10);
        tree.root.right = new Node(20);
        tree.root.left.left = new Node(30);
        tree.root.left.right = new Node(30);

        PreOrder(tree.root);
        InOrder(tree.root);
        PostOrder(tree.root);
    }

}