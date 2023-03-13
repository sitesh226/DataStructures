package Arrays;


public class ArrayAntiDiagonals {

    private static void getAntiDiagonals(int[][] arr,int n){

        for(int i=0;i<n;i++) {

            int row=0;int col=i;
            while(col>=0){
                System.out.print(arr[row][col]+ "  ");
                row++;
                col--;
            }
            System.out.println();

        }


        for(int j=1;j<n;j++){
            int row=j;
            int col=n-1;
            while(row<n){
                System.out.print(arr[row][col]+ "  ");
                row++;
                col--;
            }
            System.out.println();
        }

    }




    public static void main(String[] args) {
        int M[][] = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10,11,12},
                {13,14,15,16},
        };

        getAntiDiagonals(M,4);
    }
}
