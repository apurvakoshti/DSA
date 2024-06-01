public class printsubarrays {
    public static void subArrays(int numbers[], int n){
        int ts=0;
        for(int i=0; i< n; i++){
            int start=i;
            for(int j=i; j< n; j++){
                int end=j;
                for(int k=start; k<=end; k++){
                    System.out.print("|" + numbers[k]+" | ");
                    
                }
                ts++;
                System.out.println();
                
            }
            System.out.println();
            
        }
        System.out.print("Total number of subarrays: "+ts);
        


    }
    public static void main(String args[]){
        int numbers[]={1,2,3,4,5};
        int n=5;
        subArrays(numbers, n);

    }
}
