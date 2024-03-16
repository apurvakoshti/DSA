package Arrays;

public class secondsmallestinarray {
    public static int secondSmallest(int numbers[]){
        int smallest = numbers[0];
        int secondsmallest = Integer.MAX_VALUE;
        for(int i=1; i<numbers.length; i++){
            if ( numbers[i] < smallest){
                  secondsmallest= smallest;
                  smallest= numbers[i];
            }

            else if ( numbers[i] != smallest && numbers[i] < secondsmallest){
                secondsmallest= numbers[i];
            }
        }
        return secondsmallest;

    }
    public static void main( String args[]){
        int numbers[]={1,2,4,7,7,5};
        System.out.println(secondSmallest(numbers));
    }
}
