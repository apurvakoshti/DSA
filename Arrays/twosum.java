package Arrays;

public class twosum {
    public static int[] twoSum(int nums[], int target){
        for(int i=0; i< nums.length;i++){
            for(int j=i+1; j< nums.length; j++){
                if(nums[i]+nums[j]==target){
                    return new int[]{i,j};
                }
            }
        }
        return new int[0];

    }
    public static void main(String args[]){
        int nums[]={1,2,3,4,5,6};
        int target=10;
       twosum sol= new twosum();
       int result[]=sol.twoSum(nums, target);
        for(int i=0; i< result.length; i++){
            System.out.println(result[i]);
        }
        System.out.println();
    }
}
