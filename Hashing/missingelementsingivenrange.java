import java.util.*;
public class missingelementsingivenrange {
    public static void missingNumberInRange(int arr[],int low, int high){

        HashSet<Integer> set= new HashSet<>();

        for(int i=0; i<arr.length; i++){
            set.add(arr[i]);

        }
            
        for(int j=low; j<=high; j++){
            if(!set.contains(j)){
                System.out.print(j+" ");
            }
        }
        
    }

    public static void main(String args[]){
        int arr[]={10,11,12,15};
        int low=10;
        int high=15;
        missingNumberInRange(arr, low, high);
    }
}
