public class insertingelementbeforethevalue {
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
            temp=temp.next;
        }
        System.out.println("null");
    }

    public static Node insertBeforeElement(Node head, int ele, int val){
        if(head==null){
            return null;
        }

        if(head.data==ele){
            Node newNode= new Node(val);
            newNode.next=head;
            return newNode;
        }
        Node temp=head;
        while(temp.next!=null){
            if(temp.next.data==ele){
                Node x= new Node(val);
                x.next=temp.next;
                temp.next=x;
                break;
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
        insertBeforeElement(head, 4, 0);
        printLL(head);


    }
}
