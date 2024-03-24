package Arrays;

public class MinimumJumpsRequiredToReachEnd {


    private static int getMinimumJumps(int[] arr){
        int jumps=1;
        int steps=arr[0];
        int maxReach=arr[0];

        for(int i=1;i<arr.length;i++){

            if(i==arr.length-1)
                return jumps;

            maxReach=Math.max(maxReach,i+arr[i]);

            steps--;
            //Check if the current index/position  or lesser index
            // is the maximum reach point from the previous indexes
            if(i>=maxReach)
                return -1;

            if(steps==0){
                jumps++;
               // steps=maxReach-i;
                steps=arr[i];
            }
        }

        return jumps;
    }



    public static  int getJumps2(int[] arr){
        // Use Greedy approach find maximum possible jump point at every step.

        int jumps=0;
        for(int i=0;i<arr.length;i++){
            jumps++;
            i=i+ getHighestPossibleJumpFromCurrent(i, arr);
        }

        return jumps;
    }

    public static int getHighestPossibleJumpFromCurrent(int current_index, int[] arr){
        int maxNum=arr[current_index];
        int endIndex=Math.max(arr[current_index], arr.length);

        for(int i= current_index+1; i<endIndex;i++){
           maxNum = Math.max(maxNum,arr[i]);
        }
        return maxNum;
    }


    public static void main(String[] args) {
        int [] arr={4,3,5,8,9,2,6,7,6,8,9};
       // int [] arr={ 6, 3, 1, 1, 4 };
//        System.out.println("Minimum jumps required:"+ getMinimumJumps(arr));
        System.out.println("Minimum jumps required:"+ getJumps2(arr));

    }
}
