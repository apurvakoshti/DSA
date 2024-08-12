import java.util.*;
public class nextgreaterelement2 {
    public static long[] nextGreaterElementII(long arr[], int n){

        long nge[]=new long[n];
        Stack<Long> st= new Stack<>();
        
        for(int i=2*n-1; i>=0; i--){
            while(!st.isEmpty() && st.peek()<= arr[i%n]){
                st.pop();
            }

            if(i<n){
                if(st.isEmpty()){
                    nge[i]=-1;
                }
                else{
                    nge[i]=st.peek();
                }
            }

            st.push(arr[i%n]);
        }
        return nge;
    }
    public static void main(String args[]){
        long arr[]={6,8,0,1,3};
        int n=5;
        long result[]= nextGreaterElementII(arr, n);
        for(int i=0; i<result.length; i++){
            System.out.print(result[i]+" ");
        }
        System.out.println();
    }
}
