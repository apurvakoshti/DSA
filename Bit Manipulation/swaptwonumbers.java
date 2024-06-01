import java.util.*;

public class swaptwonumbers {

    public static void main(String args[]){
        int a= 3; int b=4;
        System.out.println("The original numbers are:"+ a + "," + b);
        a= a ^ b;
        b= a ^ b;
        a= a ^ b;
        System.out.println("The swapped number are:"+ a + "," + b);

    } 
}
