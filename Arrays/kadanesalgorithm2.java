public class kadanesalgorithm2 {
    public static void kadane(int arr[]) {
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            currSum += arr[i];
            // Update maxSum if currSum is greater
            if (maxSum < currSum) {
                maxSum = currSum;
            }
            // If currSum becomes less than 0, reset it to 0
            if (currSum < 0) {
                currSum = 0;
            }
        }
        System.out.println("MaxSum: " + maxSum);
    }

    public static void main(String args[]) {
        int arr[] = {-2, -3, -1, -2, -3};
        kadane(arr);
    }
}
