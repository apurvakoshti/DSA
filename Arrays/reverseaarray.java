public class reverseaarray {

    public static void reverse(int numbers[]){
        int start=0;
        int end= numbers.length-1;
        while( start < end){
            int temp= numbers[end];
            numbers[end]= numbers[start];
            numbers[start]= temp;

            start++;
            end--;
        }

    }
    public static void main(String args[]){
        int numbers[]={9,2,6,3,8,5,1,7};
        reverse(numbers);
        for(int i=0; i< numbers.length; i++){
            System.out.print(numbers[i]+" ");
        }
        System.out.println();
        
    }
}
