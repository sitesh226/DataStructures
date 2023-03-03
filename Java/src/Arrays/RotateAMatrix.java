package Arrays;

public class RotateAMatrix {

    private static int[][] getTransposeOfMatrix(int[][] arr) {

        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr[0].length; j++) {
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }

        System.out.println("\nMatrix after transpose:");
        printMatrix(arr);
        return arr;

    }

    private static int[][] rotateInAntiClockWiseDirection(int[][] arr) {
        arr=getTransposeOfMatrix(arr);
        for (int i = 0; i < arr.length ; i++) {
            int j = 0;//Start of any column
            int k = arr.length-1 ; //end of any column
            //swap elements in columns
            while (j < k) {
                int temp = arr[j][i];
                arr[j][i] = arr[k][i];
                arr[k][i] = temp;

                j++;
                k--;
            }
        }
        System.out.println("Matrix after rotation by 90  anti clockwise");
        return arr;

    }


    private static int[][] rotateInClockWiseDirection(int[][] arr) {
        arr=getTransposeOfMatrix(arr);

        for (int i = 0; i < arr.length ; i++) {
            int j = 0;//Start of any row
            int k = arr.length-1 ; //end of any row
            //swap elements in row
            while (j < k) {
                int temp = arr[i][j];
                arr[i][j] = arr[i][k];
                arr[i][k] = temp;

                j++;
                k--;
            }
        }
        System.out.println("Matrix after rotation by 90 clockwise");
        return arr;
    }

    private static int[][] reverseArray(int[][] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int j = 0;//Start of any row
            int k = arr.length - 1; //end of any row
            //swap elements in row
            while (j <= k) {
                int temp = arr[i][j];
                arr[i][j] = arr[i][k];
                arr[i][k] = temp;

                j++;
                k--;
            }
        }
        return arr;
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
        rotateInAntiClockWiseDirection(arr);
     //   rotateInClockWiseDirection(arr);
        printMatrix(arr);

    }



}
