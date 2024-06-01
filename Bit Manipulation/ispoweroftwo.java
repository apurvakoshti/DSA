public class ispoweroftwo {

    public static boolean powerofTow(int n){
        if( (n & n-1 )==0){
            return true;
        }
        return false;
    }
    public static void main(String args[]){
        System.out.println(powerofTow(4));
        System.out.println(powerofTow(7));

    }
}
