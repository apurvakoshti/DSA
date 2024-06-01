public class rotateimage {
    public static int[][] rotate(int matrix[][]){
        //transpose of matrix
        int n= matrix.length;
        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){
                int temp=matrix[i][j];
                matrix[i][j]= matrix[j][i];
                matrix[j][i]=temp;

            }
        }

        for(int i=0; i<n; i++){
            int start=0;
            int end= n-1;
            while(start < end){
                int temp=matrix[i][start];
                matrix[i][start]=matrix[i][end];
                matrix[i][end]=temp;
                start++;
                end--;
            }
        }

        return matrix;

    }

    public static void main(String args[]){
        int matrix[][]={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        rotateimage rm= new rotateimage();
        int result[][]=rotate(matrix);
       for(int i=0; i< result.length; i++){
        for(int j=0; j< result[0].length; j++){
            System.out.print(result[i][j]+" ");
        }
        System.out.println();
       }
    }
}
