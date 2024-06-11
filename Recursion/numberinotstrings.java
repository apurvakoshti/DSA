public class numberinotstrings {

    public static void print(int numbers){
        String digits[]={"zero","one","two","three","four","five","six","seven","eight","night"};
        if(numbers==0){
            return;
        }

        int lastDigit= numbers%10;
        print(numbers/10);
        System.out.print(digits[lastDigit]+" ");
    }
    public static void main(String args[]){
        int numbers=2345;
        print(numbers);
        
    }
}
