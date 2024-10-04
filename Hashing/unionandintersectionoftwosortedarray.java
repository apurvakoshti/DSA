public class unionandintersectionoftwosortedarray {
    public static void union(int arr1[], int arr2[]){
        int i=0;
        int j=0;
        System.out.print("Union: ");
        while( i<arr1.length && j<arr2.length){
            if(arr1[i]==arr2[j]){
                System.out.print(arr1[i]+" ");
                i++;
                j++;
            }
            else if( arr1[i]< arr2[j]){
                System.out.print(arr1[i]+" ");
                i++;
            }
            else{
                System.out.print(arr2[j]+" ");
                j++;
            }
        }

        while(i < arr1.length){
            System.out.print(arr1[i]+" ");
            i++;
        }

        while( j< arr2.length){
            System.out.print(arr2[j]+" ");
            j++;
        }
        System.out.println();
    }

    public static void intersection(int arr1[], int arr2[]){
        int i=0;
        int j=0;
        System.out.print("Intersection: ");
        while( i<arr1.length && j<arr2.length){
            if(arr1[i]==arr2[j]){
                System.out.print(arr1[i]+" ");
                i++;
                j++;
            }
            else if(arr1[i]< arr2[j]){
                i++;
            }
            else{
                j++;
            }

        }
        System.out.println();
    }
    public static void main(String args[]){
        int arr1[]={1,2,3,5,7,10};
        int arr2[]={2,3,6,7,8};
        union(arr1, arr2);
        intersection(arr1, arr2);
    }
}
