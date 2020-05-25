package Arrays;
/*
*
* Given an infinite grid, initial cell position (x, y) and a sequence of other cell position which needs to be covered in the given order.
*  The task is to find the minimum number of steps needed to travel to all those cells.
 */

public class MinimumStepsInInfiniteGrid {

    static class Point{
        int x;
        int y;

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    private static int getShortestDistanceBetweenPoints(Point p1,Point p2){
        //dx is horizontal distance and dy is vertical distance
        int dx=Math.abs(p1.x-p2.x);
        int dy=Math.abs(p1.y-p2.y);
        return Math.max(dx,dy); //max of these is shortest path
    }

    private static int getTotalStepsInCOveringPoints(Point[] sequence){
        int stepsCount=0;
        for(int i=0;i<sequence.length-1;i++){
            stepsCount=stepsCount+getShortestDistanceBetweenPoints(sequence[i],sequence[i+1]);
        }

        return stepsCount;
    }

    public static void main(String args[])
    {
        // arr stores sequence of points
        // that are to be visited
        Point arr[] = new Point[4];
        arr[0] = new Point(4, 6);
        arr[1] = new Point(1, 2);
        arr[2] = new Point(4, 5);
        arr[3] = new Point(10, 12);
        System.out.print("Steps needed: "+getTotalStepsInCOveringPoints(arr));
    }
}
