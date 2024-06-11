public class fibonaccinumber {
    public static int fib(int n){
        //base case
        if(n==0 || n==1){
            return n;
        }
        int fnm1= fib(n-1);
        int fnm2= fib(n-2);
        int fn= fnm1+ fnm2;
        return fn;
    }
    public static void main(String args[]){
        int n=6;
        System.out.println(fib(n));
    }
}
