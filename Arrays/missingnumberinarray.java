public class missingnumberinarray {
    public static int missingNumber(int nums[]){
        int n= nums.length;
        int sum1= n *(n+1)/2;
        int sum2=0;
        for(int i=0; i< n-1; i++){
            sum2 += nums[i];
        }

        return sum1-sum2;
    }

    public static void main(String args[]){
        int nums[]={1,2,4};
        System.out.println(missingNumber(nums));
    }
}
