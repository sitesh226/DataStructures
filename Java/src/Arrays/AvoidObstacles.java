package Arrays;

/*
We are given coordinates of obstacles on a straight line. We start jumping from point 0, we need to reach the end, avoiding all obstacles. The length of every jump has to be the same (For example, if we jump from 0 to 4, then we must make the next jump from 4 to 8). We need to find the minimum length of the jump so that we can reach the end and we avoid all obstacles.

Examples:

Input : obs[] = [5, 3, 6, 7, 9]
Output : 4
Obstacles are at points 3, 5, 6, 7 and 9
We jump from 0 to 4, then 4 to 8, then 4
to 12. This is how we reach end with jumps
of length 4. If we try lower jump lengths,
we cannot avoid all obstacles.

Input : obs[] = [5, 8, 9, 13, 14]
Output : 6
 */

import java.util.HashSet;

public class AvoidObstacles {

    static int avoidObstacles(int[] obs)
    {
        // Insert all array elements in a hash table
        // and find the maximum value in the array
        HashSet<Integer> hs = new HashSet<>();
        int max = obs[0];
        for (int i=0; i<obs.length; i++) {
            hs.add(obs[i]);
            max = Math.max(max, obs[i]);
        }

        // checking for every possible length which
        // yield us solution
        for (int i = 1; i <= max; i++) {
            int j;
            for (j = i; j <= max; j = j + i) {

                // if there is obstacle, break the loop.
                if (hs.contains(j))
                    break;
            }

            // If above loop did not break
            if (j > max)
                return i;
        }

        return max+1;
    }

    // Driver Code
    public static void main(String[] args)
    {
        int a[] = new int[] { 5, 3, 6, 7, 9 };
        int b = avoidObstacles(a);
        System.out.println("Max length jump :"+ b);
    }
}