//number of seven's in 2d arrays
public class numberofsevens {
    public static int countNum(int matrix[][]){
        int count=0;
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[0].length; j++){
                if(matrix[i][j]==7){
                    count++;
                }

            }
        }

        return count;
    }
    public static void main(String args[]){
        int matrix[][]= { {4,7,8},{8,8,7} };
        System.out.println(countNum(matrix));
    }

    
}
