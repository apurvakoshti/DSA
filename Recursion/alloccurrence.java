public class alloccurrence {

    public static void allOccurrence(int arr[], int key, int i){
        if(i==arr.length){
            return;

        }
        if(arr[i]==key){
            System.out.println(i+" ");
        }
         allOccurrence(arr, key, i+1);
    }
    public static void main(String args[]){
        int arr[]={2,6,8,3,2,1,8,2,4,2,1};
        int key=2;
        allOccurrence(arr, 2, 0);
    }
}
