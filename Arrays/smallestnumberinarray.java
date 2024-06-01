public class smallestnumberinarray {
    public static int smallest(int numbers[]){
        int smallest= Integer.MAX_VALUE;
        for(int i=0; i<numbers.length; i++){
            if( smallest > numbers[i]){
                smallest= numbers[i];
            }
        }
        return smallest;
    }

    public static void main(String args[]){
        int numbers[]={5,20,45,10,56,87};
        System.out.println(smallest(numbers));

    }
}
