import java.util.*;
class MyQueue{
    int front;
    int rear;
    int arr[];
    int size;

    MyQueue(int n){
        front=rear=0;
        arr= new int[n];
        size=n;
    }


    public void enqueue(int x){
        if(rear==size){
            System.out.println("queue is full");
            return;
        }
        arr[rear]=x;
        rear++;
    
    }


    public int dequeue(){
        if(front==rear){
            System.out.println("queue is empty");
            return -1;
        }

        int result= arr[front];
        front++;
        return result;

    }

    
    public int peek(){
        if(front==rear){
            System.out.println("queue is empty");
            return -1;
        }

        return arr[front];

    }


}
     
public class queueusingarray{
    public static void main(String args[]){
        MyQueue q= new MyQueue(5);
        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);
        q.enqueue(4);
        q.enqueue(5);
        q.enqueue(6); 

       
        
        System.out.println(q.peek()); 
        System.out.println(q.dequeue());
        System.out.println(q.peek()); 
        System.out.println(q.dequeue()); 
        System.out.println(q.peek()); 
        System.out.println(q.dequeue()); 
        System.out.println(q.dequeue()); 
        System.out.println(q.dequeue()); 
        System.out.println(q.dequeue());

    }
}