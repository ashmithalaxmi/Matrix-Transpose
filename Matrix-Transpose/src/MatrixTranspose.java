import java.util.Scanner;

public class MatrixTranspose {
    static int[][] transpose(int[][] A, int row, int col){
        int[][] arr= new int[col][row];
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                arr[j][i] =A[i][j];
            }
        }
        return arr;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int col = sc.nextInt();
        int[][] A = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                A[i][j] = sc.nextInt();
            }
        }

        A=transpose(A,row,col);
        for(int i=0;i<col;i++){
            for(int j=0;j<row;j++){
                System.out.print(A[i][j] + " ");
            }
            System.out.println();
        }

    }
}
