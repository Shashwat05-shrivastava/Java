package LL;

public class NthNodeFromEnd{
    public static class Node{
        int data;
        Node next;

        Node(int data){
            this.data=data;
        }
    }
    public static void nthNodEnd(Node head,int n){
        int size=0;
        Node temp=head;
        while(temp!=null){
            size++;
            temp=temp.next;
        }
        int index=size-n;
        temp=head;
        for(int i=0;i<index;i++){
            temp=temp.next;
        }
        System.out.println(temp.data);
    }
    public static void main(String[] args){
        Node a=new Node(10);
        Node b=new Node(20);
        Node c=new Node(30);
        Node d=new Node(40);
        Node e=new Node(50);

        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;

        nthNodEnd(a,2);
    }
}
