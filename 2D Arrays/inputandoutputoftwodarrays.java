import java.util.*;
public class inputandoutputoftwodarrays{
    public static void main(String args[]){
        int matrix[][]= new int[3][3];
        int n=matrix.length; int m=matrix[0].length;

        //to take input of matrix
        Scanner sc= new Scanner(System.in);
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                matrix[i][j]=sc.nextInt();
            }
        }

        //to display the matrix
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }

    }

}