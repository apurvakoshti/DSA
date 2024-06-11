public class increasingorder {
    public static void printIncrease(int n){
        if(n==1){
            System.out.println(n);
            return;
        }else{
            printIncrease(n-1);
        }
        
        System.out.println(n);

    }
    public static void main(String args[]){
        int n=5;
        printIncrease(n);
    }
}
