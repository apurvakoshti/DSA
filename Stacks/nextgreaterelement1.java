import java.util.*;
public class nextgreaterelement1 {
    public static long[] nextGreaterElementI(long arr[], int n){

        long nge[]=new long[n];
        Stack<Long> st= new Stack<>();

        for(int i=n-1; i>=0; i--){
            while(!st.isEmpty() && st.peek()<= arr[i]){
                st.pop();
            }

            if(st.isEmpty()){
                nge[i]=-1;
            }
            else{
                nge[i]=st.peek();
            }

            st.push(arr[i]);
        }

        return nge;


    }
    public static void main(String args[]){
        long arr[]={6,0,8,1,3};
        int n=5;
        long result[]=nextGreaterElementI(arr, n);
        for(int i=0; i<result.length; i++){
            System.out.print(result[i]+" ");
        }
        System.out.println();

    }
}
