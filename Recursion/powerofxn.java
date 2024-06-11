public class powerofxn {
    public static int power(int x, int n){
        if(n==0){
            return 1;
        }

        int xnm1= power(x, n-1);
        int p= x* power(x, n-1);
        return p;
    }
    public static void main(String args[]){
        int x=2;
        int n=10;
        System.out.println(power(x, n));

    }
}
