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
public class RightView {
    Node root;
    public RightView(){
        this.root=null;
    }

    public static void RightViewMethod(Node node){
        Queue<Node> q=new LinkedList<>();
        if(node==null){
            return ;
        }
        q.add(node);
        while(!q.isEmpty()){
            int l=q.size();
            for(int i=0;i<l;i++){
                Node n=q.poll();
                if(i==l-1){
                    System.out.print(n.data+" ");
                }
                if(n.left!=null){
                    q.add(n.left);
                }
                if(n.right!=null){
                    q.add(n.right);
                }
            }
        }
    }
    public static void main(String[] args) {
        RightView tree = new RightView();
        tree.root = new Node(7);
        tree.root.left = new Node(6);
        tree.root.right = new Node(5);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(3);
        tree.root.right.left = new Node(2);
        tree.root.right.right = new Node(1);

        RightViewMethod(tree.root);
    }
}
