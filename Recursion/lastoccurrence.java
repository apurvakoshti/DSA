public class lastoccurrence {

    public  static int lastOccurrence(int arr[], int key, int i){
        if(i==arr.length){
            return -1;
        }

        int isFound= lastOccurrence(arr, key, i+1);
        if(isFound==-1 && arr[i]==key){
            return i;
        }

        return isFound;
    }
    public static void main(String args[]){
        int arr[]={8,3,6,9,5,10,2,5,3};
        int key=5;
        System.out.println(lastOccurrence(arr, key, 0));
    }
}
