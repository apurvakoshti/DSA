public class immediatesmallerelement {
    public static void immediateSmallerElement(int arr[], int n){
        for(int i=0; i<n-1; i++){
            if(arr[i]>arr[i+1]){
                arr[i]=arr[i+1];
            }
            else{
                arr[i]=-1;
            }
        }

        arr[n-1]=-1;
    }

    public static void printArr(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String args[]){
        int arr[]={6,0,8,1,3};
        int n=5;
        printArr(arr);
        immediateSmallerElement(arr, n);
        printArr(arr);
    }
}
