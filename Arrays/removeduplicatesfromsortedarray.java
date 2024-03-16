package Arrays;

public class removeduplicatesfromsortedarray {
    public static int removeDuplicates(int numbers[]){
        int i=0;
        for(int j=1; j< numbers.length; j++){
            if( numbers[i] != numbers[j]){
                numbers[i+1]= numbers[j];
                i++;
            }
        }
        return (i+1);
    }
    public static void main(String args[]){
        int numbers[]={1,1,1,2,2,2,3,3,3,4,4,4};
        System.out.println(removeDuplicates(numbers));

    }
}
