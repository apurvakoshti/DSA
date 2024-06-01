import java.util.*;
public class reverseanarrayusingstack{
    public static void printArray(int array[]){
        for(int i=0; i<array.length;i++){
            System.out.print(array[i]+" ");
        }
        System.out.println();
    }
    public static void reverse(int array[]){
        Stack<Integer> st= new Stack<>();


        //push into stack
        for(int i=0; i<array.length;i++){
            st.push(array[i]);

        }
        //pop from stack
        for(int i=0; i<array.length; i++){
            array[i]=st.pop();
        }



    }
    public static void main(String args[]){
    int array[]={2,4,6,8,10};
    printArray(array);

    reverse(array);

    printArray(array);

   }
}