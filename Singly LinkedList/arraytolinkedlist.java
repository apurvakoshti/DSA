class Node{
    int data;
    Node next;
    Node(int val){
        this.data=val;
        this.next=null;
    }
}
public class arraytolinkedlist {

    public static Node createLL(int arr[]){
        Node head= new Node(arr[0]);
        Node mover=head;
        for(int i=1; i<arr.length; i++){
            Node temp= new Node(arr[i]);
            mover.next=temp;
            mover=temp;

        }
        return head;

    }
    public static void main(String args[]){
        int arr[]={4,6,3,2,1};
        Node head= createLL(arr);
        System.out.println(head.data);

    }
}
