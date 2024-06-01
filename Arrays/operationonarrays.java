import java.util.Scanner;

public class operationonarrays {
    public static void main(String args[]){
        int marks[]=new int[100];
        System.out.println("Enter the marks: ");
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the marks for subject 1: ");
        marks[0]=sc.nextInt();
        System.out.println("Enter the marks for subject 2: ");
        marks[1]=sc.nextInt();
        System.out.println("Enter the marks for subject 3: ");
        marks[2]=sc.nextInt();

        System.out.println("physics: "+ marks[0]);
        System.out.println("chemistry: "+ marks[1]);
        System.out.println("Maths: "+ marks[2]);

        int percentage= (marks[0]+marks[1]+marks[2])/3;
        System.out.println("Percentage: "+ percentage+ "%");
        System.out.println("Length of array: "+ marks.length);

       // marks[2]=100;
       // System.out.println("Maths: "+ marks[2]);
    }
}
