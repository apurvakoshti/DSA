import java.util.*;

class GFG{
    static class Queue{
        static Stack<Integer> s1= new Stack<Integer>();
        static Stack<Integer> s2= new Stack<Integer>();

        static void Enqueue(int x){
            while(!s1.isEmpty()){
                s2.push(s1.pop());
            }

            s1.push(x);

            while(!s2.isEmpty()){
                s1.push(s2.pop());
            }
        }

        static int Dequeue(){
            if(s1.isEmpty()){
                return -1;
            }

            int x= s1.peek();
            s1.pop();
            return x;
        }

        static int Top(){
            if(s1.isEmpty()){
                return -1;
            }

            int x= s1.peek();
            return x;
        }


    };

    public static void main(String args[]){

        Queue q= new Queue();
        q.Enqueue(1);
        q.Enqueue(2);
        q.Enqueue(3);

        System.out.println("Top of the Queue is: "+q.Top());

        System.out.println(q.Dequeue());
        System.out.println(q.Dequeue());
        System.out.println(q.Dequeue());





    }

}