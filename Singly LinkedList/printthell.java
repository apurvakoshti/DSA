class Node{
    int data;
    Node next;

    Node(int val){
        this.data=val;
        this.next=null;
    }
}

public class printthell {

    public static void printLL(Node head){
        Node temp= head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp= temp.next;
    
        }
        System.out.println("null");
    
    }
    public static void main(String args[]){
        Node head= new Node(1);
        head.next= new Node(2);
        head.next.next=new Node(3);
        head.next.next.next= new Node(4);

        printLL(head);

    }
    
}
