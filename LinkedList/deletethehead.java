class Node{
    int data;
    Node next;

    public Node(int val){
        this.data=val;
        this.next=null;
    }
}
public class deletethehead {

    public static void printll(Node head){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp =temp.next;
        }
        System.out.println("null");

    }

    public static Node deleteHead(Node head){
        if(head==null){
            return head;
        }
        head=head.next;
        return head;

    }

    public static void main(String args[]){
        Node head= new Node(1);
        head.next= new Node(2);
        head.next.next=new Node(3);
        head.next.next.next=new Node(4);
        printll(head);
        head= deleteHead(head);
        printll(head);
    }
    
}
