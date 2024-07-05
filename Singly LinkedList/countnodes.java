class Node{
    int data;
    Node next;

    Node(int val){
        this.data=val;
        this.next=null;
    }
}

public class countnodes {

    public static int countNodes(Node head){
        int count=0;
        Node temp= head;
        while(temp!=null){
            temp=temp.next;
            count++;
            
        }

        return count;

    }
    public static void main(String args[]){
        Node head= new Node(1);
        head.next= new Node(2);
        head.next.next=new Node(3);
        head.next.next.next= new Node(4);

        System.out.println(countNodes(head));
    }
}
