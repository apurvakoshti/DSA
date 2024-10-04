public class decimaltobinary {

    public static void reverse(String str){
        int start=0;
        int end= str.length()-1;

        char arr[]= str.toCharArray();

        while(start < end){
            char temp= arr[start];
            arr[start]=arr[end];
            arr[end]=temp;

            start++;
            end--;


        }

       String result = arr.toString();
        

    }

    public static String decimalToBinary(int n){
        String result="";
        while(n!=0){
            if(n%2==0){
                result += "0";
            }
            else{
                result += "1";
            }
            n=n/2;
        }

        reverse(result);
        return result;

    }
    public static void main(String args[]){
        int n=13;
        System.out.println(decimalToBinary(n));

    }
}


































