// O(n) complexity
public class diagonalsum2 {

    public static int diagonalSum(int matrix[][]){
        int sum=0;

        for(int i=0; i<matrix.length; i++){
            //pd
            sum +=matrix[i][i];

            //sd
            if( i!= matrix.length-1-i){
            sum += matrix[i] [matrix.length-1-i];
            }
        }

        return sum;
    }
    public static void main(String args[]){
        int matrix[][]={ {0,1,2}, {3,4,5} ,{ 6,7,8}};

                         System.out.println(diagonalSum(matrix));
    }
}
