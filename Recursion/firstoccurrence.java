public class firstoccurrence {

    public static int firstOccurrence(int arr[], int key, int i){
        if(i==arr.length){
            return -1;
        }

        if(arr[i]==key){
            return i;
        }

        return firstOccurrence(arr, key, i+1);
    }
    public static void main(String args[]){
        int arr[]={8,3,6,9,5,10,2,5,3};
        int key=5;
        System.out.println(firstOccurrence(arr, key, 0));
    }
}
