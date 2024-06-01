public class secondlargestandsecondsmallestmix {
    public static int[] getSecondOrderElements(int n, int[] a) {

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            // Update largest and second largest
            if ( largest < a[i]) {
                secondLargest = largest;
                largest = a[i];
            } else if (largest > a[i] && a[i]> secondLargest) {
                secondLargest = a[i];
            }

            // Update smallest and second smallest
            if ( smallest > a[i]) {
                secondSmallest = smallest;
                smallest = a[i];
            } else if (smallest < a[i] && a[i]< secondSmallest) {
                secondSmallest = a[i];
            }
        }

        return new int[]{secondLargest, secondSmallest};
    }

    public static void main(String args[]){
        int a[]={1,2,4,7,5};
        int result[]= getSecondOrderElements(5, a);
        System.out.println("Secondlargest: "+ result[0] +" "+ "Secondsmallest: "+ result[1]);
    }
}
