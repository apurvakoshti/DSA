//using array
public class containsduplicates1 {
    public static boolean containsDuplicates(int arr[]){
        int n=arr.length;
        for(int i=0; i<n; i++){
            for(int j=i+1; j< n; j++){
                if(arr[i]==arr[j]){
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String args[]){
        int arr[]={1,2,3,1};
        System.out.println(containsDuplicates(arr));
    }
    
}
