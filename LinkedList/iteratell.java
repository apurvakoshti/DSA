//print a linkedlist

public class iteratell {
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
        //create new Node in linkedlist
        Node newNode= new Node(val);

        //if linkedlist is empty
        if(head==null){
            head=tail=newNode;
            return;
        }

        newNode.next=head;
        head= newNode;

    }

    public static void addLast(int val){
        //create new Node in linkedlist
        Node newNode= new Node(val);

        if(head==null){
            head=tail=newNode;
            return;
        }

        tail.next=newNode;
        tail= newNode;

    }

    public static void print(){

        if(head==null){
            System.out.println("LL is empty");
            return;
        }

        Node temp= head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp= temp.next;
        }
       System.out.println("null");
    }
    public static void main(String args[]){
        iteratell ll= new iteratell();
        ll.addFirst(2);
        ll.print();
        ll.addFirst(1);
        ll.print();
        ll.addLast(3);
        ll.print();
        ll.addLast(4);
        ll.print();

    }
    
}
