package Arrays;

public class SprialMatrix {

    static void spiralPrint(int endRowIndex, int endColIndex, int a[][])
    {
        int i, startRowIndex = 0, startColIndex = 0;

        /*  startRowIndex - starting row index
        endRowIndex - ending row index
        startColIndex - starting column index
        endColIndex - ending column index
        i - iterator
        */

        while (startRowIndex < endRowIndex && startColIndex < endColIndex) {
            // Print the first row from the remaining rows
            for (i = startColIndex; i < endColIndex; ++i) {
                System.out.print(a[startRowIndex][i] + " ");
            }
            startRowIndex++;

            // Print the last column from the remaining
            // columns
            for (i = startRowIndex; i < endRowIndex; ++i) {
                System.out.print(a[i][endColIndex - 1] + " ");
            }
            endColIndex--;

            // Print the last row from the remaining rows */
            if (startRowIndex < endRowIndex) {
                for (i = endColIndex - 1; i >= startColIndex; --i) {
                    System.out.print(a[endRowIndex - 1][i] + " ");
                }
                endRowIndex--;
            }

            // Print the first column from the remaining
            // columns */
            if (startColIndex < endColIndex) {
                for (i = endRowIndex - 1; i >= startRowIndex; --i) {
                    System.out.print(a[i][startColIndex] + " ");
                }
                startColIndex++;
            }
        }
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
        spiralPrint(arr.length, arr.length, arr);
    }



}
