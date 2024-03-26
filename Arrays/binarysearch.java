package Arrays;
// iterative 
public class binarysearch {
    public static int binarySearch(int numbers[], int key){
        int start=0;
        int end= numbers.length-1;
        while(start <=end){
            int mid=(start+end)/2;

            if(numbers[mid]==key){
                return mid;
            }
            if(numbers[mid] > key){
                end=mid-1;
            }
            else{
                start=mid+1;
            }


        }
        return -1;
    }
    public static void main(String args[]){
        int numbers[]={5,10,15,20,25};
        int key=10;
        System.out.println(binarySearch(numbers, key));
    }
}
