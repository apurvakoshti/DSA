public class diagonaldiff {

    public static int diff(int matrix[][]){
        int primaryDiff=0;
        int secondaryDiff=0;

        for(int i=0; i<matrix.length; i++){

            //pd
            primaryDiff += matrix[i][i];

            //sd
            if( i!= matrix.length-1-i){
                secondaryDiff += matrix[i][matrix.length-1-i];
            }
            
        }

        return Math.abs( primaryDiff - secondaryDiff);
    }
    public static void main(String args[]){
        int matrix[][]={ {0,1,2}, {3,4,5} ,{ 6,7,8}};
        System.out.println(diff(matrix));

    }
}
