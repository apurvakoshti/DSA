import java.util.*;
public class leftrotatethearraybydplaces {
    public static void reverse(int arr[], int start, int end){
        while (start <=end){
            int temp=arr[end];
            arr[end]=arr[start];
            arr[start]=temp;
            start++;
            end--;
        }
    }

    public static void leftRotate(int arr[], int d){
        int n= arr.length;
        d = d% n;
        reverse(arr, 0, d-1);
        reverse(arr, d, n-1);
        reverse(arr, 0, n-1);

    }
    public static void main(String args[]){
        int arr[]={1,2,3,4,5,6};
        int d=3;

        System.out.println("Before rotating: ");
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();

        leftRotate(arr, d);
        System.out.println("Fter rotating: ");
        for(int i=0 ; i< arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();


    }
}
