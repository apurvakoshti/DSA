public class searchinllwithkey{
    static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }

    public static boolean search(Node head, int key){
        Node temp=head;
        while(temp!=null){
            if(temp.data==key){
                return true;
            }

            temp=temp.next;
        }

        return false;

    }
    public static void main(String args[]){
        Node head= new Node(1);
        head.next= new Node(2);
        head.next.next= new Node(3);
        head.next.next.next= new Node(4);

        System.out.println(search(head, 4));

    }
}