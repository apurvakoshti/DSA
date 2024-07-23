import java.util.*;
class Queue{

    Stack<Integer> s1= new Stack<>();
    Stack<Integer> s2= new Stack<>();

    public void enqueue(int x){
        while(!s1.isEmpty()){
            s2.push(s1.pop());
        }

        s1.push(x);

        while(!s2.isEmpty()){
            s1.push(s2.pop());
        }

    }

    public int dequeue(){
        if(s1.isEmpty()){
            return -1;
        }

        int result= s1.peek();
        return s1.pop();


    }

    public int peek(){

        return s1.peek();

    }
    
    public boolean isEmpty(){
        return s1.isEmpty();
    }


}
public class queueusingtwostack{
    public static void main(String args[]){
        Queue q= new Queue();

        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);

        //while(!q.isEmpty()){
        //System.out.println(q.peek());
        //q.dequeue();
        //}
        System.out.println(q.peek());
        System.out.println(q.dequeue());
        System.out.println(q.peek());
        

    }
}