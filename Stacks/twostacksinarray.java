public class twostacksinarray {
    static class twoStacks{
        int arr[];
        int size;
        int top1, top2;


        twoStacks(int n){
            arr= new int[n];
            size = n;
            top1 = -1;
            top2 = size;

        }

        void push1(int x){
            if( top1 < top2 - 1){
                top1++;
                arr[top1] = x;    
            }
            else{
                System.out.println("Stack Overflow");
            }

        }

        void push2(int x){
            if( top1 < top2 - 1){
                top2--;
                arr[top2]= x;
            }
            else{
                System.out.println("Stack Overflow");
            }

        }

        int pop1(){
            if( top1 >=0 ){
                int x = arr[top1];
                top1--;
                return x;
            }
            else{
                System.out.println("Stack Underflow");
            }

            return 0;

        }

        int pop2(){
            if ( top2 < size){
                int x= arr[top2];
                top2++;
                return x;
            }
            else{
                System.out.println("Stack Underflow");
            }

            return 0;

        }

    }
    public static void main(String args[]){
        twoStacks ts= new twoStacks(6);
        ts.push1(1);
        ts.push1(2);
        ts.push2(3);
        ts.push2(4);

        System.out.println("Top of stack is: "+ ts.pop1());
        System.out.println("Top of stack is: "+ ts.pop2());




    }
    
}
