package Arrays;

public class RatMazeProblem {

    public static boolean isSafe(int [][] maze, int x, int y){
        int size=maze.length;
        return (x>=0 && x<size&&y>=0 &&y<size && maze[x][y]==1);
    }

/*
*Time Complexity: O(2^(n^2)).
* The recursion can run upperbound 2^(n^2) times.
* Space Complexity: O(n^2).
* Output matrix is required so an extra space of size n*n is needed.
*
 */
    public static boolean solveMaze(int[][] maze){
        int[][] sol=new int[maze.length][maze.length];
        if(solveMazeUtil(maze,0,0,sol)==false){
            System.out.println("Solution doesn't exist");
            return false;
        }

        System.out.println("Solution array:");
        printArray(sol);
        return true;
    }

    private static boolean solveMazeUtil(int[][] maze, int x, int y, int[][] sol) {
        int N=maze.length;
        //Reached last element
        if(x==N-1&&y==N-1 && maze[x][y]==1)
            return true;
        if(isSafe(maze,x,y)){
            //Mark x,y in solution
            sol[x][y]=1;

            //move in x direction
            if(solveMazeUtil(maze,x+1,y,sol)){
                return true;
            }

            //else move in y direction
            if(solveMazeUtil(maze,x,y+1,sol)){
                return true;
            }

            //backtrack
             /* If none of the above movements works then
            BACKTRACK: unmark x, y as part of solution
            path */
            sol[x][y] = 0;
            return false;

        }
        return false;
    }

    static void printArray(int sol[][])
    {
        for (int i = 0; i < sol.length; i++) {
            for (int j = 0; j < sol.length; j++)
                System.out.print(
                        " " + sol[i][j] + " ");
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int maze[][] = { { 1, 0, 0, 0 },
                { 1, 1, 0, 1 },
                { 0, 1, 0, 0 },
                { 1, 1, 1, 1 } };
        solveMaze(maze);
    }
}
