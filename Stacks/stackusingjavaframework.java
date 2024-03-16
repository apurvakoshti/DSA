//implementation of stack using java collection framework
import java.util.*;
public class stackusingjavaframework {
    public static void main(String args[]){
        Stack <Integer> s= new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);

        while(!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
        }
        
    }

    
}


