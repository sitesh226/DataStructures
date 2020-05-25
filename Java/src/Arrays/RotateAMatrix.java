package Arrays;

public class RotateAMatrix {

    private static int[][] getTransposeOfMatrix(int[][] arr){

        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr[0].length;j++){
                int temp=arr[i][j];
                arr[i][j]=arr[j][i];
                arr[j][i]=temp;
            }
        }

        System.out.println("\nMatrix after transpose:");
        printMatrix(arr);
        return arr;

    }

    private static int[][] rotateInAntiClockWiseDirection(int[][] arr){
        getTransposeOfMatrix(arr);


        int j=arr.length-1;
        for(int i=0;i<arr.length/2;i++){
            int [] temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            j--;
        }

        System.out.println("Matrix after rotation by 90 anticlockwise");
        return arr;

    }


    private static int[][] rotateInClockWiseDirection(int[][] arr){
        getTransposeOfMatrix(arr);

        for(int i=0;i<arr.length;i++){
            arr[i]=reverseArray(arr[i]);
        }

        System.out.println("Matrix after rotation by 90 clockwise");
        return arr;
    }

    private static int[] reverseArray(int[] arrayRow){
        int j=arrayRow.length-1;
        for(int i=0;i<arrayRow.length/2;i++){
            int temp=arrayRow[i];
            arrayRow[i]=arrayRow[j];
            arrayRow[j]=temp;
            j--;
       }
        return arrayRow;
    }

    private static void printMatrix(int arr[][])
    {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length;
                 j++)
                System.out.print(arr[i][j] + "   ");
            System.out.println("");
        }
    }

    public static void main(String[] args)
    {
        int arr[][] = { { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 10, 11, 12 },
                { 13, 14, 15, 16 } };

        System.out.println("Given matrix: ");
        printMatrix(arr);
     //   rotateInAntiClockWiseDirection(arr);
        rotateInClockWiseDirection(arr);
        printMatrix(arr);

    }



}
