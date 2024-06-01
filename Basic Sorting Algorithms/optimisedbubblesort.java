public class optimisedbubblesort {
    public static int optimisedBubbleSort(int arr[]){
        int noPasses=0;
        for(int i=0; i< arr.length-1; i++){
            int flag=0;
            for(int j=0; j< arr.length-1-i; j++){
                if(arr[j]> arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    flag=1;
                }
            }
            noPasses++;
            if(flag==0){
                break;
            }
        }
        return noPasses;
    }
    public static void printArr(int arr[]){
        for(int i=0; i< arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String args[]){
        int arr[]={1,2,3,4,5};
        System.out.println(optimisedBubbleSort(arr));
        printArr(arr);
       
    }
    
}
