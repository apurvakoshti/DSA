public class ispoweroffour {

    public static boolean isPowerOfFour(int n){
        if ( n > 0 && (n & (n-1))== 0 && (n-1)% 3 ==0 ){
            return true;
        }
        return false;

    }
    public static void main(String args[]){
        System.out.println(isPowerOfFour(4));
        System.out.println(isPowerOfFour(16));

    }
}
