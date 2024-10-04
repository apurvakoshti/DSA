import java.util.*;
public class checksubset {
    public static boolean isSubset(int arr1[],int arr2[]){

        HashSet<Integer> set= new HashSet<>();

        for(int i=0; i<arr1.length; i++){
            set.add(arr1[i]);
        }

        for(int i=0;i<arr2.length; i++){
            if(!set.contains(arr2[i])){
                return false;
            }
        }

        return true;

    }
    public static void main(String args[]){
        int arr1[]={1,2,3,4,5};
        int arr2[]={6};
        System.out.println(isSubset(arr1, arr2));
    }
}
