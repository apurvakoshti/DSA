public class arrayissortedornot {
    public static boolean isSorted(int numbers[]){
        for(int i=1; i< numbers.length; i++){
            if( numbers[i] < numbers[i-1]){
                return false;
            }
        }
        return true;
    }
    public static void main(String args[]){
        int numbers[]={1,2,3,4,5};
        System.out.println(isSorted(numbers));

    }
}
