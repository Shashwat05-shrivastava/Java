package LL;

public class Implementation {

    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public static class LinkedList{
        Node head=null;
        Node tail=null;
        int size=0;

        //insert at end
        public void insertAtEnd(int data){
            Node newNode=new Node(data);
            if(head==null){
                head=newNode;
            }else{
                tail.next=newNode;
            }
            tail=newNode;
            size++;
        }

        //insert at beginning
        void insertAtStart(int data){
            Node newNode=new Node(data);
            if(head==null){
                head=newNode;
                tail=newNode;
            }else{
                Node temp=head;
                newNode.next=temp;
                head=newNode;

            }
            size++;
        }

        //insert At given index
        void insertAtIndex(int data, int index){
            Node newNode=new Node(data);
            Node temp=head;
            if(index==size){
                insertAtEnd(data);
                return;
            }
            if(index==0){
                insertAtStart(data);
                return;
            }
            for(int i=0;i<index;i++){
                temp=temp.next;
            }
            newNode.next=temp.next;
            temp.next=newNode;
            size++;
        }

        //delete at index
        void deleteAtIndex(int index){
            Node temp=head;
            if(index==0){
                head=head.next;
            }
            for(int i=0;i<index-1;i++){
                temp=temp.next;
            }
            temp.next=temp.next.next;
            tail=temp;
            size--;
        }
        //display
        public void display(Node head){
            Node temp=head;
            while(temp!=null){
                System.out.println(temp.data);
                temp=temp.next;
            }
        }

        //display using recursion
        void displayRecursive(Node head){
            if(head==null){
                return ;
            }
            System.out.println(head.data);
            displayRecursive(head.next);
        }
    }
    public static void main(String[] args) {
        LinkedList l=new LinkedList();
        l.insertAtEnd(10);
        l.insertAtEnd(20);
        //l.display(l.head);
        l.displayRecursive(l.head);
        System.out.println(l.size);
        l.insertAtStart(5);
        l.display(l.head);
        l.insertAtIndex(25, 3);
        l.display(l.head);
    }
    
}
