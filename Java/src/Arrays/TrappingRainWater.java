package Arrays;

public class TrappingRainWater {

    private static int getTrappedRainWater(int[] input){
        int result=0;
        if(input==null||input.length<=2)
            return result;


        int[] left=new int[input.length];
        int[] right=new int[input.length];

        // Create an array which stores max left value before the current element
        int max=input[0];
        left[0]=max;
        for (int i=1;i<input.length;i++){
            if(input[i]<max)
                left[i]=max;
            else{
                max=input[i];
                left[i]=input[i];
            }
        }
  // Create an array which stores max right value after the current element
        max=input[input.length-1];
        right[right.length-1]=max;
        for (int i=input.length-2;i>=0;i--){
            if(input[i]<max)
                right[i]=max;
            else{
                max=input[i];
                right[i]=input[i];
            }
        }


        // Stored water = minimum(MaxLeft,MaxRight)-currentElement
        for(int i=0;i<input.length;i++){
            result+=Math.min(left[i],right[i])-input[i];
        }

        return result;
    }

    public static void main(String[] args) {
        int arr[] = { 0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1 };
        System.out.println("Max water that can be trapped:"+getTrappedRainWater(arr));
    }
}
