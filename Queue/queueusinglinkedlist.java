class MyQueue{
    static class Node{
        int data;
        Node next;

        public Node(int val){
            this.data=val;
            this.next=null;
        }
    }

    static class Queue{
        //initialisation
         Node head=null;
         Node tail=null;


        public boolean isEmpty(){
            return head==null;
        }

        public void enqueue(int x){
            Node newNode= new Node(x);
            if(head==null){
                head=tail=newNode;
                return;
            }

            tail.next=newNode;
            tail=newNode;
            

        }

        public int dequeue(){
            if(isEmpty()){
                return -1;
            }

            int result=head.data;
            Node temp=head;
            temp.next=head;
            temp=head;
            return result;

        }

        public int peek(){
            return head.data;
        }
    }
}
public class queueusinglinkedlist {
    public static void main(String args[]){
        Queue q= new Queue();

        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);

        System.out.println(q.peek());
        System.out.println(q.dequeue());

        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.dequeue();
        }

        

    }
}
