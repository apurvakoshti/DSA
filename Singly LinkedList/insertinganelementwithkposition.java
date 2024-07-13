public class insertinganelementwithkposition {
    static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data=data;
            this.next=null;
        }

    }

    public static void printLL(Node head){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp= temp.next;
        }

        System.out.println("null");
    }

    public static Node insertAtKPosition(Node head, int position,int val){
        if(head==null){
            return new Node(val);
        }

        if(position==1){
            Node newNode= new Node(val);
            newNode.next=head;
            return newNode;
        }

        int count=0;
        Node temp= head;
        while(temp!=null){
            count++;
            if(count==(position-1)){
                Node x= new Node(val);
                x.next=temp.next;
                temp.next= x;
                
            }
            temp= temp.next;
        }
        return head;
    }
    public static void main(String args[]){
        Node head= new Node(1);
        head.next= new Node(2);
        head.next.next= new Node(3);
        head.next.next.next= new Node(4);
        head.next.next.next.next= new Node(5);

        printLL(head);
        insertAtKPosition(head, 3, 0);
        printLL(head);


    }
}
