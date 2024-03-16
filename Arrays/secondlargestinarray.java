package Arrays;

public class secondlargestinarray {

    public static int secondLargest(int numbers[]){
        int largest= numbers[0];
        int secondlargest= -1;
        for(int i=1; i< numbers.length; i++){
            if ( numbers[i] > largest){
                 secondlargest = largest;
                 largest = numbers[i];
            }
            else if ( numbers[i] < largest && numbers[i] > secondlargest){
                secondlargest=numbers[i];
            }
        }

        return secondlargest;

    }
    public static void main(String args[]){
        int numbers[]={1,2,4,7,7,5};
        System.out.println(secondLargest(numbers));
    }
}
