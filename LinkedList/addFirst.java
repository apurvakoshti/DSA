// add at the beginning of linkedlist

public class addFirst {
    static class Node{
        int data;
        Node next;

        public Node(int val){
            this.data=val;
            this.next=null;
        }
    }

    public static Node head;
    public static Node tail;

    public static void addFirst(int val){
        //create new node
        Node newNode= new Node(val);

        //if linkedlist is empty
        if(head==null){
            head=tail=newNode;
            return;
        }

        newNode.next= head;
        head= newNode;


    }

    public static void main(String args[]){
        addFirst ll= new addFirst();
        ll.addFirst(1);
        ll.addFirst(2);

    }
    
}
