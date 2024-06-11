public class sumoffirstnnaturalnumbers {

    public static int printSum(int n){
        if(n==1){
            return 1;
        }
        int snm1= printSum(n-1);
        int sn= n + printSum(n-1);
        return sn;
    }
    public static void main(String args[]){
        int n=5;
        System.out.println(printSum(n));
    }
}
