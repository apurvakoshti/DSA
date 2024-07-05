import java.util.*;

public class stackusingarrays {
    static class Stack{
        static int size=1000;
        static int arr[]= new int[size];
        static int top=-1;

        public static void push(int ele){
            top++;
            arr[top]= ele;
        }

        public static int pop(){
            int x= arr[top];
            top--;
            return x;
        }

        public static int top(){
            return arr[top];


        }

        public static int size(){
            return top+1;
        }



    
    }
    public static void main(String args[]){
        Stack st= new Stack();
        st.push(6);
        st.push(3);
        st.push(7);
        st.push(2);
        System.out.println("Top of the stack before deleting: "+ st.top());
        System.out.println("Size of the stack before deleting: "+ st.size());
        System.out.println("The element deleted is: "+ st.pop());
        System.out.println("Top of the stack after deleting: "+ st.top());
        System.out.println("Size of the stack after deleting: "+ st.size());

        }
}
