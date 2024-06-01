// having time complexity - O(n^3)
import java.util.*;
public class maximumproductsubarray{
    public static void maxProductSubarray(int numbers[], int n){
        
        int maxProduct= Integer.MIN_VALUE;
        for(int i=0; i< n; i++){
            int product=1;
            int start=i;
            for(int j=i; j<n ;j++){
                int end=j;
                for(int k=start; k<=end; k++){
                    product= product * numbers[k];
                }
                maxProduct= Math.max(maxProduct, product);
            }
           
        }
        System.out.println("maxProduct is: "+ maxProduct);
    
    }
    public static void main(String args[]){
        int numbers[]={1,2,3,4,5};
        int n=5;
        maxProductSubarray(numbers, n);
        
    }
}