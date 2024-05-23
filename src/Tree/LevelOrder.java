package Tree;
import java.util.*;
 class Node{
    int data;
    Node left;
    Node right;

    public Node(int data){
        this.data=data;
    }
}
public class LevelOrder {
    Node root;

    public LevelOrder(){
        this.root=null;
    }

    public static void LevelOrderTraversal(Node node){
        
        Queue<Node> q=new LinkedList<>();
        if(node==null){
            return;
        }
        q.add(node);
        while(!q.isEmpty()){
            Node n=q.poll();
            System.out.print(n.data+" ");

            if(n.left!=null){
                q.add(n.left);
            }
            if(n.right!=null){
                q.add(n.right);
            }
        }
        
    }

    public static void main(String[]  args){
        LevelOrder tree=new LevelOrder();
        tree.root=new Node(7);
        tree.root.left=new Node(6);
        tree.root.right=new Node(5);
        tree.root.left.left=new Node(4);
        tree.root.left.right=new Node(3);
        tree.root.right.left=new Node(2);
        tree.root.right.right=new Node(1);

        LevelOrderTraversal(tree.root);
    }
}
