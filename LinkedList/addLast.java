// add at last of linkedlist

public class addLast {
    static class Node{
        int data;
        Node next;

        public Node(int val){
            this.data=val;
            this.next= null;
        }
    }

    public static Node head;
    public static Node tail;

    public static void addLast(int val){
        //create new node
        Node newNode= new Node(val);

        //if linkedlist is empty
        if(head==null){
            head=tail=newNode;
            return;
        }

        tail.next= newNode;
        tail = newNode;


    }
    public static void main(String args[]){

    }
}
