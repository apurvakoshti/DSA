class Node{
    int data;
    Node next;

    Node(int val){
        this.data=val;
        this.next=null;
    }
}
public class linkedlist {
    public static void main(String args[]){
        int arr[]={1,2,3,4,5};
        Node x= new Node(arr[3]);
        System.out.println(x.data);
    }
}

    

