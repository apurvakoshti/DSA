import java.util.*;
public class inbuiltsortusingcomparator {
    public static void printArr(Integer arr[]){
        for(int i=0; i< arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String args[]){
        Integer arr[]={5,3,4,2,1};
        Arrays.sort(arr, Collections.reverseOrder());
        //Arrays.sort(arr, 0, 3, Collections.reverseOrder());
        printArr(arr);

    }
}
