import java.util.*;
public class queuereversal {
    public static void reverse(Queue q){
        Stack <Integer> st= new Stack<>();
        while(!q.isEmpty()){
            st.push(q.dequeue());
        }

        while(!st.isEmpty()){
            q.enqueue(st.pop());
        }
    }
    public static void main(String args[]){
        Queue q= new Queue();
        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);

        reverse(q);

        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.dequeue();
        }
    }
}
