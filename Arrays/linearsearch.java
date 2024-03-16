package Arrays;

public class linearsearch {
    public static int linearSearch(int numbers[], int key){
        for(int i=0; i<numbers.length; i++){
            if(numbers[i]==key){
                return i;
            }
        }
        return -1;

    }
    public static void main(String args[]){
        int numbers[]={2,5,9,10,45};
        int key= 45;
        System.out.println(linearSearch(numbers, key));

    }
}
