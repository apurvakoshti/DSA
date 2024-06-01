// number is even or odd 
public class numberisoddoreven {

    public static void oddOrEven(int n){
        int bitmask=1;
        if(( n & bitmask)== 0){
            System.out.println("Even");
        }
        else {
            System.out.println("Odd");
        }
    }
    public static void main(String args[]){

        oddOrEven(3);
        oddOrEven(11);
        oddOrEven(8);
        oddOrEven(26);
        
    }
}
