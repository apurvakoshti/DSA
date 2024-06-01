public class transposeofmatrix {
    public static int[][] transpose(int matrix[][]){

        int[][] transposed= new int[matrix.length][matrix[0].length];

                
        for(int i=0; i< matrix.length; i++){
            for(int j=0; j< matrix[0].length; j++){
                transposed[j][i] =matrix[i][j];
            }
        }

        return transposed;
    }
    public static void main(String args[]){
        int matrix[][]={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        int result[][]=transpose(matrix);
        for(int i=0; i< result.length; i++){
            for(int j=0; j< matrix[0].length; j++){
                System.out.print(result[i][j]+" ");
            }
            System.out.println();
        }
    }
}
