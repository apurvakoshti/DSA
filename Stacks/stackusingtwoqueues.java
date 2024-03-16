import java.util.*;
public class stackusingtwoqueues {

    Queue <Integer> q1= new LinkedList<>();
    Queue <Integer> q2= new LinkedList<>();


     void push(int x){
        q2.add(x);
        while(!q1.isEmpty()){
            q2.add(q1.peek());
            q1.remove();
        }
        
        Queue <Integer> q= q1;
        q1= q2;
        q2= q;


    }

    void pop(){
        if(q1.isEmpty()){
           return;
        }

         q1.remove();
       

    }

     int top(){
        if(q1.isEmpty()){
            return 0;
        }
        int x= q1.peek();
        return x;



    }
    public static void main(String args[]){
        stackusingtwoqueues s= new stackusingtwoqueues();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);

        System.out.println(s.top());
        s.pop();
        System.out.println(s.top());
        s.pop();

    }
}
