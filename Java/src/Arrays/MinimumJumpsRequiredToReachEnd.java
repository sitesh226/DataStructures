package Arrays;

public class MinimumJumpsRequiredToReachEnd {


    private static int getMinimumJumps(int[] arr){

        // If array has only one element
        if (arr.length <= 1) {
            return 0;
        }

        // If first element is 0, cannot move anywhere
        if (arr[0] == 0) {
            return -1;
        }

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




    public static int minJumps(int[] arr) {
        if (arr.length <= 1) return 0;

        int jumps = 0;     // how many jumps taken
        int farthest = 0;  // farthest index we can reach so far
        int end = 0;       // end of current jump range

//        farthest → how far we can go
//        end → how far we’re allowed to go before jumping
//        When i == end → jump

        for (int i = 0; i < arr.length - 1; i++) {
            farthest = Math.max(farthest, i + arr[i]);

            if (i == end) {
                if (farthest == end)
                    return -1; // stuck
                jumps++;
                end = farthest;
            }
        }
        return jumps;
    }


    public static void main(String[] args) {
       // int [] arr={4,3,5,8,9,2,6,7,6,8,9};
       // int [] arr={ 2, 3, 1, 1, 4 };
        int [] arr={3,2,1,0,4};
        System.out.println("Minimum jumps required:"+ getMinimumJumps(arr));
      //  System.out.println("Minimum jumps required:"+ minJumps(arr));

    }
}
