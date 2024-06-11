public class decreasingorder{
    public static void printDecrease(int n){
        if(n==1){
            System.out.print(""+n);
            return;
        }
        System.out.println(n);
        printDecrease(n-1);
    }
    public static void main(String args[]){
        int n=10;
        printDecrease(n);
    }
}