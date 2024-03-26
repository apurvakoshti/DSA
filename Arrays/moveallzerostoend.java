package Arrays;

public class moveallzerostoend {
    public static void moveZeroes(int nums[]){
        int j=-1;
        for(int i=0; i< nums.length;i++){
            if(nums[i]==0){
                j=i;
                break;
            }
        }

        if(j==-1){
            return;
        }

        for(int i=j+1; i<nums.length; i++){
            if(nums[i]!=0){
                int temp=nums[i];
                nums[i]=nums[j];
                nums[j]=temp;
                j++;
            }
        }
    }
    public static void main(String args[]){
        int nums[]={1,2,0,0,3,5,0,0,4};
        moveZeroes(nums);
        for(int i=0; i< nums.length; i++){
            System.out.print(nums[i]+" ");
        }
        System.out.println();
    }
}
