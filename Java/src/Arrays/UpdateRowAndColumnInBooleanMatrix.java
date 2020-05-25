package Arrays;

import java.util.ArrayList;

/*
*Given a boolean matrix mat[M][N] of size M X N,
* modify it such that if a matrix cell mat[i][j] is 1 (or true) then make all the cells of ith row and jth column as 1.
*
 */
public class UpdateRowAndColumnInBooleanMatrix {
    private static int[][] updateRowAndColumnForEveryOne(int[][] arr){

        ArrayList<Integer> rows=new ArrayList<>();
        ArrayList<Integer> columns=new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                if(arr[i][j]==1){
                    rows.add(i);
                    columns.add(j);
                }
            }
        }

        for (int i:rows)
            updateRows(arr,i);

        for(int j:columns)
            updateColumns(arr,j);

        return arr;
    }

    private static void updateRows(int[][] arr, int row) {

        for(int i=0;i<arr.length;i++){
            arr[row][i]=1;
        }
    }


    private static void updateColumns(int[][] arr, int column) {

        for(int i=0;i<arr.length;i++){
            arr[i][column]=1;
        }
    }
    public static void printMatrix(int mat[ ][ ])
    {
        int i, j;
        for (i = 0; i < mat.length; i++)
        {
            for (j = 0; j < mat[0].length; j++)
            {
                System.out.print(mat[i][j]+ " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int mat[ ][ ] = { {1, 0, 0, 1},
                {0, 0, 1, 0},
                {0, 0, 0, 0},};
        System.out.println("Matrix initially: ");
        printMatrix(mat);
        System.out.println("Matrix after updation:");
        updateRowAndColumnForEveryOne(mat);
        printMatrix(mat);
    }


}
