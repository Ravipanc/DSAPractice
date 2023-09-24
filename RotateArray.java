public class RotateArray {
    public static  void main(String []args){
        int Matrix[][] ={{1,2,3,4},
                {5,6,7,8},
                {9,10,11,12},
                {13,15,16,17},
        };
        int N=4;
        Transpose(Matrix,N);
        Reverse(Matrix,N);

        for(int i=0;i<N;i++){
            for(int j=0;j<N;j++){
                System.out.print(Matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
    static void Transpose(int [][]Matrix, int N) {

        for (int i = 0; i<N; i++) {
            for (int j = i; j<N; j++) {
                int temp = Matrix[i][j];
                Matrix[i][j] = Matrix[j][i];
                Matrix[j][i] = temp;
            }
        }
    }

    static  void Reverse(int [][]Matrix,int N){
        for(int i=0;i<N;i++){
            int left=0;
            int right= N-1;
            while(left<right){
                int temp=Matrix[i][left];
                Matrix[i][left]= Matrix[i][right];
                Matrix[i][right]=temp;
                left++;
                right--;
            }
        }
    }
}




