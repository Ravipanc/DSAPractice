public class ArrayMultiplication {
    static int [][]MatrixMulti(int MatrixA[][],int MatrixB[][]){
        int rowA= MatrixA.length;
        int colA=MatrixA[0].length;
        int colB=MatrixB[0].length;
        int C[][]=new int[rowA][colB];
        for(int i=0;i<rowA;i++){
            for(int j=0;j<colA;j++){
                int sum=0;
                for(int k=0;k<colA;k++){
                    sum+=MatrixA[i][k]*MatrixB[k][j];
                }
                C[i][j]=sum;
            }
        }
        return C;
    }
    static void PrintMatrix(int matrix[][]){
        for(int i=0;i< matrix.length;i++){
            for(int j=0;j< matrix.length;j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void main(String args[]){

        int MatrixA[][]={{1,2,3},{4,5,6},{7,8,2}};
        int MatrixB[][]={{1,2,4},{1,4,5},{2,5,6}};

     int resultMatrix[][]=MatrixMulti(MatrixA,MatrixB);
     PrintMatrix(resultMatrix);
    }
}
