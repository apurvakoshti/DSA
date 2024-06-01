public class bubblesort{
    public static void bubbleSort(int arr[]){
        for(int i=0; i< arr.length-1; i++){
            for(int j=0; j< arr.length-1-i; j++){
                if(arr[j]> arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }

    public static void printArr(int arr[]){
        for(int i=0; i< arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String args[]){
        int arr[]={5,6,3,0,1};
        System.out.println("The given array is: ");
        for(int i=0; i<arr.length; i++){
            System.out.print(" "+arr[i]);
        }
        System.out.println();

        bubbleSort(arr);

        System.out.println("The sorted array is: ");
        printArr(arr);

    }
}